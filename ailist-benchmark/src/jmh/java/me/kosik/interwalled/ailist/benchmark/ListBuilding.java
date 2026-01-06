package me.kosik.interwalled.ailist.benchmark;

import me.kosik.interwalled.ailist.AIList;
import me.kosik.interwalled.ailist.AIListBuilder;
import me.kosik.interwalled.ailist.data.AIListConfiguration;
import me.kosik.interwalled.ailist.data.Interval;
import org.openjdk.jmh.annotations.*;
import org.openjdk.jmh.infra.Blackhole;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;


@BenchmarkMode(Mode.AverageTime)
@OutputTimeUnit(TimeUnit.SECONDS)
@Warmup(iterations = 5, time = 1, timeUnit = TimeUnit.SECONDS)
@Measurement(iterations = 20, time = 1, timeUnit = TimeUnit.SECONDS)
@Fork(1)
@State(Scope.Benchmark)
public class ListBuilding {
    @Param({
            "consecutiveIntervals",
            "overlappingIntervals",
            "lastingIntervals",
            "shortPoissonIntervals",
            "mixed1Intervals",
            "mixed2Intervals",
            "mixed3Intervals",
            "mixed4Intervals"
    })
    public String dataSource;

    @Param({
            "128000",
            "256000",
            "512000"
    })
    public String rowsCountStr;

    private final Map<String, ArrayList<Interval<String>>> dataSources = new HashMap<>();

    @Setup
    public void setup() {
        final int rowsCount = Integer.parseInt(rowsCountStr);

        dataSources.put("consecutiveIntervals",     DataGenerator.consecutive(rowsCount));
        dataSources.put("overlappingIntervals",     DataGenerator.overlapping(rowsCount));
        dataSources.put("lastingIntervals",         DataGenerator.lasting(rowsCount));
        dataSources.put("shortPoissonIntervals",    DataGenerator.shortPoisson(rowsCount));
        dataSources.put("mixed1Intervals",          DataGenerator.mixed(rowsCount, 1));
        dataSources.put("mixed2Intervals",          DataGenerator.mixed(rowsCount / 2, 2));
        dataSources.put("mixed3Intervals",          DataGenerator.mixed(rowsCount / 3, 3));
        dataSources.put("mixed4Intervals",          DataGenerator.mixed(rowsCount / 4, 4));
    }

    @Benchmark
    public void benchmarkBulkLoad(final Blackhole blackhole) {
        AIListBuilder<String> aiListBuilder =
                new AIListBuilder<>(AIListConfiguration.DEFAULT, dataSources.get(dataSource));

        AIList<String> aiList = aiListBuilder.build();
        blackhole.consume(aiList);
    }

    @Benchmark
    public void benchmarkIterativeLoad(final Blackhole blackhole) {
        AIListBuilder<String> aiListBuilder =
                new AIListBuilder<>(AIListConfiguration.DEFAULT);

        for(Interval<String> interval : dataSources.get(dataSource))
            aiListBuilder.put(interval);

        AIList<String> aiList = aiListBuilder.build();
        blackhole.consume(aiList);
    }
}

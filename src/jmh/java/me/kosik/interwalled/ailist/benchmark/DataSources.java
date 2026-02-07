package me.kosik.interwalled.ailist.benchmark;

import me.kosik.interwalled.ailist.DataGenerator;
import me.kosik.interwalled.ailist.model.Interval;

import java.util.ArrayList;
import java.util.Map;

public class DataSources {

    public static void initializeDatabaseSources(final int databaseRowsCount, final Map<String, ArrayList<Interval<String>>> databaseSources) {
        databaseSources.put("consecutiveIntervals",     DataGenerator.consecutive(databaseRowsCount));
        databaseSources.put("overlappingIntervals",     DataGenerator.overlapping(databaseRowsCount));
        databaseSources.put("lastingIntervals",         DataGenerator.lasting(databaseRowsCount));
        databaseSources.put("shortPoissonIntervals",    DataGenerator.shortPoisson(databaseRowsCount));
        databaseSources.put("mixed1Intervals",          DataGenerator.mixed(databaseRowsCount, 1));
        databaseSources.put("mixed2Intervals",          DataGenerator.mixed(databaseRowsCount / 2, 2));
        databaseSources.put("mixed3Intervals",          DataGenerator.mixed(databaseRowsCount / 3, 3));
        databaseSources.put("mixed4Intervals",          DataGenerator.mixed(databaseRowsCount / 4, 4));
    }

    public static void initializeDatabaseSources(final String databaseRowsCount, final Map<String, ArrayList<Interval<String>>> databaseSources) {
        initializeDatabaseSources(Integer.parseInt(databaseRowsCount), databaseSources);
    }


    public static void initializeQuerySources(final int databaseRowsCount, final int queryRowsCount, final Map<String, ArrayList<Interval<String>>> querySources) {
        querySources.put("querySparse", DataGenerator.querySparse(queryRowsCount, databaseRowsCount));
        querySources.put("queryDense",  DataGenerator.queryDense(queryRowsCount, databaseRowsCount));
    }

    public static void initializeQuerySources(final String databaseRowsCount, final String queryRowsCount, final Map<String, ArrayList<Interval<String>>> querySources) {
        initializeQuerySources(Integer.parseInt(databaseRowsCount), Integer.parseInt(queryRowsCount), querySources);
    }
}



## Benchmarking

```

ListBuilding.benchmarkBulkLoad             consecutiveIntervals  avgt   20   0.102 ± 0.011   s/op
ListBuilding.benchmarkIterativeLoad        consecutiveIntervals  avgt   20   0.085 ± 0.011   s/op

ListBuilding.benchmarkBulkLoad             overlappingIntervals  avgt   20   0.123 ± 0.024   s/op
ListBuilding.benchmarkIterativeLoad        overlappingIntervals  avgt   20   0.101 ± 0.008   s/op

ListBuilding.benchmarkBulkLoad                 lastingIntervals  avgt   20   0.075 ± 0.009   s/op
ListBuilding.benchmarkIterativeLoad            lastingIntervals  avgt   20   0.151 ± 0.020   s/op

ListBuilding.benchmarkBulkLoad            shortPoissonIntervals  avgt   20   0.068 ± 0.007   s/op
ListBuilding.benchmarkIterativeLoad       shortPoissonIntervals  avgt   20   0.120 ± 0.019   s/op

ListBuilding.benchmarkBulkLoad                  mixed1Intervals  avgt   20   0.123 ± 0.019   s/op
ListBuilding.benchmarkIterativeLoad             mixed1Intervals  avgt   20   0.156 ± 0.017   s/op

ListBuilding.benchmarkBulkLoad                  mixed2Intervals  avgt   20   2.236 ± 0.220   s/op
ListBuilding.benchmarkIterativeLoad             mixed2Intervals  avgt   20   1.403 ± 0.079   s/op

ListBuilding.benchmarkBulkLoad                  mixed3Intervals  avgt   20   5.394 ± 0.096   s/op
ListBuilding.benchmarkIterativeLoad             mixed3Intervals  avgt   20   5.718 ± 0.109   s/op

ListBuilding.benchmarkBulkLoad                  mixed4Intervals  avgt   20  14.465 ± 5.856   s/op
ListBuilding.benchmarkIterativeLoad             mixed4Intervals  avgt   20   5.173 ± 0.250   s/op
```
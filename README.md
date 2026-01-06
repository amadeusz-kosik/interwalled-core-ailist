

## Benchmarking

### ListBuilding
List building benchmark, to pick the correct way to load the data into AIListBuilder.
```
Benchmark                                     (dataSource)  (rowsCountStr)  Mode  Cnt  Score    Error  Units
ListBuilding.benchmarkBulkLoad        consecutiveIntervals          128000  avgt   20  0.002 ±  0.001   s/op
ListBuilding.benchmarkIterativeLoad   consecutiveIntervals          128000  avgt   20  0.003 ±  0.001   s/op

ListBuilding.benchmarkBulkLoad        consecutiveIntervals          256000  avgt   20  0.007 ±  0.001   s/op
ListBuilding.benchmarkIterativeLoad   consecutiveIntervals          256000  avgt   20  0.010 ±  0.001   s/op

ListBuilding.benchmarkBulkLoad        consecutiveIntervals          512000  avgt   20  0.018 ±  0.001   s/op
ListBuilding.benchmarkIterativeLoad   consecutiveIntervals          512000  avgt   20  0.022 ±  0.001   s/op

ListBuilding.benchmarkBulkLoad        overlappingIntervals          128000  avgt   20  0.002 ±  0.001   s/op
ListBuilding.benchmarkIterativeLoad   overlappingIntervals          128000  avgt   20  0.003 ±  0.001   s/op

ListBuilding.benchmarkBulkLoad        overlappingIntervals          256000  avgt   20  0.007 ±  0.001   s/op
ListBuilding.benchmarkIterativeLoad   overlappingIntervals          256000  avgt   20  0.009 ±  0.001   s/op

ListBuilding.benchmarkBulkLoad        overlappingIntervals          512000  avgt   20  0.017 ±  0.001   s/op
ListBuilding.benchmarkIterativeLoad   overlappingIntervals          512000  avgt   20  0.023 ±  0.001   s/op

ListBuilding.benchmarkBulkLoad            lastingIntervals          128000  avgt   20  0.003 ±  0.001   s/op
ListBuilding.benchmarkIterativeLoad       lastingIntervals          128000  avgt   20  0.003 ±  0.001   s/op

ListBuilding.benchmarkBulkLoad            lastingIntervals          256000  avgt   20  0.007 ±  0.001   s/op
ListBuilding.benchmarkIterativeLoad       lastingIntervals          256000  avgt   20  0.010 ±  0.001   s/op

ListBuilding.benchmarkBulkLoad            lastingIntervals          512000  avgt   20  0.016 ±  0.001   s/op
ListBuilding.benchmarkIterativeLoad       lastingIntervals          512000  avgt   20  0.022 ±  0.001   s/op

ListBuilding.benchmarkBulkLoad       shortPoissonIntervals          128000  avgt   20  0.002 ±  0.001   s/op
ListBuilding.benchmarkIterativeLoad  shortPoissonIntervals          128000  avgt   20  0.003 ±  0.001   s/op

ListBuilding.benchmarkBulkLoad       shortPoissonIntervals          256000  avgt   20  0.007 ±  0.001   s/op
ListBuilding.benchmarkIterativeLoad  shortPoissonIntervals          256000  avgt   20  0.009 ±  0.001   s/op

ListBuilding.benchmarkBulkLoad       shortPoissonIntervals          512000  avgt   20  0.017 ±  0.001   s/op
ListBuilding.benchmarkIterativeLoad  shortPoissonIntervals          512000  avgt   20  0.022 ±  0.001   s/op

ListBuilding.benchmarkBulkLoad             mixed1Intervals          128000  avgt   20  0.002 ±  0.001   s/op
ListBuilding.benchmarkIterativeLoad        mixed1Intervals          128000  avgt   20  0.003 ±  0.001   s/op

ListBuilding.benchmarkBulkLoad             mixed1Intervals          256000  avgt   20  0.006 ±  0.001   s/op
ListBuilding.benchmarkIterativeLoad        mixed1Intervals          256000  avgt   20  0.009 ±  0.001   s/op

ListBuilding.benchmarkBulkLoad             mixed1Intervals          512000  avgt   20  0.016 ±  0.001   s/op
ListBuilding.benchmarkIterativeLoad        mixed1Intervals          512000  avgt   20  0.021 ±  0.001   s/op

ListBuilding.benchmarkBulkLoad             mixed2Intervals          128000  avgt   20  0.041 ±  0.001   s/op
ListBuilding.benchmarkIterativeLoad        mixed2Intervals          128000  avgt   20  0.043 ±  0.001   s/op

ListBuilding.benchmarkBulkLoad             mixed2Intervals          256000  avgt   20  0.170 ±  0.003   s/op
ListBuilding.benchmarkIterativeLoad        mixed2Intervals          256000  avgt   20  0.173 ±  0.002   s/op

ListBuilding.benchmarkBulkLoad             mixed2Intervals          512000  avgt   20  0.652 ±  0.002   s/op
ListBuilding.benchmarkIterativeLoad        mixed2Intervals          512000  avgt   20  0.668 ±  0.008   s/op

ListBuilding.benchmarkBulkLoad             mixed3Intervals          128000  avgt   20  0.164 ±  0.003   s/op
ListBuilding.benchmarkIterativeLoad        mixed3Intervals          128000  avgt   20  0.168 ±  0.002   s/op

ListBuilding.benchmarkBulkLoad             mixed3Intervals          256000  avgt   20  0.679 ±  0.009   s/op
ListBuilding.benchmarkIterativeLoad        mixed3Intervals          256000  avgt   20  0.685 ±  0.009   s/op

ListBuilding.benchmarkBulkLoad             mixed3Intervals          512000  avgt   20  2.791 ±  0.046   s/op
ListBuilding.benchmarkIterativeLoad        mixed3Intervals          512000  avgt   20  2.782 ±  0.071   s/op

ListBuilding.benchmarkBulkLoad             mixed4Intervals          128000  avgt   20  0.141 ±  0.003   s/op
ListBuilding.benchmarkIterativeLoad        mixed4Intervals          128000  avgt   20  0.137 ±  0.003   s/op

ListBuilding.benchmarkBulkLoad             mixed4Intervals          256000  avgt   20  0.579 ±  0.007   s/op
ListBuilding.benchmarkIterativeLoad        mixed4Intervals          256000  avgt   20  0.564 ±  0.008   s/op

ListBuilding.benchmarkBulkLoad             mixed4Intervals          512000  avgt   20  2.243 ±  0.026   s/op
ListBuilding.benchmarkIterativeLoad        mixed4Intervals          512000  avgt   20  2.272 ±  0.032   s/op
```

### ListDataStructure

Using ArrayList:
```
Benchmark                         (dataRowsCountStr)           (dataSource)  (queryRowsCountStr)  (querySource)  Mode  Cnt   Score    Error  Units
ListDataStructure.benchmarkQuery              128000   consecutiveIntervals                16000    querySparse  avgt   20   0.548 ±  0.029   s/op
ListDataStructure.benchmarkQuery              128000   consecutiveIntervals                16000     queryDense  avgt   20   0.591 ±  0.037   s/op
ListDataStructure.benchmarkQuery              128000   consecutiveIntervals                32000    querySparse  avgt   20   2.374 ±  0.129   s/op
ListDataStructure.benchmarkQuery              128000   consecutiveIntervals                32000     queryDense  avgt   20   2.740 ±  0.088   s/op
ListDataStructure.benchmarkQuery              128000   consecutiveIntervals                64000    querySparse  avgt   20   7.125 ±  0.209   s/op
ListDataStructure.benchmarkQuery              128000   consecutiveIntervals                64000     queryDense  avgt   20   6.444 ±  0.131   s/op
ListDataStructure.benchmarkQuery              128000   overlappingIntervals                16000    querySparse  avgt   20   0.534 ±  0.009   s/op
ListDataStructure.benchmarkQuery              128000   overlappingIntervals                16000     queryDense  avgt   20   0.549 ±  0.011   s/op
ListDataStructure.benchmarkQuery              128000   overlappingIntervals                32000    querySparse  avgt   20   1.452 ±  0.014   s/op
ListDataStructure.benchmarkQuery              128000   overlappingIntervals                32000     queryDense  avgt   20   1.516 ±  0.052   s/op
ListDataStructure.benchmarkQuery              128000   overlappingIntervals                64000    querySparse  avgt   20   4.752 ±  0.036   s/op
ListDataStructure.benchmarkQuery              128000   overlappingIntervals                64000     queryDense  avgt   20   5.982 ±  0.037   s/op
ListDataStructure.benchmarkQuery              128000       lastingIntervals                16000    querySparse  avgt   20   0.004 ±  0.001   s/op
ListDataStructure.benchmarkQuery              128000       lastingIntervals                16000     queryDense  avgt   20   0.005 ±  0.001   s/op
ListDataStructure.benchmarkQuery              128000       lastingIntervals                32000    querySparse  avgt   20   0.006 ±  0.001   s/op
ListDataStructure.benchmarkQuery              128000       lastingIntervals                32000     queryDense  avgt   20   0.007 ±  0.001   s/op
ListDataStructure.benchmarkQuery              128000       lastingIntervals                64000    querySparse  avgt   20   0.016 ±  0.001   s/op
ListDataStructure.benchmarkQuery              128000       lastingIntervals                64000     queryDense  avgt   20   0.014 ±  0.001   s/op
ListDataStructure.benchmarkQuery              128000  shortPoissonIntervals                16000    querySparse  avgt   20   0.051 ±  0.001   s/op
ListDataStructure.benchmarkQuery              128000  shortPoissonIntervals                16000     queryDense  avgt   20   0.036 ±  0.001   s/op
ListDataStructure.benchmarkQuery              128000  shortPoissonIntervals                32000    querySparse  avgt   20   0.191 ±  0.003   s/op
ListDataStructure.benchmarkQuery              128000  shortPoissonIntervals                32000     queryDense  avgt   20   0.124 ±  0.002   s/op
ListDataStructure.benchmarkQuery              128000  shortPoissonIntervals                64000    querySparse  avgt   20   0.733 ±  0.015   s/op
ListDataStructure.benchmarkQuery              128000  shortPoissonIntervals                64000     queryDense  avgt   20   0.738 ±  0.027   s/op
ListDataStructure.benchmarkQuery              128000        mixed1Intervals                16000    querySparse  avgt   20   0.306 ±  0.027   s/op
ListDataStructure.benchmarkQuery              128000        mixed1Intervals                16000     queryDense  avgt   20   0.254 ±  0.002   s/op
ListDataStructure.benchmarkQuery              128000        mixed1Intervals                32000    querySparse  avgt   20   1.066 ±  0.017   s/op
ListDataStructure.benchmarkQuery              128000        mixed1Intervals                32000     queryDense  avgt   20   1.103 ±  0.017   s/op
ListDataStructure.benchmarkQuery              128000        mixed1Intervals                64000    querySparse  avgt   20   4.269 ±  0.048   s/op
ListDataStructure.benchmarkQuery              128000        mixed1Intervals                64000     queryDense  avgt   20   3.031 ±  0.032   s/op
ListDataStructure.benchmarkQuery              128000        mixed2Intervals                16000    querySparse  avgt   20   0.748 ±  0.008   s/op
ListDataStructure.benchmarkQuery              128000        mixed2Intervals                16000     queryDense  avgt   20   0.847 ±  0.010   s/op
ListDataStructure.benchmarkQuery              128000        mixed2Intervals                32000    querySparse  avgt   20   1.570 ±  0.021   s/op
ListDataStructure.benchmarkQuery              128000        mixed2Intervals                32000     queryDense  avgt   20   2.534 ±  0.032   s/op
ListDataStructure.benchmarkQuery              128000        mixed2Intervals                64000    querySparse  avgt   20   5.915 ±  0.064   s/op
ListDataStructure.benchmarkQuery              128000        mixed2Intervals                64000     queryDense  avgt   20   7.728 ±  0.056   s/op
ListDataStructure.benchmarkQuery              128000        mixed3Intervals                16000    querySparse  avgt   20   0.937 ±  0.010   s/op
ListDataStructure.benchmarkQuery              128000        mixed3Intervals                16000     queryDense  avgt   20   1.013 ±  0.015   s/op
ListDataStructure.benchmarkQuery              128000        mixed3Intervals                32000    querySparse  avgt   20   2.482 ±  0.026   s/op
ListDataStructure.benchmarkQuery              128000        mixed3Intervals                32000     queryDense  avgt   20   2.236 ±  0.019   s/op
ListDataStructure.benchmarkQuery              128000        mixed3Intervals                64000    querySparse  avgt   20   6.627 ±  0.365   s/op
ListDataStructure.benchmarkQuery              128000        mixed3Intervals                64000     queryDense  avgt   20   6.672 ±  0.093   s/op
ListDataStructure.benchmarkQuery              128000        mixed4Intervals                16000    querySparse  avgt   20   0.991 ±  0.017   s/op
ListDataStructure.benchmarkQuery              128000        mixed4Intervals                16000     queryDense  avgt   20   1.020 ±  0.023   s/op
ListDataStructure.benchmarkQuery              128000        mixed4Intervals                32000    querySparse  avgt   20   2.515 ±  0.044   s/op
ListDataStructure.benchmarkQuery              128000        mixed4Intervals                32000     queryDense  avgt   20   2.536 ±  0.063   s/op
ListDataStructure.benchmarkQuery              128000        mixed4Intervals                64000    querySparse  avgt   20   7.295 ±  0.184   s/op
ListDataStructure.benchmarkQuery              128000        mixed4Intervals                64000     queryDense  avgt   20   7.050 ±  0.074   s/op
ListDataStructure.benchmarkQuery              256000   consecutiveIntervals                16000    querySparse  avgt   20   0.869 ±  0.007   s/op
ListDataStructure.benchmarkQuery              256000   consecutiveIntervals                16000     queryDense  avgt   20   0.885 ±  0.008   s/op
ListDataStructure.benchmarkQuery              256000   consecutiveIntervals                32000    querySparse  avgt   20   2.213 ±  0.040   s/op
ListDataStructure.benchmarkQuery              256000   consecutiveIntervals                32000     queryDense  avgt   20   2.165 ±  0.019   s/op
ListDataStructure.benchmarkQuery              256000   consecutiveIntervals                64000    querySparse  avgt   20   5.897 ±  0.043   s/op
ListDataStructure.benchmarkQuery              256000   consecutiveIntervals                64000     queryDense  avgt   20   6.368 ±  0.162   s/op
ListDataStructure.benchmarkQuery              256000   overlappingIntervals                16000    querySparse  avgt   20   1.701 ±  0.161   s/op
ListDataStructure.benchmarkQuery              256000   overlappingIntervals                16000     queryDense  avgt   20   1.425 ±  0.016   s/op
ListDataStructure.benchmarkQuery              256000   overlappingIntervals                32000    querySparse  avgt   20   2.150 ±  0.019   s/op
ListDataStructure.benchmarkQuery              256000   overlappingIntervals                32000     queryDense  avgt   20   2.170 ±  0.014   s/op
ListDataStructure.benchmarkQuery              256000   overlappingIntervals                64000    querySparse  avgt   20   5.865 ±  0.027   s/op
ListDataStructure.benchmarkQuery              256000   overlappingIntervals                64000     queryDense  avgt   20   9.852 ±  1.089   s/op
ListDataStructure.benchmarkQuery              256000       lastingIntervals                16000    querySparse  avgt   20   0.009 ±  0.001   s/op
ListDataStructure.benchmarkQuery              256000       lastingIntervals                16000     queryDense  avgt   20   0.009 ±  0.001   s/op
ListDataStructure.benchmarkQuery              256000       lastingIntervals                32000    querySparse  avgt   20   0.011 ±  0.001   s/op
ListDataStructure.benchmarkQuery              256000       lastingIntervals                32000     queryDense  avgt   20   0.011 ±  0.001   s/op
ListDataStructure.benchmarkQuery              256000       lastingIntervals                64000    querySparse  avgt   20   0.017 ±  0.001   s/op
ListDataStructure.benchmarkQuery              256000       lastingIntervals                64000     queryDense  avgt   20   0.022 ±  0.001   s/op
ListDataStructure.benchmarkQuery              256000  shortPoissonIntervals                16000    querySparse  avgt   20   0.054 ±  0.001   s/op
ListDataStructure.benchmarkQuery              256000  shortPoissonIntervals                16000     queryDense  avgt   20   0.041 ±  0.001   s/op
ListDataStructure.benchmarkQuery              256000  shortPoissonIntervals                32000    querySparse  avgt   20   0.193 ±  0.003   s/op
ListDataStructure.benchmarkQuery              256000  shortPoissonIntervals                32000     queryDense  avgt   20   0.126 ±  0.002   s/op
ListDataStructure.benchmarkQuery              256000  shortPoissonIntervals                64000    querySparse  avgt   20   0.713 ±  0.009   s/op
ListDataStructure.benchmarkQuery              256000  shortPoissonIntervals                64000     queryDense  avgt   20   0.444 ±  0.005   s/op
ListDataStructure.benchmarkQuery              256000        mixed1Intervals                16000    querySparse  avgt   20   0.536 ±  0.007   s/op
ListDataStructure.benchmarkQuery              256000        mixed1Intervals                16000     queryDense  avgt   20   0.379 ±  0.004   s/op
ListDataStructure.benchmarkQuery              256000        mixed1Intervals                32000    querySparse  avgt   20   0.946 ±  0.010   s/op
ListDataStructure.benchmarkQuery              256000        mixed1Intervals                32000     queryDense  avgt   20   1.016 ±  0.010   s/op
ListDataStructure.benchmarkQuery              256000        mixed1Intervals                64000    querySparse  avgt   20   4.199 ±  0.036   s/op
ListDataStructure.benchmarkQuery              256000        mixed1Intervals                64000     queryDense  avgt   20   3.640 ±  0.091   s/op
ListDataStructure.benchmarkQuery              256000        mixed2Intervals                16000    querySparse  avgt   20   0.961 ±  0.011   s/op
ListDataStructure.benchmarkQuery              256000        mixed2Intervals                16000     queryDense  avgt   20   1.545 ±  0.024   s/op
ListDataStructure.benchmarkQuery              256000        mixed2Intervals                32000    querySparse  avgt   20   2.553 ±  0.043   s/op
ListDataStructure.benchmarkQuery              256000        mixed2Intervals                32000     queryDense  avgt   20   3.658 ±  0.022   s/op
ListDataStructure.benchmarkQuery              256000        mixed2Intervals                64000    querySparse  avgt   20   6.201 ±  0.070   s/op
ListDataStructure.benchmarkQuery              256000        mixed2Intervals                64000     queryDense  avgt   20  10.362 ±  0.058   s/op
ListDataStructure.benchmarkQuery              256000        mixed3Intervals                16000    querySparse  avgt   20   1.889 ±  0.017   s/op
ListDataStructure.benchmarkQuery              256000        mixed3Intervals                16000     queryDense  avgt   20   1.798 ±  0.019   s/op
ListDataStructure.benchmarkQuery              256000        mixed3Intervals                32000    querySparse  avgt   20   3.870 ±  0.038   s/op
ListDataStructure.benchmarkQuery              256000        mixed3Intervals                32000     queryDense  avgt   20   3.985 ±  0.107   s/op
ListDataStructure.benchmarkQuery              256000        mixed3Intervals                64000    querySparse  avgt   20  10.436 ±  1.626   s/op
ListDataStructure.benchmarkQuery              256000        mixed3Intervals                64000     queryDense  avgt   20  10.305 ±  0.074   s/op
ListDataStructure.benchmarkQuery              256000        mixed4Intervals                16000    querySparse  avgt   20   1.809 ±  0.024   s/op
ListDataStructure.benchmarkQuery              256000        mixed4Intervals                16000     queryDense  avgt   20   2.073 ±  0.024   s/op
ListDataStructure.benchmarkQuery              256000        mixed4Intervals                32000    querySparse  avgt   20   3.904 ±  0.027   s/op
ListDataStructure.benchmarkQuery              256000        mixed4Intervals                32000     queryDense  avgt   20   4.466 ±  0.034   s/op
ListDataStructure.benchmarkQuery              256000        mixed4Intervals                64000    querySparse  avgt   20  10.418 ±  0.101   s/op
ListDataStructure.benchmarkQuery              256000        mixed4Intervals                64000     queryDense  avgt   20  13.981 ±  0.257   s/op
ListDataStructure.benchmarkQuery              512000   consecutiveIntervals                16000    querySparse  avgt   20   1.521 ±  0.051   s/op
ListDataStructure.benchmarkQuery              512000   consecutiveIntervals                16000     queryDense  avgt   20   2.810 ±  0.076   s/op
ListDataStructure.benchmarkQuery              512000   consecutiveIntervals                32000    querySparse  avgt   20   3.368 ±  0.017   s/op
ListDataStructure.benchmarkQuery              512000   consecutiveIntervals                32000     queryDense  avgt   20   3.411 ±  0.020   s/op
ListDataStructure.benchmarkQuery              512000   consecutiveIntervals                64000    querySparse  avgt   20   8.352 ±  0.028   s/op
ListDataStructure.benchmarkQuery              512000   consecutiveIntervals                64000     queryDense  avgt   20   8.448 ±  0.089   s/op
ListDataStructure.benchmarkQuery              512000   overlappingIntervals                16000    querySparse  avgt   20   2.298 ±  0.020   s/op
ListDataStructure.benchmarkQuery              512000   overlappingIntervals                16000     queryDense  avgt   20   2.618 ±  0.024   s/op
ListDataStructure.benchmarkQuery              512000   overlappingIntervals                32000    querySparse  avgt   20   3.250 ±  0.060   s/op
ListDataStructure.benchmarkQuery              512000   overlappingIntervals                32000     queryDense  avgt   20   3.852 ±  0.130   s/op
ListDataStructure.benchmarkQuery              512000   overlappingIntervals                64000    querySparse  avgt   20   8.053 ±  0.139   s/op
ListDataStructure.benchmarkQuery              512000   overlappingIntervals                64000     queryDense  avgt   20   8.460 ±  0.045   s/op
ListDataStructure.benchmarkQuery              512000       lastingIntervals                16000    querySparse  avgt   20   0.019 ±  0.001   s/op
ListDataStructure.benchmarkQuery              512000       lastingIntervals                16000     queryDense  avgt   20   0.018 ±  0.001   s/op
ListDataStructure.benchmarkQuery              512000       lastingIntervals                32000    querySparse  avgt   20   0.022 ±  0.001   s/op
ListDataStructure.benchmarkQuery              512000       lastingIntervals                32000     queryDense  avgt   20   0.022 ±  0.001   s/op
ListDataStructure.benchmarkQuery              512000       lastingIntervals                64000    querySparse  avgt   20   0.028 ±  0.001   s/op
ListDataStructure.benchmarkQuery              512000       lastingIntervals                64000     queryDense  avgt   20   0.032 ±  0.001   s/op
ListDataStructure.benchmarkQuery              512000  shortPoissonIntervals                16000    querySparse  avgt   20   0.064 ±  0.002   s/op
ListDataStructure.benchmarkQuery              512000  shortPoissonIntervals                16000     queryDense  avgt   20   0.054 ±  0.001   s/op
ListDataStructure.benchmarkQuery              512000  shortPoissonIntervals                32000    querySparse  avgt   20   0.204 ±  0.003   s/op
ListDataStructure.benchmarkQuery              512000  shortPoissonIntervals                32000     queryDense  avgt   20   0.169 ±  0.002   s/op
ListDataStructure.benchmarkQuery              512000  shortPoissonIntervals                64000    querySparse  avgt   20   0.832 ±  0.016   s/op
ListDataStructure.benchmarkQuery              512000  shortPoissonIntervals                64000     queryDense  avgt   20   0.485 ±  0.023   s/op
ListDataStructure.benchmarkQuery              512000        mixed1Intervals                16000    querySparse  avgt   20   0.671 ±  0.010   s/op
ListDataStructure.benchmarkQuery              512000        mixed1Intervals                16000     queryDense  avgt   20   1.184 ±  0.029   s/op
ListDataStructure.benchmarkQuery              512000        mixed1Intervals                32000    querySparse  avgt   20   1.486 ±  0.022   s/op
ListDataStructure.benchmarkQuery              512000        mixed1Intervals                32000     queryDense  avgt   20   2.855 ±  0.052   s/op
ListDataStructure.benchmarkQuery              512000        mixed1Intervals                64000    querySparse  avgt   20   6.162 ±  0.052   s/op
ListDataStructure.benchmarkQuery              512000        mixed1Intervals                64000     queryDense  avgt   20   5.939 ±  0.275   s/op
ListDataStructure.benchmarkQuery              512000        mixed2Intervals                16000    querySparse  avgt   20   2.257 ±  0.060   s/op
ListDataStructure.benchmarkQuery              512000        mixed2Intervals                16000     queryDense  avgt   20   2.365 ±  0.148   s/op
ListDataStructure.benchmarkQuery              512000        mixed2Intervals                32000    querySparse  avgt   20   4.116 ±  0.038   s/op
ListDataStructure.benchmarkQuery              512000        mixed2Intervals                32000     queryDense  avgt   20   5.510 ±  0.045   s/op
ListDataStructure.benchmarkQuery              512000        mixed2Intervals                64000    querySparse  avgt   20  10.103 ±  0.065   s/op
ListDataStructure.benchmarkQuery              512000        mixed2Intervals                64000     queryDense  avgt   20  14.189 ±  0.267   s/op
ListDataStructure.benchmarkQuery              512000        mixed3Intervals                16000    querySparse  avgt   20   4.643 ±  0.057   s/op
ListDataStructure.benchmarkQuery              512000        mixed3Intervals                16000     queryDense  avgt   20   4.658 ±  0.042   s/op
ListDataStructure.benchmarkQuery              512000        mixed3Intervals                32000    querySparse  avgt   20   7.374 ±  0.046   s/op
ListDataStructure.benchmarkQuery              512000        mixed3Intervals                32000     queryDense  avgt   20   7.508 ±  0.044   s/op
ListDataStructure.benchmarkQuery              512000        mixed3Intervals                64000    querySparse  avgt   20  15.033 ±  0.065   s/op
ListDataStructure.benchmarkQuery              512000        mixed3Intervals                64000     queryDense  avgt   20  15.556 ±  0.211   s/op
ListDataStructure.benchmarkQuery              512000        mixed4Intervals                16000    querySparse  avgt   20   4.712 ±  0.104   s/op
ListDataStructure.benchmarkQuery              512000        mixed4Intervals                16000     queryDense  avgt   20   4.836 ±  0.066   s/op
ListDataStructure.benchmarkQuery              512000        mixed4Intervals                32000    querySparse  avgt   20   8.043 ±  0.053   s/op
ListDataStructure.benchmarkQuery              512000        mixed4Intervals                32000     queryDense  avgt   20   8.025 ±  0.211   s/op
ListDataStructure.benchmarkQuery              512000        mixed4Intervals                64000    querySparse  avgt   20  16.646 ±  0.286   s/op
ListDataStructure.benchmarkQuery              512000        mixed4Intervals                64000     queryDense  avgt   20  15.476 ±  0.528   s/op

```
package me.kosik.interwalled.ailist.utils;

import me.kosik.interwalled.ailist.data.Intervals;


public class Search {

    public static <T> int findRightmostBinary(
            final Intervals<T> intervals,
            final int leftBound,
            final int rightBound,
            final long queryEnd
    ) {
        // EDGE CASE:
        // All elements are less than the {queryEnd}:
        if(intervals.get(rightBound).to() < queryEnd) {
            return rightBound;
        }

        // EDGE CASE:
        // All elements are greater than the {queryEnd}:
        if(intervals.get(leftBound).from() > queryEnd) {
            return -1;
        }

        int leftIndex = leftBound;
        int rightIndex = rightBound;

        // Binary search:
        while(rightIndex - leftIndex > 15) {
            int middleIndex = (leftIndex + rightIndex) / 2;

            if(intervals.get(middleIndex).from() >= queryEnd) {
                // Intervals' left edge is further right than the query's right edge.
                //  The middleIndex is too far right (will not find anything there) and the right side of the array
                //  does not contain any valid queries, skip.
                rightIndex = middleIndex;
            } else {
                leftIndex = middleIndex;
            }
        }

        return findRightmostLinear(intervals, leftIndex, rightIndex, queryEnd);
    }

    public static <T> int findRightmostLinear(
            final Intervals<T> intervals,
            final int leftBound,
            final int rightBound,
            final long queryEnd
    ) {
        for(int index = rightBound; index >= leftBound; -- index) {
            if(intervals.get(index).from() <= queryEnd)
                return index;
        }

        return -1;
    }
}

package me.kosik.interwalled.ailist.data;

import java.util.ArrayList;

public class Intervals<T> {

    final private Interval<T>[] intervals;

    public Intervals(final Interval<T>[] intervals) {
        this.intervals = intervals;
    }

    public Intervals(final ArrayList<Interval<T>> intervals) {
        this.intervals = intervals.toArray(new Interval[0]);
    }

    public Interval<T> get(int index) {
        return intervals[index];
    }

    public int length() {
        return intervals.length;
    }
}
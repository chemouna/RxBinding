package com.jakewharton.rxbinding.support.v7.widget;

import android.support.annotation.CheckResult;
import android.support.v7.widget.RecyclerView;

import rx.Observable;

/**
 * Static factory methods for creating {@linkplain Observable observables} for {@link RecyclerView.Adapter}.
 */
public class RxRecyclerViewAdapter {

    /**
     * Create an observable of data change events for {@code RecyclerView.adapter}.
     * <p>
     * <em>Note:</em> A value will be emitted immediately on subscribe.
     */
    @CheckResult
    public static <T extends RecyclerView.Adapter> Observable<T> dataChanges(T adapter) {
        return Observable.create(new RecyclerAdapterDataChangeOnSubscribe<>(adapter));
    }

    private RxRecyclerViewAdapter() {
        throw new AssertionError("No instances.");
    }
}

package com.jakewharton.rxbinding.support.v7.widget

import android.support.v7.widget.RecyclerView
import com.jakewharton.rxbinding.support.v7.widget.RxRecyclerViewAdapter
import android.support.v7.widget.RecyclerView.Adapter
import rx.Observable

/**
 * Create an observable of data change events for recyclerview `adapter`.
 *
 * *Note:* A value will be emitted immediately on subscribe.
 */
public inline fun <T : Adapter<out RecyclerView.ViewHolder>> T.dataChanges(): Observable<T> = RxRecyclerViewAdapter.dataChanges(this)

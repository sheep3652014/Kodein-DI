package org.kodein.di.internal

internal actual fun <K, V> newConcurrentMap(): MutableMap<K, V> = HashMap()
internal actual fun <T> newLinkedList(): MutableList<T> = ArrayList() // TODO: This should REALLY be a Linked list !
internal actual fun <T> newLinkedList(c: Collection<T>): MutableList<T> = ArrayList(c)

actual inline fun <R> maySynchronized(lock: Any?, block: () -> R): R = block()

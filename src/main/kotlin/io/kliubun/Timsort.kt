package io.kliubun

class TimSort : Sort {

    override fun <T : Comparable<T>> sort(collection: MutableList<T>) {
        collection.sort()
    }
}
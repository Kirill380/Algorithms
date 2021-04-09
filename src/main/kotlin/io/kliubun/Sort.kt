package io.kliubun

interface Sort {

    fun <T : Comparable<T>> sort(collection: MutableList<T>)
}
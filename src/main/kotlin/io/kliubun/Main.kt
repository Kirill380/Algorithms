package io.kliubun

import kotlin.random.Random


fun main() {
    val rangeSize = 1000
    val countingSort = CountingSort(rangeSize)
    val collection1 = MutableList(25_000) { (1 until rangeSize).random() }
    countingSort.sort(collection1)
    countingSort.sort(collection1)
    countingSort.sort(collection1)
    var i = 1;
    println("| iteration/size | 50,000 | 75,000 | 100,000 | 1,000,000 | 5,000,000 | 10,000,000 |")
    repeat(5) {
        print("| $i           |")
        for (size in listOf(50_000, 75_000, 100_000, 500_000, 1_000_000, 2_500_000, 7_500_000, 10_000_000)) {
            val collection = MutableList(size) { (1 until rangeSize).random() }
            val start = System.currentTimeMillis()
            collection.sort()
            val end = System.currentTimeMillis()
            print("${end - start}  |")
        }
        println()
        i++
//        collection = MutableList(size) { (1 until rangeSize).random() }
//        val start1 = System.currentTimeMillis()
//        collection.sort()
//        val end1 = System.currentTimeMillis()
//        println("Millis: ${end1 - start1}")
//        println("")
    }

    /*
| iteration/size | 50,000 | 75,000 | 100,000 | 1,000,000 | 5,000,000 | 10,000,000 |
| 1           |2  |6  |6  |28  |98  |268  |
| 2           |0  |1  |2  |17  |286  |181  |
| 3           |0  |1  |1  |12  |129  |357  |
| 4           |1  |1  |2  |11  |76  |167  |
| 5           |0  |1  |1  |11  |65  |177  |
    * */
}
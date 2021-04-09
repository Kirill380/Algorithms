package io.kliubun

class CountingSort(
    private val rangeSize: Int
) {

    fun sort(collection: MutableList<Int>) {
        val size = collection.size
        val output = MutableList(size) { 0 }

        val countArray = IntArray(rangeSize)

        for (i in 0 until size)
            ++countArray[collection[i]]

        // Change countArray[i] so that countArray[i] now contains actual position of the item in output array
        for (i in 1 until rangeSize)
            countArray[i] += countArray[i - 1]


        // Build the output item array to make it stable we are operating in reverse order.
        for (i in size - 1 downTo 0) {
            output[countArray[collection[i]] - 1] = collection[i]
            --countArray[collection[i]]
        }

        for (i in 0 until size)
            collection[i] = output[i]
    }
}
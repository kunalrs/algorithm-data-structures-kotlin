class Sorting {

    fun selectionSort(arr: Array<Int>): Array<Int> {
        if(arr.isEmpty())
            return arr

        for ((i, item) in arr.withIndex()) {
            for((j, it) in arr.withIndex()) {
                if(arr[i] < arr[j]) {
                    /**
                     * Swap values
                     * */
                    var temp = arr[i]
                    arr[i] = arr[j]
                    arr[j] = temp
                }
            }
        }
        return arr;
    }

    fun insertionSort(arr: Array<Int>): Array<Int> {
        if(arr.isEmpty())
            return arr

        for(i in 1 until arr.size) {
            var k = arr[i]
            for(j in i downTo 0) {
                if(k < arr[j]) {
                    arr[j + 1] = arr[j]
                    arr[j] = k
                }
            }
        }
        return arr
    }
}
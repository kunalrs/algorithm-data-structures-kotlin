
class LinearSearch {

    fun search(arr: ArrayList<Int>, k: Int): Int {
        for( (index, item) in arr.withIndex()) {
            if(item == k)
                return index
        }
        return -1
    }

    fun findMax(arr: ArrayList<Int>): Int {
        var max = 0
        for(item in arr) {
            if(item >= max)
                max = item
        }
        return max
    }
}
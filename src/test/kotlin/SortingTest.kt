import org.junit.Test

class SortingTest {

    var sort = Sorting()

    @Test
    fun selectionSortTest1() {
        var input = arrayOf(6, 3, 7, 1, 8, 9, 2, 5, 4)
        var exepected = arrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9)
        var actual = sort.selectionSort(input)
        assert(actual contentEquals exepected)
    }

    @Test
    fun selectionSortTest2() {
        var input = arrayOf(12, 33, 41, 2, 56, 8, 13)
        var exepected = arrayOf(2, 8, 12, 13, 33, 41, 56)
        var actual = sort.selectionSort(input)
        assert(actual contentEquals exepected)
    }

    @Test
    fun selectionSortTest3() {
        var input = arrayOf(1)
        var exepected = arrayOf(1)
        var actual = sort.selectionSort(input)
        assert(actual contentEquals exepected)
    }

    @Test
    fun insertionSortTest1() {
        var input = arrayOf(6, 3, 7, 1, 8, 9, 2, 5, 4)
        var exepected = arrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9)
        var actual = sort.insertionSort(input)
        assert(actual contentEquals exepected)
    }

    @Test
    fun insertionSortTest2() {
        var input = arrayOf(12, 33, 41, 2, 56, 8, 13)
        var exepected = arrayOf(2, 8, 12, 13, 33, 41, 56)
        var actual = sort.insertionSort(input)
        assert(actual contentEquals exepected)
    }

    @Test
    fun insertionSortTest3() {
        var input = arrayOf(1)
        var exepected = arrayOf(1)
        var actual = sort.insertionSort(input)
        assert(actual contentEquals exepected)
    }
}
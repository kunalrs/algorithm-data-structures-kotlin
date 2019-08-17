import org.junit.Assert
import org.junit.Test

class LinearSearchTest {

    var linearSearch = LinearSearch()

    @Test
    fun test1() {
        var input = arrayListOf<Int>(1, 2, 3, 5, 6, 7, 8, 9, 10)
        var k = 10
        var output = 8

        Assert.assertEquals(output, linearSearch.search(input, k))
    }

    @Test
    fun test2() {

        var input = arrayListOf<Int>(1, 2, 3, 5, 6, 7, 8, 9, 10)
        var k = 2
        var output = 1

        Assert.assertEquals(output, linearSearch.search(input, k))
    }

    @Test
    fun test3() {
        var input = arrayListOf<Int>(1, 2, 3, 5, 6, 7, 8, 9, 10)
        var k = 7
        var output = 5

        Assert.assertEquals(output, linearSearch.search(input, k))
    }

    @Test
    fun test4() {
        var input = arrayListOf<Int>(1, 2, 3, 5, 6, 7, 8, 9, 10)
        var k = 700
        var output = -1

        Assert.assertEquals(output, linearSearch.search(input, k))
    }

    @Test
    fun maxTest1() {
        var input = arrayListOf<Int>(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
        var output = 10

        Assert.assertEquals(output, linearSearch.findMax(input))
    }

    @Test
    fun maxTest2() {
        var input = arrayListOf<Int>(100, 99, 80, 90, 10)
        var output = 100

        Assert.assertEquals(output, linearSearch.findMax(input))
    }

    @Test
    fun maxTest3() {
        var input = arrayListOf<Int>(232, 299, 9909, 10, 2, 100, 2330)
        var output = 9909

        Assert.assertEquals(output, linearSearch.findMax(input))
    }
}
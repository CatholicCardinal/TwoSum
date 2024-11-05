
fun main() {
    val array = intArrayOf(-3,4,3,90)
    var i = 0
    val target = 0
    var resOut = IntArray (2)

    while (i < array.size) {
        val element = array[i]
        var j = 0
        while (j < array.size) {
            if (i != j && element + array[j] == target) {
                resOut[0] = i
                resOut[1] = j
            }
            j++
        }
        i++
    }

    println(resOut.joinToString())
}


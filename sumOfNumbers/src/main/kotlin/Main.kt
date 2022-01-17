fun main() {
    val input = readLine()!!
    var sum = 0
    for (i in input) {
        if (i.isDigit()) sum += i.toString().toInt()
    }
    println(sum)
}
fun main(args: Array<String>) {
    val num = readLine()!!.toInt()
    if (kotlin.math.abs(num) % 2 == 1) {
        println("ODD")
    } else {
        println("EVEN")
    }
}
import kotlin.math.sqrt

fun squareCircle(): Double {
    val r: Double = readLine()!!.toDouble()
    return 3.14 * r * r
}

fun squareRectangle(): Double {
    val a: Double = readLine()!!.toDouble()
    val b: Double = readLine()!!.toDouble()
    return a * b
}

fun squareTriangle(): Double {
    val a: Double = readLine()!!.toDouble()
    val b: Double = readLine()!!.toDouble()
    val c: Double = readLine()!!.toDouble()

    val p = (a + b + c) / 2
    return sqrt(p * (p - a) * (p - b) * (p - c))
}

fun main() {
    when (readLine()!!) {
        "circle" -> { println(squareCircle()) }
        "rectangle" -> { println(squareRectangle()) }
        "triangle" -> { println(squareTriangle()) }
    }
}
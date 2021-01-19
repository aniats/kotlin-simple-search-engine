fun main(args: Array<String>) {
    var sum = 0
    var input = readLine()!!.toInt()
    while(input != 0) {
        sum += input
        input = readLine()!!.toInt()
    }
    println(sum)
}
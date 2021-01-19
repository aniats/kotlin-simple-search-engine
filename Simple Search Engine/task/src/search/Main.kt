package search
fun main() {
    println("Enter the number of people:")
    val num = readLine()!!.toInt()
    var arrayOfPeople: MutableList<String> = ArrayList()

    println("Enter all people:")
    repeat(num) {
        arrayOfPeople.add(readLine()!!)
    }

    println("Enter the number of search queries:")
    val numOfQueries = readLine()!!.toInt()

    repeat(numOfQueries) {
        println("Enter data to search people:")
        val str = readLine()!!

        var resultOfQueries: MutableList<String> = ArrayList()
        var isPresent = false

        for (i in arrayOfPeople.indices) {
            if (arrayOfPeople[i].toLowerCase().contains(str, ignoreCase = true)) {
                isPresent = true
                resultOfQueries.add(arrayOfPeople[i])
            }
        }

        if (isPresent) {
            println("Found people:")
            for (i in resultOfQueries) {
                println(i)
            }
        } else {
            println("No matching people found.")
        }
    }
}

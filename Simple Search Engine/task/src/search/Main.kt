package search

fun search(arrayOfPeople: MutableList<String>) {
    println("Enter a name or email to search all suitable people.")
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
        // println("Found people:")
        for (i in resultOfQueries) {
            println(i)
        }
    } else {
        // println("No matching people found.")
    }
}

fun printEveryone(arrayOfPeople: MutableList<String>) {
    println("=== List of people ===")
    for (i in arrayOfPeople) {
        println(i)
    }
}

fun main() {
    println("Enter the number of people:")
    val num = readLine()!!.toInt()
    var arrayOfPeople: MutableList<String> = ArrayList()

    
    println("Enter all people:")
    repeat(num) {
        arrayOfPeople.add(readLine()!!)
    }

    while (true) {
        println("=== Menu ===\n" +
                "1. Find a person\n" +
                "2. Print all people\n" +
                "0. Exit")

        when (readLine()!!.toInt()) {
            1 -> search(arrayOfPeople)
            2 -> printEveryone(arrayOfPeople)
            0 -> { print("Bye!"); break}
            else -> { println("Incorrect option! Try again.") }
        }
    }
}

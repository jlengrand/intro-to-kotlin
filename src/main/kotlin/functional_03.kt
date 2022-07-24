fun functionalFun(){


    val values = listOf(1, 2, 3, 4, 5, 6, 7, 8)
//    val positives = values.filter({ x ->x > 5 })
//    val positives = values.filter({ it > 5 })
    val positives = values.filter { it > 5 }

    val fruits = listOf("apple", "apricot", "banana", "blueberry", "cherry", "coconut")

    fruits
        .filter { it.startsWith("a") }
        .sortedBy { it }
        .map { it.uppercase() }
        .forEach { println(it) }


    // Has all of the fun stuff you'd expect
    println(values.fold(0) { acc, i -> acc + i })

        // amazing IDE support
//    val hasNegative = values.filter { it > 0 }.size > 0



}
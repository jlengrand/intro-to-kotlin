

/*

hello world
Classes and functions, interfaces

 */


fun main(){
    println("Hello World")
}

// Functions

fun sum(a: Int, b: Int): Int{
    return a + b
}

fun sum3(a: Int, b: Int) = a + b

fun printSum(a: Int, b: Int) : Unit = println(a + b)

fun updateValue(a: Int) {
//    a = 6
}

// Variables

fun doThings(){
    var a = sum(2, 5)
    val b = sum(2, 6)

    a = 6
//    b = 7
}

// String interpolation

fun printNameAndAge(name: String, age: Int){
    println("Name $name and Age $age")
}
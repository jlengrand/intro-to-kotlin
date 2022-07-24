import kotlin.math.pow

// null safety

fun playingWithNulls(){
//    val square : Shape = null
    val maybeSquare : Square? = null

//    println(maybeSquare.length)
    println(maybeSquare!!.length)
    println(maybeSquare?.length)
    // bob?.department?.head?.name

//    val l: Int = if (maybeSquare != null) maybeSquare.length else -1
//    val betterl = maybeSquare?.length ?: -1

    val nullableList: List<Int?> = listOf(1, 2, null, 4)
}

// ranges

fun ranges(){
    val items = listOf("apple", "banana", "kiwifruit")
    for (item in items) {
        println(item)
    }

    for(i in 1..5 step 2){
        println(i)
    }
}

fun lists(){
    val aList = listOf<Int>()
    val anotherList = listOf(1, 2, 3, 4, 5, 6)
//    anotherList[3] = 5
//    anotherList.add(7)

    class Meal(val name: String, var time: String)

    val breakfast = Meal("Breakfast", "8AM")
    val lunch = Meal("Lunch", "12AM")

    val meals = listOf(breakfast, lunch)
    lunch.time = "12PM"

    println(meals)

    val lastList = anotherList.toMutableList()
    lastList[3] = 5
    lastList.add(7)
    lastList.remove(0)
}

// When expressions and extensions functions!

sealed class Shape
data class Circle(val radius: Double): Shape()
data class Square(val length: Double): Shape()
data class Rectangle(val length: Double, val width: Double): Shape()

fun zeArea(zeShape: Shape) : Double {
    return when(zeShape){
        is Circle -> Math.PI * zeShape.radius.pow(2 )
        is Square -> zeShape.length.pow(2)
        is Rectangle -> zeShape.length * zeShape.width
    }
}

fun Shape.area() : Double {
    return when(this){
        is Circle -> Math.PI * this.radius.pow(2 )
        is Square -> this.length.pow(2)
        is Rectangle -> this.length * this.width
    }
}

fun calculatingAreas(){
    val square = Square(5.0)
    println(zeArea(square))
    println(Square(5.0).area())
}

fun smartCast(shape: Shape){
    if(shape is Circle){
        println(shape.radius)
    }
}


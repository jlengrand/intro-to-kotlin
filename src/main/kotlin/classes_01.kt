import java.util.*

//fun sum(a: Int, b: Int): Int{
//    return a + b
//}

class User

// abstract classes and interfaces exist as well (https://blog.kotlin-academy.com/abstract-class-vs-interface-in-kotlin-5ab8697c3a14)

interface hasFullName{
    fun fullName(): String
}

// multiple classes per file

open class AnotherUser(val name: String, var age: Int)



class YetAnotherUser(name: String, age: Int, val lastName: String = "Doe"): AnotherUser(name, age), hasFullName{
    val capitalizedLastName = lastName.replaceFirstChar { it.titlecase(Locale.getDefault()) }

    override fun fullName() = name + " " + lastName
}

val user1 = AnotherUser("Joe", 25)

//getters / setters / tostring

val user2 = YetAnotherUser(
    name = "Bob",
    age = 27,
    lastName = "Dull"
)

fun playWithNames(){
//    user1.name = "Nick"
    user1.age = 28
    user2.fullName()
    user2.capitalizedLastName

    println(user1)
}


// sealed classes

sealed class APIResponse
class APIOk(val status: Int, val message: String) : APIResponse()
class APIError(val message: String, val root: Throwable) : APIResponse()

// companion object

class DatabaseConnection(var connectionString: String) {

//    ....

    companion object {
        private const val HOST = "hostA"
        private const val PORT = "1234"

        private lateinit var connection: DatabaseConnection

        fun createConnection() : DatabaseConnection = if (this::connection.isInitialized) connection else DatabaseConnection("$HOST:$PORT")
    }
}

// Type aliases

typealias Predicate<T> = (T) -> Boolean

fun <T> isPredicateTrueForValue(predicate: Predicate<T>, value: T) : Boolean {
    return predicate(value)
}

// Data Classes

enum class WEAPON {
    SWORD, AXE, WAND
}

data class Hero(val weapons: List<WEAPON>, val name: String, val zeClass: String?)

fun funWithHeroes(){
    val gandalf = Hero(listOf( WEAPON.WAND), "Gandalf the grey", "Wizard")

    val betterGandalf = gandalf.copy(name = "Gandalf the white")

    println(betterGandalf)
    val (weapon, name, zeClass) = betterGandalf
    println("$name, $weapon, $zeClass")

}
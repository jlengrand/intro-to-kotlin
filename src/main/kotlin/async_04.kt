import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main(args: Array<String>) = runBlocking { // this: CoroutineScope
    val job = launch { // launch a new coroutine and continue
        printWorld()
    }
    println("Hello") // main coroutine continues while a previous one is delayed
    job.join() // wait until child coroutine completes
    println("Done")
}

suspend fun printWorld() {
    delay(1000L)
    println("World!")
}

fun main2() = runBlocking {
    repeat(100_000) { // launch a lot of coroutines
        launch {
            delay(5000L)
            print(".")
        }
    }
}
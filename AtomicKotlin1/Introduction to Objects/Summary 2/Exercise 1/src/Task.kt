// Summary2/Task1.kt
package summaryIIExercise1
import atomictest.eq

// add Boring class
class Boring(){
    fun a(): Double {
        return 1.618
    }
    fun b(): String = "ratio"
    fun c(): Int = 11
}

fun main() {
  // test Boring
    val boring = Boring()

    println(boring.a()) eq 1.618
    println(boring.b()) eq "ratio"
    println(boring.c()) eq 11
}
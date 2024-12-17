// Summary2/Task2.kt
package summaryIIExercise2
import atomictest.eq

// add Boring2 class
class Boring2(val a: Double, val b: String, val c: Int){
  fun a(): Double = a
  fun b(): String = b
  fun c(): Int = c
}


fun main() {
  val boring = Boring2(1.618,"ratio",11)

  println(boring.a()) eq 1.618
  println(boring.b()) eq "ratio"
  println(boring.c()) eq 11
}
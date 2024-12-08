// Exceptions/Task2.kt
package exceptionsExercise2
import atomictest.capture
import atomictest.eq

fun abort(s: String) {
  throw Exception(s)
}

fun main() {
  try {
      abort("Stop!")
  }catch (e: Exception){
    println("Exception: ${e.message}")
  }
}
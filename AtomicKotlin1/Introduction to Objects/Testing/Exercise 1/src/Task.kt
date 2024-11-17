// Testing/Task1.kt
package testingExercise1
import atomictest.eq
import kotlin.math.absoluteValue

fun abs(number: Int): Int {
  if (number < 0){
    val num = number.absoluteValue
    return num
  } else {
    return number
  }
}

fun main() {
  abs(0) eq 0
  abs(42) eq 42
  abs(-239) eq -239

}
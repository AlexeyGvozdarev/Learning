// Testing/Task2.kt
package testingExercise2
import atomictest.eq
import atomictest.neq

fun sum(a: Int, b: Int, c: Int): Int = a + b + c

fun main() {
  sum(1,2,3) eq 6
  sum(1,3,4) eq 8
  sum(1,4,5) eq 10
  sum(1,5,6) eq 12
  sum(1,6,7) eq 14
}
// LoopingAndRanges/Task1.kt
package loopingAndRangesExercise1

fun factorial(n: Int): Long {
  var fact: Long = 1

  for (i in 1..n){
    fact *= i.toLong()
  }
  return fact
}

fun main() {
  println(factorial(20))  // 3628800
}
// LoopingAndRanges/Task2.kt
package loopingAndRangesExercise2

fun factorial(n: Int): Long {
  var result = 1L
  for (i in 1..n) {
    result *= i
  }
  return result
}

fun sumOfFactorials(n: Int): Long {
  var sumFact = 0L

  for (i in 1..n){
    sumFact += factorial(i)
  }
  return sumFact
}

fun main() {
  println(sumOfFactorials(2))  // 4037913
}
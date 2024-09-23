// Booleans/Task2.kt
package booleansExercise2

fun showAnd(first: Boolean, second: Boolean) {
  val result = first && second
  println("$first && $second == $result")

}

fun showOr(first: Boolean, second: Boolean) {
  val result = first || second
  println("$first || $second == $result")
}

fun showTruthTable() {
  println("Truth Table for AND (&&):")
  println("----------------------------")

  showAnd(true, true)
  showAnd(true, false)
  showAnd(false, true)
  showAnd(false, false)

  println("\nTruth Table for OR (||):")
  println("---------------------------")
  showOr(true, true)
  showOr(true, false)
  showOr(false, true)
  showOr(false, false)
}

fun main() {
  showTruthTable()
}
// Summary1/Task7.kt
package summaryIExercise7

fun countDigits(number: Int, digit: Int): Int {
  var worker = number
  var occurrences = 0

  val digitChar = digit.toString()[0]

  while (worker > 0) {

    var str: Char = (worker % 10).toString()[0]


    if (str == digitChar) {
      occurrences++
    }
    worker = worker / 10
  }
  return occurrences
}

fun main() {
  println(countDigits(764241, 4)) // 2
}
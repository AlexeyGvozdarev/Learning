// Summary1/Task4.kt
package summaryIExercise4

fun testLong() {
  var maxLong = Long.MAX_VALUE


  println(maxLong + 1)
}

fun testDouble() {
  var maxDouble = Double.MAX_VALUE


  println(maxDouble + 1)
}

fun testDouble2() {
  var maxDouble = Double.MAX_VALUE

  println(maxDouble == maxDouble + 1)
}

fun main() {
  testLong()
  testDouble()
  testDouble2()
}
/* Output:
-9223372036854775808
1.7976931348623157E308
true
 */
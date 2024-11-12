// Summary1/Task5.kt
package summaryIExercise5

fun everyFifth(start: Int, end: Int) {
  var el = start - 1

  while (el < end)  {
    el += 5
    if (el <= end)
    println(el)
  }

}

fun main() {
  everyFifth(11, 30)
}
/* Output:
15
20
25
30
*/
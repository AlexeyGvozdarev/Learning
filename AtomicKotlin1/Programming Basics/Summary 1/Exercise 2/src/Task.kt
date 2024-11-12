// Summary1/Task2.kt
package summaryIExercise2

fun other(s: String): String {
  var list = mutableListOf<Char>()

  for (i in 0..s.length-1 step 2)
    list.add(s[i])

  return list.toString().replace(",","")
    .replace("[", "")
    .replace("]", "")
      .replace(" ", "")
}


fun main() {
  println(other("abcdef"))
}
/* Output:
cmn
*/
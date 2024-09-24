// InKeyword/Task1.kt
package theInKeywordExercise1

fun getAlphabet(): String {
  var str = mutableListOf<Char>()
  var el = 'a'

  while (el <= 'z'){
    str.add(el)
    el++
  }
  return str.toString().replace(",", "")
                       .replace("[", "")
                       .replace("]", "")
                       .replace(" ", "")
}

fun main() {
  println(getAlphabet())  // abcdefghijklmnopqrstuvwxyz
}
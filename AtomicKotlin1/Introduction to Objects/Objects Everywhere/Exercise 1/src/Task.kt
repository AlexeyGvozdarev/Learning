// ObjectsEverywhere/Task1.kt
package objectsEverywhereExercise1

fun isPalindrome(s: String): Boolean {
  var reverseWord = s.reversed()

  return if (reverseWord == s) true else false

}

fun main() {
  println(isPalindrome("mom"))     // true
  println(isPalindrome("street"))  // false
}
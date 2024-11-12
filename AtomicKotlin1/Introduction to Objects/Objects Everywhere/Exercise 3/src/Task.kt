// ObjectsEverywhere/Task3.kt
package objectsEverywhereExercise3

import companionobjects.WithCompanion.Companion.i

fun isPalindrome(s: String): Boolean =
  s.reversed() == s

fun isPalIgnoreCase(s: String): Boolean =
  isPalindrome(s.lowercase())

fun isPalIgnoreSpecial(s: String): Boolean {
  var newS = s.filter { it.isLetter() }
  if ( newS.lowercase().reversed() == newS.lowercase())
    return true
  else
    return false

}

fun main() {
  println(isPalIgnoreSpecial("Was It A Rat I Saw? ..."))  // true
}
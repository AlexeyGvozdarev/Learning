// InKeyword/Task4.kt
package theInKeywordExercise4

// isValidCharacter

fun isValidIdentifier(s: String): Boolean {
  if (s.isEmpty()) {
    return false
  }


  val firstChar = s[0]
  if (!firstChar.isLetter() && firstChar != '_') {
    return false
  }


  for (char in s) {
    if (!char.isLetterOrDigit() && char != '_') {
      return false
    }
  }

  return true

}

fun main() {
  println(isValidIdentifier("name"))  // true
  println(isValidIdentifier("0name"))  // false
}
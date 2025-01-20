// Varargs/Task2.kt
package variableArgumentListsExercise2

fun printArgs(s: String, vararg num: Int) {
   var number = num.toList()
    print("$s$number")
}

fun main() {
  printArgs("Numbers: ", 1, 2, 3)
}
/* Expected output:
Numbers: [1, 2, 3]
 */
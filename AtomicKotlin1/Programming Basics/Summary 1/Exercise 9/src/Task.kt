// Summary1/Task9.kt
package summaryIExercise9

fun printTriangle(n: Int) {
  var num = n
  for (i in 1..n) {
    repeat(n - i) {
      print(' ')
    }
    repeat(2 * i - 1) {
      print('#')
    }
    println()
  }
}

fun main() {
  printTriangle(2)
}
/* Output:
   #
  ###
 #####
#######
*/
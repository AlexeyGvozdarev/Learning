// Summary1/Task6.kt
package summaryIExercise6

fun everyFifthNonSpace(s: String) {
  var newS = s.replace(" ", "")
  for (i in 0 .. newS.length -1){
    if (i  % 5 == 4 ){
      println(newS[i])
    }
  }

}

fun main() {
  everyFifthNonSpace("abc d e fgh ik")
}
/* Output:
e
k
*/
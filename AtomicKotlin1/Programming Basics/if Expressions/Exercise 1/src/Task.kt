// IfExpressions/Task1.kt
package ifExpressionsExercise1

fun checkSign(number: Int): String {
  val pos = "positive"
  val neg = "negative"
  val z = "zero"

  if (number > 0) {
    return pos
  } else if(number < 0){
    return neg
  }else{
    return z
  }
}



fun main() {
  println(checkSign(0))  // negative
}
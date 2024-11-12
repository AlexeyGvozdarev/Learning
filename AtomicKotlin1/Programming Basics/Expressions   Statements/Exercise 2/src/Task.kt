// ExpressionsStatements/Task2.kt
package expressionsAndStatementsExercise2

fun f(a: Int, b: Int): Int{
  return a + b
}

fun g(a: String, b: String): String{
  return  a + b
}

fun h(){
  println("h()")
}

fun main() {

  val f: Int = f(1,2)
  val g: String = g("abc","def")
  val h: Unit = h()

  println("$f: Int")
  println("$g: String")
  println("$h: Unit")

}

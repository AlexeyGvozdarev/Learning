// Summary1/Task10.kt
package summaryIExercise10

fun showSnake(rows: Int, columns: Int) {
  val width = (rows * columns).toString().length + 1
  for (i in 0 until rows) {
    for (j in 0 until columns) {
      val value = if (i % 2 == 0) {
        i * columns + j
      } else {
        i * columns + (columns - 1 - j)
      }
      print("%${width}d".format(value))
    }
    println()
  }
}

fun main() {
  showSnake(3, 3)
  println()
  showSnake(4, 5)
}

// Varargs/Task3.kt
package variableArgumentListsExercise3
import atomictest.eq

fun listOfChunks(size: Int, vararg elements: String): List<List<String>> {
  var newList = elements.toList()
  var chunkList = newList.chunked(size)

  return chunkList

}

fun main() {
  val chunks = listOfChunks(3, "a", "b", "c", "d", "e", "f", "g")
  chunks eq listOf(listOf("a", "b", "c"), listOf("d", "e", "f"), listOf("g"))
}
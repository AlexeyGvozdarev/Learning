// Summary2/Task3.kt
package summaryIIExercise3
import atomictest.*

class FixedSizeHolder(private val maxSize: Int){
    private var items = mutableListOf<Any>()
    var size: Int = 0
        get() = items.size
    var full: Boolean = false
        get() = items.size >= maxSize

    fun add( value: Any){
        if (full){
            throw IllegalStateException("The container is full")

        }else{
            items.add(value)
        }
    }
}

fun main() {

  val holder = FixedSizeHolder(2)
  holder.add("What is the answer?")
  holder.add(42)
  holder.full eq true
  holder.size eq 2
  capture {
    holder.add("!!!")
  } eq "IllegalStateException: The container is full"

}
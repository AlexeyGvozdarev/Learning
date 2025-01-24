// PropertyAccessors/Task3.kt
package propertyAccessorsExercise3
import atomictest.eq

class MessageStorage(){
    private var _messages: MutableList<String> = mutableListOf()
    var messages: List<String> = listOf()
        get() {
            return _messages
        }

    fun addMessage(s: String){
        _messages.add(s)
    }
}

fun main() {

  val messageStorage = MessageStorage()
  messageStorage.addMessage("first")
  messageStorage.addMessage("second")
  messageStorage.messages eq listOf("first", "second")
  // doesn't compile:
//  messageStorage.messages.remove("first")

}
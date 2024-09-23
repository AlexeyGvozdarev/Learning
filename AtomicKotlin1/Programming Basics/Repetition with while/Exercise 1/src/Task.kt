// RepetitionWithWhile/Task1.kt
package repetitionWithWhileExercise1

fun displayContent(a: String) {
    val char = a.toCharArray()
    var i = 0

    while (i <= char.size -1){
        println(char[i])
        i += 1
    }

}

fun main() {
//  displayContent("abc")
    displayContent("abc")
}
/* Expected output:
a
b
c
*/
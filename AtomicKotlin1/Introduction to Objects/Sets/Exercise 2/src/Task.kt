// Sets/Task2.kt
package setsExercise2
import kotlin.random.Random

fun experiment(): Int {
  var count = 0
  var mySet = mutableSetOf<Int>()

  while (mySet.size < 25){
    mySet.add(Random.nextInt(1, 26))
    count ++
  }
  return count
}

fun main() {
  val counts = mutableListOf<Int>()
  repeat(1000) {
    counts += experiment()
  }
  println(counts.average())
}
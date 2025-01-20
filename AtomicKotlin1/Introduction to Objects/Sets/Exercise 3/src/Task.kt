// Sets/Task3.kt
package setsExercise3
import atomictest.eq
import kotlin.time.times

val meats = setOf("beef", "chicken")
val fruits = setOf("apple", "orange", "banana", "kiwi")
val vegetables = setOf("beans", "peas", "carrots", "sweet potatoes", "asparagus", "spinach")

// countPercent

fun percentMeat(groceryCart: Set<String>): Double {
  val commonElements = groceryCart.intersect(meats)
  val count = commonElements.size
  val groceryCartCount = groceryCart.size
  val result: Double = ((count.toDouble() / groceryCartCount.toDouble()) * 100)
  return result
}


fun percentFruit(groceryCart: Set<String>): Double {

  val commonElements = groceryCart.intersect(fruits)
  val count = commonElements.size
  val groceryCartCount = groceryCart.size
  val result: Double = ((count.toDouble() / groceryCartCount.toDouble()) * 100)
  return result
}


fun percentVeggies(groceryCart: Set<String>): Double {
  val commonElements = groceryCart.intersect(vegetables)
  val count = commonElements.size
  val groceryCartCount = groceryCart.size
  val result: Double = ((count.toDouble() / groceryCartCount.toDouble()) * 100)
  return result
}


fun percentOther(groceryCart: Set<String>): Double {
  val uniqPosition = meats.union(fruits).union(vegetables)
  val commonElements = groceryCart.subtract(groceryCart.intersect(uniqPosition))
  val count = commonElements.size
  val groceryCartCount = groceryCart.size
  val result: Double = ((count.toDouble() / groceryCartCount.toDouble()) * 100)
  return result
}


fun main() {
  val groceryCart = setOf("apple", "pretzels", "bread", "orange", "beef",
    "beans", "asparagus", "sweet potatoes", "spinach", "carrots")

  percentMeat(groceryCart) eq 10.0
  percentFruit(groceryCart) eq 20.0
  percentVeggies(groceryCart) eq 50.0
  percentOther(groceryCart) eq 20.0
}
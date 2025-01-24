// Summary2/Task6.kt
package summaryIIExercise6
import atomictest.eq

class Temperature {
  private var current = 0.0
  private var scale = "f"



//  fun setFahrenheit(now: Double) {
//    current = now
//    scale = "f"
//  }
var fahrenheit: Double
  get() = if (scale == "f") current else current * 9.0 / 5.0 + 32.0
  set(value) {
    current = value
    scale = "f"
  }
  var celsius: Double
    get() = if (scale == "c") current else (current - 32.0) * 5.0 / 9.0
    set(value){
      current = value
      scale = "c"
    }
//  fun setCelsius(now: Double) {
//    current = now
//    scale = "c"
//  }
//  fun getFahrenheit(): Double =
//    if (scale == "f")
//      current
//    else
//      current * 9.0 / 5.0 + 32.0
//  fun getCelsius(): Double =
//    if (scale == "c")
//      current
//    else
//      (current - 32.0) * 5.0 / 9.0
}

fun main() {
//  val temp = Temperature()
//  temp.setFahrenheit(98.6)
//  temp.getFahrenheit() eq 98.6
//  temp.getCelsius() eq 37.0
//  temp.setCelsius(100.0)
//  temp.getFahrenheit() eq 212.0

  val temp = Temperature()

  // Установка температуры в Фаренгейтах
  temp.fahrenheit = 98.6
  println(temp.fahrenheit) // Вывод: 98.6
  println(temp.celsius)    // Вывод: 37.0

   //Установка температуры в Цельсиях
  temp.celsius = 100.0
  println(temp.fahrenheit) // Вывод: 212.0
}
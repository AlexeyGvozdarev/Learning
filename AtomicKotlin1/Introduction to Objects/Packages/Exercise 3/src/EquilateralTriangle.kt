// Packages/EquilateralTriangle.kt
package pythagorean

import kotlin.math.sqrt

class EquilateralTriangle(private val side: Double){

     fun area(): Double {
         val s = (sqrt(3.0) / 4) * side * side
         return s
     }
 }
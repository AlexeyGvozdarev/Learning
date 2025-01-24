// Summary2/Task8.kt
package summaryIIExercise8
import atomictest.eq
import summaryIIExercise7.romanString

val intToRomanNumeralMap: Map<Int, String> = mutableMapOf(1000 to "M", 900 to "CM", 500 to "D", 400 to "CD", 100 to "C", 90 to "XC", 50 to "L", 40 to "XL", 10 to "X", 9 to "IX", 5 to "V", 4 to "IV", 1 to "I")

val romanNumeralToIntMap: Map<String, Int> = intToRomanNumeralMap.entries.associate { (key, value) -> value to key }

fun convertFromRoman(roman: String): Int {
  var intString = 0
  var max = 0
  val tempString = roman.reversed()
  var temp = ""

  for (i in tempString){
    temp = i.toString()

    romanNumeralToIntMap[temp]?.let {

      if (it >= max){
        max = it
        intString += max
      }
      if (it < max){
        max = it
        intString -= max
      }
    }
  }
  return intString
}

fun main() {
  convertFromRoman("XXIII") eq 23
  convertFromRoman("XLIV") eq 44
  convertFromRoman("C") eq 100
  convertFromRoman("MMXVIII") eq 2018

  convertFromRoman("C")

}

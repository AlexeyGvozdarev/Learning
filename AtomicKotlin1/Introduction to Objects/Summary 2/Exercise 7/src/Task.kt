// Summary2/Task7.kt
package summaryIIExercise7
import atomictest.eq

val intToRomanNumeralMap: Map<Int, String> = mutableMapOf(1000 to "M", 900 to "CM", 500 to "D", 400 to "CD", 100 to "C", 90 to "XC", 50 to "L", 40 to "XL", 10 to "X", 9 to "IX", 5 to "V", 4 to "IV", 1 to "I")
var romanString = ""

fun convertToRoman(number: Int): String {
  val thousand = (number / 1000) * 1000
  val hundred = ((number % 1000) / 100) * 100
  val tens = ((number % 100) / 10) * 10
  val unit = number % 10

  convert(thousand, 1000)
  convert(hundred, 100)
  convert(tens, 10)
  convert(unit, 1)

  return romanString
}

fun convert(valueType: Int, index: Int){
  if (valueType !in intToRomanNumeralMap && valueType != 0){
    if ((valueType )  < (4 * index)){
      repeat(valueType / index){
        val count = ((valueType / valueType) * index)
        romanString += intToRomanNumeralMap[count]
      }
    }else if (valueType > (5 * index) && valueType < (9 * index)){
      val overV = (5 * index)
      intToRomanNumeralMap[overV]?.let { romanString += it }
    }
      repeat((valueType / index) - 5){
        val count = ((valueType / valueType) * index)
        romanString += intToRomanNumeralMap[count]
    }
  }else {
    intToRomanNumeralMap[valueType]?.let { romanString += it }
  }
}

fun main() {
//  convertToRoman(23) eq "XXIII"
//  convertToRoman(44) eq "XLIV"
//  convertToRoman(100) eq "C"
//  convertToRoman(2018) eq "MMXVIII"
  println(convertToRoman(23))
}
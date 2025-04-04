// Lists/Task3.kt
package listsExercise3
import atomictest.eq

fun checkAnagrams(s1: String, s2: String): Boolean {
  var list1 = s1.toCharArray().sorted().joinToString { "" }
  var list2 = s2.toCharArray().sorted().joinToString { "" }

return list1 == list2
}

fun main() {
  checkAnagrams("thing", "night") eq true
  checkAnagrams("leader", "dealer") eq true
  checkAnagrams("sector", "escort") eq true
  checkAnagrams("tablet", "battle") eq true
  checkAnagrams("friend", "finder") eq true
  checkAnagrams("senator", "treason") eq true
  checkAnagrams("terrain", "trainer") eq true
  checkAnagrams("teaching", "cheating") eq true

  checkAnagrams("pots", "stops") eq false
  checkAnagrams("escort", "sectors") eq false
  checkAnagrams("sections", "notices") eq false
}
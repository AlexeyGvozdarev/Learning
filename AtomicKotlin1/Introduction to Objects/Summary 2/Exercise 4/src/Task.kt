// Summary2/Task4.kt
package summaryIIExercise4
import atomictest.capture
import atomictest.eq
import java.lang.IllegalArgumentException

class Dictionary(){
    val translations: MutableMap<String, List<String>> = mutableMapOf()

    init {
        println("Словарь создан и готов к использованию.")
    }

    fun addTranslations(word: String, translations: String){
        require(word.isNotBlank()){"Слово не ьщжет быть пустым."}

        if (this.translations.containsKey(word)){
             throw IllegalArgumentException("Dictionary already has translations for '$word'")
        }else{
        val translationList = translations.split("\\s+".toRegex()).toMutableList()
        this.translations[word] = translationList
            }
    }
}

fun main() {

  val dictionary = Dictionary()
  dictionary.addTranslations("apple", "Apfel")
  dictionary.addTranslations("cake", "Kuchen Torte")

  dictionary.translations eq mapOf("apple" to listOf("Apfel"),
    "cake" to listOf("Kuchen", "Torte"))

  capture {
    dictionary.addTranslations("cake", "Törtchen")
  } eq "IllegalArgumentException: Dictionary already has translations for 'cake'"


  // shouldn't compile:
//  dictionary.translations.remove("apple")
}
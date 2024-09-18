//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {

    val numbers = listOf(1, 2, 2, 3, 1, 4, 2)
    val result = countFrequencies(numbers)

    print(result)
}

fun countFrequencies(numbers: List<Int>): Map<Int, Int>{

    val count = numbers.groupingBy { it }.eachCount()
    
    return count
}
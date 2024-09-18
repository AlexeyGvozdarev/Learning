package contains_element

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    val arr = arrayOf(10, 20, 30, 40)
    val result = containsElement(arr, 600)
    print(result)
}

fun containsElement(arr: Array<Int>, element: Int): Boolean {
    var isExist = false
//    for (i in 0..arr.size -1){
//        if (arr[i] == element)
//            isExist = true
//        else
//            isExist =  false
//    }

    arr.forEach { el ->
        if (el == element)
            isExist = true

    }

    return isExist
}

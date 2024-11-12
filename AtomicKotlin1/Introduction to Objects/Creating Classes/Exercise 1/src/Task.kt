// CreatingClasses/Task1.kt
package creatingClassesExercise1

class SomeClass(){
    fun a() = println(42)
    fun b() = a()
    fun c() = b()
}

fun main(){

    val some = SomeClass()

    some.a()
    some.b()
    some.c()
}
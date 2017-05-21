package julio.com.br.kotlinbasicsoreilly.nulls

/**
 * Created by Shido on 21/05/2017.
 */
open class Person {

}
 class Employee : Person(){
    fun vacationDays(days: Int){
        if(days < 60){
            println("You Need More vacation")
        }
    }
 }
class  Contractor: Person(){

}

fun hasVacations(obj: Person){
    if(obj is Employee){
        obj.vacationDays(20) //Smart Casting with IS and you get completion
    }else{
        obj
    }
}

var input: Any = 10
fun main(args: Array<String>) {

    //val str = input as String //ClassCastExcepetion = Não há implicity conversion em Kotlin
    val stra = input as? String //Try to do a Safe Casting

    println(stra?.length)



}
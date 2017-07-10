package julio.com.br.kotlinbasicsoreilly.advanced.adfunctions

import kotlin.properties.Delegates

/**
 * Created by Shido on 09/07/2017.
 */
typealias Name = String
data class Employee(val name: String, val email: String){

    //delegation
    var department: String by Delegates.observable("", {property, oldValue, newValue ->
        println("Property: $property Oldvalue: $oldValue New Value: $newValue")})  //Cria um delegate que ativa toda vez que o valor dessa property muda


    fun printName(string: Name){

    }


}

fun main(args: Array<String>) {
        val em = Employee("dsa","dsad@dsad.com")
        em.printName("Shido")
        em.department = "IT"

}
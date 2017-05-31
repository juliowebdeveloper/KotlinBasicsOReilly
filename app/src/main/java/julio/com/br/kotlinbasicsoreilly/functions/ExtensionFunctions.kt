package julio.com.br.kotlinbasicsoreilly.functions

/**
 * Created by mira on 31/05/2017.
 */

fun String.hello(){
    println("It's me")
}

fun String.toTitleCase(prefix: String): String{
    return this.split(" ").joinToString(" ") { "$prefix ${it.capitalize()}"}
    //This referencia àquele objeto ao qual estamos extendendo
}


fun main(args: Array<String>) {
    val string = "Another one"
    println("This is a sample string to Title case it".toTitleCase("Again - "))
    string.hello()
    "Hello".hello()

    val customer = Customer()
    customer.makePreferred("Param")


    val instance: BaseClass = InheritedClass()
    instance.extension() //Pega a extension function da base class
}

class Customer{
    fun makePrefereed() {
        println("Customer version")
    }
}

fun Customer.makePreferred(message: String){ //Static
    println("Extended version")
}

open class BaseClass

class InheritedClass: BaseClass()

fun BaseClass.extension(){
    println("Base extension")
}
fun InheritedClass.extension(){
    println("Inherited extension")
}
package julio.com.br.kotlinbasicsoreilly.advanced.adfunctions.metaprogramming

import java.lang.reflect.Type


/**
 * Created by Shido on 23/07/2017.
 */
class Transaction(val id:Int, val amount: Double, var descripton: String = "Default value"){
    fun validade(){
        if(amount>105340){
            println("Transaction is too large")
        }
    }
}

fun introspectInstance(obj: Any){
    println("Class ${obj.javaClass.simpleName}")
    println("Properties \n")
    obj.javaClass.declaredFields.forEach {
        println("${it.name} of type ${it.type}")
    }
    println("Functions \n")
    obj.javaClass.declaredMethods.forEach {
        println("${it.name}")
    }

    //getType(Transaction::class.java) - Passa o tipo de classe para uma function
}


fun main(args: Array<String>) {
    introspectInstance(Transaction(3, 200.9, "simple transaction"))
}
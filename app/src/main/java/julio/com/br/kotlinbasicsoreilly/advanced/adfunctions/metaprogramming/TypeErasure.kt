package julio.com.br.kotlinbasicsoreilly.advanced.adfunctions.metaprogramming

import android.app.Activity
import android.content.Intent

/**
 * Created by Shido on 23/07/2017.
 */
fun <T> printlist(list: List<out T>){
    when(list){
       // is List<String> -> "This is a list of strings" //Cannot check for instance of erased type: List<String> type erasure

    }

    if(list is List<*>){ //Unico tipo de checagem possível ja que  JVM faz type erasure
        println("This is a list")
    }

}

fun <T> printLit(obj: T){
    when(obj){
        is Int -> println("This is int")
        is String -> print("This is string")
    }

}


inline fun <reified T> erased(input: List<Any>){ //com o reified modificador é possivel fazer a checagem de um tipo de objeto e pegar informações daquele objecto em runtime:
    if(input is T){

    }
}

inline fun <reified  T: Activity> Activity.startActivity(){ //Extension function de activity
    startActivity(Intent(this, T::class.java))
    //Ao ser chamado:
    //startActivity<Activity2>()
}


inline fun <reified T> typeinfo(){
    println(T::class)
}

fun main(args: Array<String>) {
    val listOfString = listOf("one", "two", "three")
    val listOfNumbers = listOf(1, 2, 3 )

}
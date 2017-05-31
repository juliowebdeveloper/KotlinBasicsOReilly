package julio.com.br.kotlinbasicsoreilly.basics

import julio.com.br.kotlinbasicsoreilly.functions.toTitleCase
import julio.com.br.kotlinbasicsoreilly.basics.utils.someUtilities as someAditional

fun main(args: Array<String>){
    val message = "Hello from Android Studio".toTitleCase(" Prefix ") //Import package extension function
    println(message)
    someAditional("Name")


}
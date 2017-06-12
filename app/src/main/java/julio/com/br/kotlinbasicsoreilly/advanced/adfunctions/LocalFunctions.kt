package julio.com.br.kotlinbasicsoreilly.advanced.adfunctions

/**
 * Created by mira on 12/06/2017.
 */
fun foo(fooParam: String){//Outer function

    val outerFunction = "Value" //Agrupar functions

    fun bar(barParam: String){
        println(barParam)
        println(fooParam)
        println(outerFunction)

    }



}

fun main(args: Array<String>) {
    foo("v")
}
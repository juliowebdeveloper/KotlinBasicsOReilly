package julio.com.br.kotlinbasicsoreilly.advanced.adfunctions

/**
 * Created by mira on 12/06/2017.
 */
fun factorial(number: Int):Int{
    when(number){
        0, 1 -> return 1
        else -> return number * factorial(number - 1)
    }
}
//Ao inves de refazer a chamada à function ele troca essa chamada para um for loop
tailrec fun factorialTR(number: Int, accumulator: Int = 1): Int{
    when(number){
        0 -> return accumulator
        else -> return factorialTR(number -1, accumulator * number)//The last action is the call to itself
    }
}

fun main(args: Array<String>) {
    println(factorial(5))
    println(factorialTR(5))
}
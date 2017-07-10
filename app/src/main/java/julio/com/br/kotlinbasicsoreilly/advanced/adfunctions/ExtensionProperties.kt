package julio.com.br.kotlinbasicsoreilly.advanced.adfunctions

/**
 * Created by Shido on 09/07/2017.
 */
val String.hasAmpersan: Boolean //Toda extension propertie deve ter seu comportamento definido explicitamente
    get() = this.contains("&")

fun main(args: Array<String>) {
    println("Hello".hasAmpersan)
    println("Hello & hi".hasAmpersan)
}
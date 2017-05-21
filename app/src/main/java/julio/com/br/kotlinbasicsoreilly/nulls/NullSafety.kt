package julio.com.br.kotlinbasicsoreilly.nulls

/**
 * Created by Shido on 21/05/2017.
 */
fun main(args: Array<String>) {

    val messages: String = "Message"

    var nullMessage: String? = null
    val inferredNull= null

    nullMessage = "Some Value"
    println(nullMessage.length) //Smart Cast to Kotlin String ver a classe Casting


}
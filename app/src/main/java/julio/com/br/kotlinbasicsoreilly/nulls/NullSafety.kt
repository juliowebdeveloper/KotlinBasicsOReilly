package julio.com.br.kotlinbasicsoreilly.nulls

import julio.com.br.kotlinbasicsoreilly.classes.CustomerJava

/**
 * Created by Shido on 21/05/2017.
 */
class Service{
    fun evaluate(){}
}
class ServiceProvider(){
fun createServices(): Service?{
    return null
}
}


fun main(args: Array<String>) {

    val messages: String = "Message" //Types não podem ser null

    var nullMessage: String? = null
    val inferredNull= null

    nullMessage = "Some Value"
    println(nullMessage.length) //Smart Cast to Kotlin String ver a classe Casting

    val customerJava = CustomerJava()

    customerJava?.email

    val sp = createServiceProvider()
    sp?.createServices()?.evaluate()

}

private fun createServiceProvider(): ServiceProvider? = ServiceProvider()
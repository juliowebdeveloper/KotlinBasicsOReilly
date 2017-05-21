package julio.com.br.kotlinbasicsoreilly.classes

/**
 * Created by Shido on 21/05/2017.
 */
object Global{ //Objeto Global com apenas uma propriedade de read que também é um singleton sem precisar implementar o pattern
    val PI = 3.14
}


fun main(args: Array<String>) {

    val localObject = object {
        val PI  = 3.14159
    }
    println(localObject.PI)

    println(Global.PI)


}
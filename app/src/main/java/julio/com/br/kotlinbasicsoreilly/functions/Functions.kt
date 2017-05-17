package julio.com.br.kotlinbasicsoreilly.functions

/**
 * Created by Shido on 16/05/2017.
 */

fun hello(): Unit{ //Unit é um objeto por tanto é comparavel : se a function retornar unit do something
    println("Hello")
}

fun throwingExceptions():Nothing{ //Nothing é usado pra representar um valor que nunca existe, ela nunca retorna
    throw Exception("This function thros an exception")
}

fun returnsAFour():Int{ //Pode eliminar o return type
    return 4
}

fun takingString(name: String){
    println(name)
}

fun sum(x:Int, y: Int, z: Int = 0, w: Int = 0 )= x + y + z + w//Sem body e sem return type e default value no z
                //Com Default values não precisamos criar multiplos overloads


fun printDetails(name:String, email: String = "", phone:String){
    println("name $name -- email:  $email --- phone: $phone")
}

fun printStrings(vararg strings: String){ //Numero indefinido de parametros
    reallyPrintingStrings(*strings)//Passando varargs
}

private fun reallyPrintingStrings(vararg strings: String) {
    for (string in strings) {
        println(string)
    }
}

fun main(args: Array<String>) {
    hello()
    val value = returnsAFour()
    takingString("Shido")
    sum(1,2)
    sum(1,2,4)
    printDetails("Shido",  phone = "321313123")//Nomeando os parametros, com isso qualquer ordem pode ser passada
    printStrings("Oi", "Tudo bom", "Como vai")
    printStrings("Tchau", "Boa noite")





}

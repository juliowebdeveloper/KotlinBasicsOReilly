package julio.com.br.kotlinbasicsoreilly.basics

/**
 * Created by Shido on 14/05/2017.
 */
fun main(args: Array<String>) {

    var myString = "Not Empty"

    val result = if (myString != "") {
        println("NOT EMPTY") //Returning the last value of the expression
        "Value"
    } else if (myString != "Not") {
        20
    } else {
        "EMPTY" //If the condition matches return a number, else returns a string
    }



    println(result)


   val whenValue = when(result){ //Usando como ma expression, precisa de Else sempre
        "Value" -> {
            println("IS A STRING VALUE")
            "Returning from first when"
        }//Se cair nessa condição não irá para nenhuma outra, sem precisar do break do switch case
        is String -> {
            println("IS STRING")
            "Returning when string"
        }
        is Int -> {
            println("IS An INT")
            "Returning when is INT"
        }
       else -> {
           println("WHEN ELSE")
           "Returning when else"
       }
    }
    println(whenValue)



}
package julio.com.br.kotlinbasicsoreilly.functions

/**
 * Created by Shido on 21/05/2017.
 */
                             //Sintaxe de uma function que recebe dois ints e retorna um int
fun operation(x:Int, y:Int, op: (Int, Int) -> Int): Int {
        return op(x, y)
}

fun operation(x:Int, y: Int, op:(Int) ->Unit) {

}

fun route(path: String, vararg actions: (String, String) ->String ){

}



fun suma(x:Int, y:Int) = x + y

fun main(args: Array<String>) {
    val result = operation(2, 3, ::suma)
    println(result)
}
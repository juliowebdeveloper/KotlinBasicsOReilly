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
fun unaryOperation(x:Int,  op: (Int) -> Int){//Recebe como parametro uma function que recebe um int e retorna um int

}


fun suma(x:Int, y:Int) = x + y

fun main(args: Array<String>) {
    val result = operation(2, 3, ::suma)
    println(result)

    operation(1, 3, {x, y -> x +y})//Lambda expressions não precisam especificar o tipo explicitamente
    val sumLambda: (Int, Int) -> Int =  { x: Int, y: Int -> x + y } //Extraindo para uma variable
    val sumLambda2: (Int, Int) -> Int =  { x, y -> x + y }
    operation(1, 3, sumLambda)

    unaryOperation(1,  {x -> x * x})
    unaryOperation(2, {it * it})//Caso só tenha um parametro na function, é possivel usar "it" para substitui-lo



}
package julio.com.br.kotlinbasicsoreilly.functions

/**
 * Created by mira on 31/05/2017.
 */

fun outsideFunction(){

    for(number in 1..30) {
        unaryOperation(20, { x ->
            println(number) //Varia ao longo e muda a cada vez que esse valor é passado para essa lambda
            x * number
        }) //Closure - acessa essa variavel dentro dessa lambda

    }
}

fun main(args: Array<String>) {
    outsideFunction()

}

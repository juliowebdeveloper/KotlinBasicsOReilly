package julio.com.br.kotlinbasicsoreilly.advanced.adfunctions

/**
 * Created by mira on 12/06/2017.
 */
fun op(x: Int, op: (Int) -> Int): Int{
    return op(x)
}


fun main(args: Array<String>) {
    op(3, { it * it })

    op(4, fun(x): Int { //Diferença é que nesse caso é uma anonymous function(sem nome) com isso pode expressar o return type
        if (x > 10) {
            return 0
        } else {
            return x * x
        }

    } //Pode ter multiplos return points em anonymous functions, em lambdas não
    )

}


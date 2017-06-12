package julio.com.br.kotlinbasicsoreilly.advanced.adfunctions

/**
 * Created by mira on 12/06/2017.
 */
fun containingFunction() {
    val numbers = 1..100
    numbers.forEach myForEach@ {
        if (it % 5 == 0) {
            //return //Esse return está retornando da containingFunction e não da lambda e nunca executará o hello
            return@myForEach //Retorna só do foreach
            //Non local returns só pode ser chamado dentro de inline functions
        }
    }

    numbers.forEach ( fun(element) { //Em functions anonimas pode-se usar non local returns e retornará dessa fun anonima
        if (element % 5 == 0) {
            return
        }
    } )
    println("Hello")
}

fun main(args: Array<String>) {
    containingFunction()
}
package julio.com.br.kotlinbasicsoreilly.advanced.adfunctions

/**
 * Created by mira on 12/06/2017.
 */
infix fun String.shouldBeEqualTo(value: String) = this == value


fun main(args: Array<String>) {
    "Hello".shouldBeEqualTo("Hello")//Extension Function or Member functions that has single parameters can become infix

    val output = "Hello"
    output shouldBeEqualTo "Hello" //Otimo para Unit tests




}
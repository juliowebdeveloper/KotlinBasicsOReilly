package julio.com.br.kotlinbasicsoreilly.advanced.adfunctions

import kotlin.properties.Delegates

/**
 * Created by Shido on 09/07/2017.
 */
class Veto{
    var value: String by Delegates.vetoable("String"){property, oldValue, newValue -> newValue.startsWith("S") }
    //Melhor maneira de se colocar um get and set com conditions
    //Utilizando vetoable, na lambda expression, passamos alguma condição ou logica que será ativada toda vez que o valor de value seja alterado
    //O initial value é "String" e só será mudado e o valor passado começar com "S"
}

fun main(args: Array<String>) {
    val veto = Veto()
    println(veto.value)
    veto.value ="London"
    println(veto.value)
    veto.value = "Shido"
    println(veto.value)
}
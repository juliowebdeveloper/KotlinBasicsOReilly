package julio.com.br.kotlinbasicsoreilly.advanced.adfunctions.metaprogramming

import android.icu.lang.UCharacter.GraphemeClusterBreak.T
import kotlin.reflect.KClass
import kotlin.reflect.full.memberProperties

/**
 * Created by Shido on 23/07/2017.
 */

fun getKotlinType(obj: KClass<*>){
    print(obj.qualifiedName)
}

fun main(args: Array<String>) {
    val classInfo= Transaction::class

    classInfo.memberProperties.forEach{
        println("${it.name}    ${it.returnType}")
    }

    classInfo.constructors.forEach{
        println("Constructors: ${it.name} Params:   ${it.parameters}")

    }

    getKotlinType(Transaction::class)

    println("\n Reference:\n")
    val constructor = ::Transaction
    println(constructor)
    val transaction= constructor.call(1, 200, "Desc")
    val trans2 = constructor.callBy(mapOf(constructor.parameters[0] to 1, constructor.parameters[1] to 200)) //Usando CallBy ao inves de call e passando um map de parametros (já que possui um default parameter)

    println(transaction.descripton) //Cria uma instancia e imprime aquela property
    println(trans2.descripton) //Impresso do CallBy sem passar um parametro no description
    val validadeFun = Transaction::validade //Member Reference

    val trans3 = Transaction(1, 20.0, "new value")
    val nameProperty = Transaction::class.memberProperties.find { it.name== "descripton" } //Quando nao se sabe o valor é possivel usar um find para procurar por ela
    println("Name property:   ${nameProperty?.get(trans3)}")

}
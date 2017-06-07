package julio.com.br.kotlinbasicsoreilly.basics.stdlib

/**
 * Created by mira on 07/06/2017.
 */
//Only evaluate thing when I need them

fun main(args: Array<String>) {

    val elements = 1..10000000

   // val output = elements.filter { it < 30 }.map { Pair("Yes", it) } //Evaluating every single element

    //output.forEach { println(it) }


    /*val output2 = elements.asSequence().filter { it < 30 }.map { Pair("Yes", it) } //não aguarda terminar toda a operação para mostrar os resultados
    output2.forEach { println(it) }//Consome o quanto é necessário e vai mapeando e imprimindo, ao inves de fazer tudo no final

    */

    val output = elements.asSequence().take(30).sum() //Imprime os primeiros 30 elementos e já termina o processo
    println(output)

    val numbers = generateSequence(1){ x -> x + 10 }//Gera uma sequencia com o valor inicial (1) e adiciona 10 a cada um

    println(numbers.take(40).sum())

    val lazyInit: Int by lazy { 10 } //Permite iniciar o codigo de maneira lazy, será apenas inicializado quando essa variavel for chamada



}
package julio.com.br.kotlinbasicsoreilly.advanced.adfunctions

/**
 * Created by mira on 12/06/2017.
 */
//Inline Functions minimiza o impacto de performance que chamar functions encadeadas acarreta

inline fun operation(op: () -> Unit){ //Copy and paste os conteudos daquela function e a lambda para onde esta sendo chamada ao inves de invocar a function, só cola o codigo.
    println("Before calling op()")
    op()
    println("After calling op()")
}
inline fun operation2(noinline op: () -> Unit, op2: () -> Int){  //Inline the function mas nao a lambda
    println("Before calling op()")
    op()
    println("After calling op()")
}

inline fun tryingToInline(op:()->Unit){
   // val reference = op //Restriction : Não pode usar inline se eu armazenar a function em uma variavel
    println("Assigned value")
    op()
}
//Só pode usar inline em functions que chamam a lambda que está sendo passada basicamente
fun anotherFunction(){
    operation { println("This is the acton op function") }
}

fun main(args: Array<String>) {
    operation { println("This is the acton op function") }
}
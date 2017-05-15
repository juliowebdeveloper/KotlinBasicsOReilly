package julio.com.br.kotlinbasicsoreilly.basics

//One Package can have multiple main functions in different files but one per file

fun main(args: Array<String>) {

    for (a: Int in 1..100){// .. Built in function "rangeTo"
        println(a)
    }

    for (a in 1..100){ //Não precisa colocar o tipo, compilador infere
        println(a)
    }

    val numbers = 1..100 //Lista de numeros de 1 à 100

    for(a in numbers){
        println(a)
    }

    for(a in 100 downTo 1){ //Reverse loop
        println(a)
    }

    for(a in 100..1){ //Reverse loop
        println(a)
    }

    for (b in 100 downTo 1 step 5){
        println(b)
    }


    val capitals = listOf<String>("London","Paris", "Rome","Madrid")
    for (capital in capitals){
        println(capital)
    }

    var  i = 100
    while (i > 0){
        i--
    }

    do{
        var x = 10
        x--
    }while (x >10)

    loop@for(i  in 1..100){ //@loop is a label que pode ser definida
        for(j in 1..100){
            println("J: $j")
            if(j % i==0){
                println("Equals")
                break@loop //caso a condição seja encontrada ele da break no loop
            }
            if( j % i == 1){
                continue
            }
        }
    }



}
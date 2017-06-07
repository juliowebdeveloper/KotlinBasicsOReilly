package julio.com.br.kotlinbasicsoreilly.basics.stdlib

import java.io.File

/**
 * Created by mira on 07/06/2017.
 */

fun main(args: Array<String>) {
    val file = File("filename.txt")

    with(file){

    }

    val string: String? = "Some value"

    string?.let{ //Só executa o que estiver dentro se string não for null
        it.length
    }

}
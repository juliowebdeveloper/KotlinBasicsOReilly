package julio.com.br.kotlinbasicsoreilly.basics.stdlib

import java.io.File

/**
 * Created by mira on 07/06/2017.
 */
fun main(args: Array<String>) {
    val file = File("filename.txt")
    if(file.isAbsolute){
        file.name

    }
    /**
     * Calls the specified function [block] with the given [receiver] as its receiver and returns its result.
     */
    with(file){
        isAbsolute
        isHidden

    }
}
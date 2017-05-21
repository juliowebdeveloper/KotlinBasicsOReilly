package julio.com.br.kotlinbasicsoreilly.nulls

import java.io.BufferedReader
import java.io.FileReader

/**
 * Created by Shido on 21/05/2017.
 */
class NotANumberException(message: String) : Throwable(message) { //Pssando o parametro para o Throwable
}
fun checkIsNumber(obj:Any) {
    when(obj){
        !is Int, !is Long, !is Float, !is Double -> throw NotANumberException("This is not a number")
    }

}

fun main(args: Array<String>) {
    try{
        checkIsNumber("123321")

    }catch (e: NotANumberException){
        println("${e.message}")
    }catch (e: IllegalArgumentException){
        println("Do nothin")
    }

    val buffer = BufferedReader(FileReader("E:\\Development\\AndroidStudioProjects\\KotlinBasicsOReilly\\app\\src\\main\\java\\julio\\com\\br\\kotlinbasicsoreilly\\input.txt"))
    val result = try {
        val chars = CharArray(30)
        buffer.read(chars, 0, 45)
        200
    }catch (e: IndexOutOfBoundsException){
        println("Index out of bounds")
        -1 //Retornando valores do try catch
    }finally {
        println("Closing")
        buffer.close()
        -2
    }

    println(result)





}
package julio.com.br.kotlinbasicsoreilly.basics.stdlib

/**
 * Created by Shido on 25/06/2017.
 */
class Log private constructor(){

    companion object Factory{
        @JvmStatic
        fun createFileLog(filename: String) : Log = Log(filename)

    }

    constructor(filename: String): this(){

    }

    fun usingFactory(){
        Factory.createFileLog("dddddd")
    }


}

fun main(args: Array<String>) {
    //val log = Log()//Can't create instance
    val fileLog =  Log.createFileLog("ddddd")


}
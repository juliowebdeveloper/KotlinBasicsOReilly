package julio.com.br.kotlinbasicsoreilly.advanced.adfunctions


/*SEALED CLASS**/
/**
 * Created by Shido on 09/07/2017.
 */
sealed class PageResult{ //Somente essas classes abaixo irão herdar da PageResult
    class Success(val content: String): PageResult()
    class Error(val errorCode:String, val message: String): PageResult() //A partir de Kotlin 1.1 pode-se remover de dentro da PageResult e deixar no mesmo arquivo
} //Uma classe que representa dois valores distintos como boolean

fun getURLPage(url: String):PageResult{
    val wasValid = false
    if(wasValid){
        return PageResult.Success("Content")
    }else{
        return PageResult.Error("404", "notfound")
    }

}

fun main(args: Array<String>) {
    val pageResult =  getURLPage("/")
    when(pageResult ){
        is PageResult.Success -> print("Success ${pageResult.content}")
        is PageResult.Error -> print("Error code ${pageResult.errorCode}")
    }
}
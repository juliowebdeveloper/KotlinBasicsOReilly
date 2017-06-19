package julio.com.br.kotlinbasicsoreilly.advanced.adfunctions

/**
 * Created by Shido on 18/06/2017.
 */
class Request(val method: String, val query: String, val contentType: String)

class Response(var content: String, var status: Status){
    fun status(status: Status.() -> Unit){

    }
}

class Status(var code: Int, var description: String)


class RouteHandler(val request:Request, val response: Response){

    var executeNext = false
    fun next(){
        executeNext = true
    }
}


fun response(response: Response.()->Unit){}

fun routeHandler(path: String, f: RouteHandler.()->Unit):RouteHandler.() -> Unit = f
//Function que recebe como parametro uma extension function da classe RouteHandler
//E o retorno é também uma extension function que é igual ao valor passado como parametro

fun main(args: Array<String>) {

    routeHandler("/index.html") { //Tem acesso à request pois request é uma property de RouteHandler
        if(request.query != ""){
            //process
        }
        //Com lambda extensions é possível criar um codigo fluido e expressivo DSL seguindo conventions
        response{
            status{
                code = 505
                description = "Method not found"
            }

        }
    }

}

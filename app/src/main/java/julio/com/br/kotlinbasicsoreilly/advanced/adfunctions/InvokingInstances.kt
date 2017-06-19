package julio.com.br.kotlinbasicsoreilly.advanced.adfunctions

/**
 * Created by Shido on 18/06/2017.
 */
class Request2(val method: String, val query: String, val contentType: String)

class Response2(var content: String, var status: Status2){

    operator fun invoke(status: Status.() -> Unit){//

    }

}

class Status2(var code: Int, var description: String)


class RouteHandler2(val request:Request2, val response: Response2){
    var executeNext = false
    fun next(){
        executeNext = true
    }
}



fun routeHandler2(path: String, f: RouteHandler2.()->Unit) : RouteHandler2.() -> Unit = f
//Function que recebe como parametro uma extension function da classe RouteHandler
//E o retorno é também uma extension function que é igual ao valor passado como parametro

fun main(args: Array<String>) {

    routeHandler2("/index.html") { //Tem acesso à request pois request é uma property de RouteHandler
        if(request.query != ""){
            //process
        }

        response{ //Encapsulando code e description dentro de response mesmo tendo removido Status, sem precisar explicitamente chamar o status
            //Invoke permite que acessemos o Response2 objecto e façamos alguma funcionalidade, no caso esta recebe status como parametro, o que faz com que possamos acessa-lo
            //O response vem do RouteHandler2 como propriedade de sua classe  e a funcionalidade recebe uma lambda extension.
                code = 505
                description = "Method not found"
        }
        //


    }

    val manager = Manager()
    manager("Do something")//Invocando uma funcionalidade da classe apenas usando a instancia é possível com invoke


}

class Manager{

    operator fun invoke(value: String){

    }

}



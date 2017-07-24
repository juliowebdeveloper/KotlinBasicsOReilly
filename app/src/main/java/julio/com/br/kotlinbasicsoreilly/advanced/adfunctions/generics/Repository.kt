package julio.com.br.kotlinbasicsoreilly.advanced.adfunctions.generics

import java.io.Serializable

/**
 * Created by Shido on 23/07/2017.
 */


open class Entity(val id: Int)

class Repository<T: Entity>{ //Restringindo o que T pode ser - Quando for instanciar Repository deve passar como instancia uma classe que herda de Entity
    fun save(entity:T){
        if(entity.id != 0){
            //...
        }
    }
}


class RepositoryMultiple<T> where T: Entity, T:Serializable{ //Multiplas restrições
    fun save(entity:T){
        if(entity.id != 0){
            //...
        }
    }
}
//Restrições de parametros em functions
fun <T: Serializable> streamObject(obj: T){

}

fun main(args: Array<String>) {
    val repo = Repository<CustomerEntity2>()
    val repo2 = RepositoryMultiple<CustomerEntity3>()
}

class CustomerEntity3(val userId: Int): Entity(userId), Serializable {

}

class CustomerEntity2(val userId: Int): Entity(userId) {

}

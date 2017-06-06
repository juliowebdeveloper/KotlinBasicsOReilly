package julio.com.br.kotlinbasicsoreilly.classes

import java.io.IOException

/**
 * Created by mira on 18/05/2017.
 */
data class CustomerKotlin(var id: Int, var name: String, var email: String){

    @JvmField //JVM annotation permite que aquela propriedade seja acessada como um field
    val someProperty = "Value"

    @JvmOverloads fun changeStatus(status: Status = Status.Current) { //Default parameter precisa anotar com JvmOverload para que o Java reconheça
    }

    @JvmName("preferential") fun makePreferred(){ //Permite mudar o nome da function quando é chamada pelo Java

    }

    @Throws(IOException::class)fun loadStatittics(filename: String){//Annotation para que o java identifique que essa function pode lançar uma IoException
        if(filename == ""){
            throw IOException("Filename cannot be blank")
        }
    }

    override fun toString(): String {
        return "{\"id\":\"$id\", \"name\": \"$name\", \"email\":\"$email\"}"
    }
}

enum class Status {
        Current,
         Past
}

fun main(args: Array<String>){
        val customer = CustomerKotlin(1, "Julio", "julioribeiro@mira.vc")
        val customer2 = CustomerKotlin(2, "Julio", "julioribeiro@mira.vc")
        println(customer)
        val customer3 = customer
        val customer4 = customer.copy()
        if(customer == customer2){
            println("They are the same");
        }

        println(customer3.id)
        println(customer4.id)
        println(customer4.name)

        val customer5 = customer.copy(12, email ="julio")
        println(customer5)
    }


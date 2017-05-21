package julio.com.br.kotlinbasicsoreilly.classes

/**
 * Created by mira on 18/05/2017.
 */
data class CustomerKotlin(var id: Int, var name: String, var email: String){
    override fun toString(): String {
        return "{\"id\":\"$id\", \"name\": \"$name\", \"email\":\"$email\"}"
    }
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


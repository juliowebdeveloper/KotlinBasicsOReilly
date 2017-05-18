package julio.com.br.kotlinbasicsoreilly.classes

/**
 * Created by mira on 18/05/2017.
 */
class CustomerKotlin(var id: Int, var name: String, var email: String) {

    fun main(args: Array<String>){
        val customer = CustomerKotlin(1, "Julio", "julioribeiro@mira.vc")
        println(customer)
    }

}
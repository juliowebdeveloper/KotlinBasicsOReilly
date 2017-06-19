package julio.com.br.kotlinbasicsoreilly.advanced.adfunctions

/**
 * Created by mira on 19/06/2017.
 */
interface Repository{
    fun getAll(): List<Customer>
}

class CustomerController(){
    lateinit var repository: Repository

    fun index(): String{
        return repository.getAll().toString()
    }


}

fun main(args: Array<String>) {
    val customerController = CustomerController()
    customerController.index()
}
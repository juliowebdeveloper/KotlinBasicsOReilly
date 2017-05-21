package julio.com.br.kotlinbasicsoreilly.inheritance

/**
 * Created by Shido on 21/05/2017.
 */
interface Repository<T>{

    fun getById(id: Int): T
    fun getAll(): List<T>

}

fun main(args: Array<String>) {
    val customerRepo = GenericRepository<Customer>()

    val customer = customerRepo.getById(1)
    val customers = customerRepo.getAll()


}
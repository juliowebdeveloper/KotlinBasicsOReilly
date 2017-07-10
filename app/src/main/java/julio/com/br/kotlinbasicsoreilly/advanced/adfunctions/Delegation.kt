package julio.com.br.kotlinbasicsoreilly.advanced.adfunctions

/**
 * Created by Shido on 09/07/2017.
 */
interface CustomerRepository{
    fun getById(id:Int) : Customer
    fun getAll(): List<Customer>
}
interface Logger{
    fun logAll()
}
class Controller(repository: CustomerRepository, logger: Logger): CustomerRepository by repository , Logger by logger{ //Delegando o parametro para aquele customer repository
                                                    //Delegate the functionality of repository to the instance being passed in //Delegation member functions


    fun index():String{
        getAll() //Where does it come from, since we don't need to specify the property when calling it ?- Don't pass two many dependencies
        getById(2)
        logAll()
        return ""
    }

}
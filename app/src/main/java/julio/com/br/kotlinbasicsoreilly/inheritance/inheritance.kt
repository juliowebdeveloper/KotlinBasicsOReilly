package julio.com.br.kotlinbasicsoreilly.inheritance

/**
 * Created by Shido on 21/05/2017.
 */
open class Person{ //Can be inherited
        open fun validate(){ //Can be overrided

        }


}
open class Customer: Person{
    final override fun validate() { //Fuction final nao pode ser overrided
        super.validate()
    }
    constructor():super(){ //Constructor matching super

    }

}

class SpecialCustomer: Customer(){

}


data class CustomerEntity(val name:String):Person() //Antes de Kotlin 1.1 não era possivel essa hierarquia

fun main(args: Array<String>) {
    val customer = Customer()
    customer.validate()


}
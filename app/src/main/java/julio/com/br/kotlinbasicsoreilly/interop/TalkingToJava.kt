package julio.com.br.kotlinbasicsoreilly.interop

import julio.com.br.kotlinbasicsoreilly.classes.CustomerJava

/**
 * Created by mira on 06/06/2017.
 */
fun main(args: Array<String>) {
    val customer = CustomerJava()

    customer.email = "mail@shido.com"
    customer.prettyPrint() //Invoking java methods

    val runnable = Runnable { println("RUN FROM RUNNABLE JAVA INTEROP WITH KOTLIN") } //Não precisa implementar a interface runnable ja que tem apenas um metodo

    val kr = KotlinCustomerRepo()
    val customerJava = kr.getbyId(10)

    customerJava.id.toString() //This is potentional null
    customerJava.neverNull()
}
class PersonKotlin: PersonJava(){ //Inherit from java class

}

class RunnableKotlin: Runnable{
    override fun run() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

}

class KotlinCustomerRepo: CustomerRepositoryJava{ //Implementing Java interface
    override fun getbyId(id: Int): CustomerJava {//Cannot be null
        TODO("not implemented")
    }

    override fun getAll(): MutableList<CustomerJava>? { //Can be null - Up to programmers to decide if this is going to be null
        TODO("not implemented")
    }

}
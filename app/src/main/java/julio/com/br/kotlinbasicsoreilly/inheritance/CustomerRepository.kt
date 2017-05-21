package julio.com.br.kotlinbasicsoreilly.inheritance

/**
 * Created by Shido on 21/05/2017.
 */

interface CustomerRepository{
    val isEmpty: Boolean
            get() = true


    fun store(obj: Customer){
        //Implementation on Interface - Não mantem estados em interfaces diferente de classe abstrata
    }
    fun getById(id: Int): Customer
}

interface EmployeeRespository{
    fun store(obj: Employee){

    }
    fun getById(id:Int): Employee
}



class SqlCustomerRepo: CustomerRepository{
    override fun getById(id: Int): Customer {
        return Customer()
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun store(obj: Customer) {
        super.store(obj)
        println("Custom implementation of store")
    }

    override val isEmpty: Boolean
        get() = false

}


interface Interface1{
    fun funA(){
        println("Fun A from Interface1")
    }
}


interface Interface2{
    fun funA(){
        println("Fun A from Interface2")
    }
}


class Class1And2: Interface1, Interface2 {
    override fun funA() {
        super<Interface1>.funA() //Para resolver a ambiguidade de qual interface funA() deve ser chamado
        print("Our own")
    }

}

fun main(args: Array<String>) {
    val clazz = Class1And2()
    clazz.funA()
}
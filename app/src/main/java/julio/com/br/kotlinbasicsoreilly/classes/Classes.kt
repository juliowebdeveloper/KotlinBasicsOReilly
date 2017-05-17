package julio.com.br.kotlinbasicsoreilly.classes

import java.util.*

/**
 * Created by Shido on 16/05/2017.
 */

class Customer(var id:Int, var name:String = ""){ //Tudo passado aqui vira o construtor dessa class(Podendo ter default values)
                                //Removendo o var deixa de seruma propriedade da classe e fica sendo só um valor a ser passado para o construtor
   /*    var id = initId//Properties - Não há o conceito de fields
    var name:String = initName
*/

    init { //Executa quando a classe é criada
         name = name.toUpperCase()
    }

    constructor(email: String, name: String): this(0, name){ //Segundo construtor sempre deve chamar o construtor primario
                                                //Cada construtor segundario deve delegar para o construtor primario seus parametros necessarios
    }


}

class Person(var id: Int, var name: String, val yearOfBirth: Int){
    val age:Int
        get() = Calendar.getInstance().get(Calendar.YEAR ) - yearOfBirth //Custom getter for age

    var socialSecurityNumber:String = ""
        set(value) { //Custom set
            if(!value.startsWith("SN")){
                throw IllegalArgumentException("Social Security Should Start With SN")
            }
            field = value //Field é um campo especial reconhecido que possui a propriedade em si (um backfield)
        }

}



fun main(args: Array<String>) {
    val customer = Customer(10, "Shido")
    val customer2 = Customer (5)

    val customer3 = Customer("email", "Becker")

   // customer.id = 10
   // customer.name = "Shido"
    println(customer.name)
    println(customer3.name + customer3.id)

    val person = Person(10, "Tony", 1973)
    person.socialSecurityNumber = "SNdsadsad"
    println(person.age)
    println(person.socialSecurityNumber)
}

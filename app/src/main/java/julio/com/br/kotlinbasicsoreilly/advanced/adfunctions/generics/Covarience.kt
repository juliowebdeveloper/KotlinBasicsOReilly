package julio.com.br.kotlinbasicsoreilly.advanced.adfunctions.generics

/**
 * Created by Shido on 23/07/2017.
 */
open class Person
class Employee: Person()


fun operate(person:List<Person>) {

}


interface ReadOnlyRepo<out T>{ //Esse out diz que o valor passado não será modificado : ReadOnly, por isso do "out", o valor será apenas passado para fora
    fun getId(id:Int): T
    fun getAll(): List<T>
}


interface WriteRepo<in T>{ //In variance = Contravariance
        fun save(obj: T)
        fun saveAll(list: List<T>)
}

fun main(args: Array<String>) {
        operate(listOf<Person>())
    operate(listOf<Employee>())
    val ro = ReadOnlyRepoImpl<Person>()
    val ro2 = ReadOnlyRepoImpl<Employee>() //Implementação permite passar os dois tipos de array
    ro.getAll()
    ro.getId(1)
    ro2.getAll()
    ro2.getId(2)


}
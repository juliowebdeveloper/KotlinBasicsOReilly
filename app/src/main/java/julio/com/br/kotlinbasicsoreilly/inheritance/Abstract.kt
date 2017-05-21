package julio.com.br.kotlinbasicsoreilly.inheritance

/**
 * Created by Shido on 21/05/2017.
 */
abstract class StoredEntity {
    val isActive = true

    abstract fun store() //Não há implementação Default

    fun status(): String{ //Classes abstratas podem ter implementações
        return isActive.toString()
    }
}

class Employee: StoredEntity(){
    override fun store() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

}

fun main(args: Array<String>) {
    val se = Employee()
    se.isActive
    se.status()
}
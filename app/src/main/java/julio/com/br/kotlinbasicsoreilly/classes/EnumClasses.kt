package julio.com.br.kotlinbasicsoreilly.classes

/**
 * Created by Shido on 21/05/2017.
 */
enum class Priority(val value: Int){
    MINOR (-1){
        override fun text(): String {
            return "MINOR PRIORITY-----"
            TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        }

        override fun toString(): String {
            return "Minor Priority"
        }
    },
    NORMAL(0) {
        override fun text(): String {
            TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        }
    },
    MAJOR(1) {
        override fun text(): String {
            TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        }
    },
    CRITICAL(2) {
        override fun text(): String {
            TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        }
    };

    abstract fun text():String //Function abstract que todos os enums devem implementas
}

fun main(args: Array<String>) {
    val priority = Priority.NORMAL

    println(priority)
    println(priority.value)
    println(priority.ordinal)
    println(Priority.MAJOR.name)

    for (prior in Priority.values()){
        println(prior)
    }

    println(Priority.valueOf("MAJOR").ordinal)
    println(Priority.MINOR.text())



}
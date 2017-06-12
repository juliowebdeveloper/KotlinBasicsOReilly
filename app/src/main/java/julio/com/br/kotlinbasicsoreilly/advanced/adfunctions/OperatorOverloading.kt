package julio.com.br.kotlinbasicsoreilly.advanced.adfunctions

/**
 * Created by mira on 12/06/2017.
 */
class Time(val hours: Int, val mins: Int){
    operator fun plus(time: Time): Time{//Para que essa func seja chamanda como um operador
        val minutes = this.mins + time. mins
        val hoursInMinutes = minutes /60
        val remainingMinutes = minutes % 60
        val hours = this.hours + time.hours + hoursInMinutes
        return Time(hours, remainingMinutes)
    }
}


operator fun StringBuilder.plus(stringBuilder: StringBuilder){
    stringBuilder.forEach { this.append(it) }
}

fun main(args: Array<String>) {
    val newTime = Time(10, 40) + Time(3, 20)

    println(newTime)

    val sb = StringBuilder()
    for(str in sb){
        str + "Value"
    }
}
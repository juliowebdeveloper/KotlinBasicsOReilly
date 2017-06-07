package julio.com.br.kotlinbasicsoreilly.basics.stdlib

import java.util.*

/**
 * Created by mira on 07/06/2017.
 */
fun main(args: Array<String>) {

    var list: List<String> = ArrayList() //Declaring a type immutable and instantiante as mutable

    var list2 = listOf("First Entry","Second Entry")//Create uma readOnly list of given elements - Sempre usar helperFunction
    var emptyList = emptyList<String>() //Kotlin EmptyList

    var numbers = 1..100

    val cities = listOf("Madri", "London", "Paris")

    println(cities.javaClass)//Java type which it corresponds (ArrayList)

    val arrayList = Arrays.asList("Sao paulo", "London") //Same as cities



    //Mutable list:
    val mutableCities = mutableListOf("Madrid")
    mutableCities.add("São paulo")


    val hashMap = hashMapOf(Pair("Madrid", "Spain"), Pair("Paris","France"))

    val booleans = booleanArrayOf(true, false, true)
    val characters = charArrayOf('d', 'a', 'b')
    val floats = floatArrayOf(12f, 123f, 55f)



}
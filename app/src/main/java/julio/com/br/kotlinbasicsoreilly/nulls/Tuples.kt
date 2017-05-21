package julio.com.br.kotlinbasicsoreilly.nulls

import julio.com.br.kotlinbasicsoreilly.classes.CustomerKotlin

/**
 * Created by Shido on 21/05/2017.
 */

fun capitalAndPopulation(country: String): Pair<String, Long>{
    return Pair("Madrid", 20202022)
}

fun countryInformation(country:String): Triple<String, String, Long>{
    return Triple("Madrid", "Spain", 321323213)
}

fun main(args: Array<String>) {

    val result = capitalAndPopulation("Madrid")
    println("${result.first} __________________ ${result.second}")
    val result2 = countryInformation("Madrid")
    println("${result2.first} --- ${result2.second} ==== ${result2.third}")
    //Descontructing values:
    val (capital, population) = capitalAndPopulation("Madrid") //Dizendo que essa function irá retornar dois valores, captial e population
    println(capital) //Com isso temos de volta a semantica que o Pair/triple remove
    //Equivalente à
    result.component1()
    result.component2()

    println(population)


    val (id, name, email) = CustomerKotlin(1, "Shido", "Email")
    println(id)
    println(email)


    var listOfCapitalsAndCountries = listOf(Pair("Madrid","Spain"),"Paris" to "France", "London" to "UK")

    for ((capital2, country) in listOfCapitalsAndCountries){ //Desconstruindo valores
        println("$capital2 and $country")
    }
}
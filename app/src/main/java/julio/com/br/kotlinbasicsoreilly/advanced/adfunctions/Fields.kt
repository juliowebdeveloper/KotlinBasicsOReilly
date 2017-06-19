package julio.com.br.kotlinbasicsoreilly.advanced.adfunctions

/**
 * Created by mira on 19/06/2017.
 */

class Customer() {

    private var myCustomField = 10


    var lastPurchasedAmount: Double = 0.0
        get() = field
        set(value) {
    if(value > 1000) {
        field = value
    }
}

}

fun main(args: Array<String>) {
    val customer = Customer()
    println(customer.lastPurchasedAmount)
    customer.lastPurchasedAmount = 200.0
    println(customer.lastPurchasedAmount)
    customer.lastPurchasedAmount =  1300.0
    println(customer.lastPurchasedAmount)
}

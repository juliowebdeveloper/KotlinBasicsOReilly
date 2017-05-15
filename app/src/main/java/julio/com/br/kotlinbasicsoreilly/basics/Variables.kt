package julio.com.br.kotlinbasicsoreilly.basics

fun main(args: Array<String>) {

    var streetNumber: Int //Mutable type
    var streetName = "High Street"

    val zip = "E11 P2" //Immutable
    streetName = "Matusalem Matoso"

    val myLong = 10L
    val myFloat = 100F
    val myHex = 0x0F
    val myBinary = 0xb01

    val myInt = 100
    val myLong2: Long = myInt.toLong()

    //Strings:
    val myChar = 'A'
    val myString = "My String"

    val escapeCharacters = "a new line \n"
    val rawString = "Hello "+
                        "Second Line"
    val multipleLines = """
            This is a string
            another line
            another one
            and one more
                    """

    val years = 10
    val message = "A decade is $years years"

    val name = "Mary"
    val anotherMessage = "Length of name is ${name.length}"



}

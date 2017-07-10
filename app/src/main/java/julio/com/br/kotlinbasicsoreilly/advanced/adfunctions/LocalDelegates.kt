package julio.com.br.kotlinbasicsoreilly.advanced.adfunctions

/**
 * Created by Shido on 09/07/2017.
 */
fun localDelegateProperties(){
    val lazy by lazy { initLate() }

}

fun  initLate(): String {
    throw UnsupportedOperationException("")
}

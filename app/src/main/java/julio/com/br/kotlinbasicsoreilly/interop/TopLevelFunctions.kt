@file:JvmName("UtilityClass") //Renomeando a "static class" que é gerada
package julio.com.br.kotlinbasicsoreilly.interop

/**
 * Created by mira on 07/06/2017.
 */

val CopyRightYear = 2017

const val CopyRightYear2 = 2014


fun prefix(prefix: String, value: String): String{
    return "$prefix-$value"
}


package julio.com.br.kotlinbasicsoreilly.advanced.adfunctions

import kotlin.properties.ReadWriteProperty
import kotlin.reflect.KProperty

/**
 * Created by Shido on 09/07/2017.
 */
class Service{

    var someProperty: String by  ExternalFunctionality() //Quando queremos delegar uma propertie precisamos criar uma classe com dois member functions getvalue e setValue
                                                            //Var precisa de get e set, val só get


}

class ExternalFunctionality{

    var backingField ="Default"

    operator fun  getValue(service: Service, property: KProperty<*>): String { //Valor retornado quando alguem le essa property
        println("getValue called with params \n" + "service: $service\n" + "property: ${property.name}")//Usa reflection para pegar informações da propriedade
        return backingField
    }
    operator fun  setValue(service: Service, property: KProperty<*>, value: String) { //External getters and setters
        backingField = value

    }
}

fun main(args: Array<String>) {
    val service = Service()
    println(service.someProperty)
    service.someProperty = " Novo valor"
    println(service.someProperty)
}
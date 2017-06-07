package julio.com.br.kotlinbasicsoreilly.interop;

import java.io.IOException;

import julio.com.br.kotlinbasicsoreilly.classes.CustomerKotlin;
import julio.com.br.kotlinbasicsoreilly.classes.CustomerKotlinKt;
import julio.com.br.kotlinbasicsoreilly.classes.Status;

/**
 * Created by mira on 06/06/2017.
 */

public class TalkingToKotlin {

    public void loadStats(CustomerKotlin customerKotlin){
        try {
            customerKotlin.loadStatittics("filename"); //@Throws
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        CustomerKotlin customerKotlin = new CustomerKotlin(1, "Jado", "mail@jado.com");
        customerKotlin.setEmail("mail2@dsadas.com");

        String value = customerKotlin.someProperty; //JVM annotation permite que aquela propriedade seja acessada como um field

        customerKotlin.changeStatus(Status.Current);
        customerKotlin.changeStatus(); //Overloaded version
        customerKotlin.preferential();

        //Calling a top level function
        UtilityClass.prefix("some", "value"); //Filename.functionName

        UtilityClass.getCopyRightYear(); //Filename.property
        int x = UtilityClass.CopyRightYear2; //Field access

        CustomerKotlinKt.extension(customerKotlin);//Acessando uma extension function da classe CustomerKotlin passando uma instancia daquela classe

    }
}

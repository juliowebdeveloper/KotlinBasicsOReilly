package julio.com.br.kotlinbasicsoreilly.interop;

import java.util.List;

import julio.com.br.kotlinbasicsoreilly.classes.CustomerJava;

/**
 * Created by mira on 06/06/2017.
 */

public interface CustomerRepositoryJava {

    CustomerJava getbyId(int id);
    List<CustomerJava> getAll();
}

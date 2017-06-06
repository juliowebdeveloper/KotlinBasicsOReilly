package julio.com.br.kotlinbasicsoreilly.classes;

import org.jetbrains.annotations.NotNull;

/**
 * Created by mira on 18/05/2017.
 */

public class CustomerJava {

    private int id;
    private String name;
    private String email;

    @Override
    public String toString() {
        return "CustomerJava{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                '}';
    }


    public void prettyPrint(){
        System.out.printf("id: %d - Name: %s%\n", id, name);
    }

    public @NotNull String neverNull(){ return "This is never null"; } //Jetbrains annotation

    public String sometimesNull(){
            return "A string";

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CustomerJava that = (CustomerJava) o;

        if (id != that.id) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        return email != null ? email.equals(that.email) : that.email == null;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (email != null ? email.hashCode() : 0);
        return result;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}

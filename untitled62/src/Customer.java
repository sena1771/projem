import java.io.Serializable;

public class Customer implements Serializable {
    int id;
    String name;
    public Customer(int id,String name) {
        this.id = id;

        this.name=name;
    }
    public String toString()
    {
        return "\nCustomer ID: " + "\nID: " + this.id + "\nName: " + this.name;
    }
}

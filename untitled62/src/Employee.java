import java.io.Serializable;
import java.util.ArrayList;

class Employee implements Serializable {

    int id;
      String name;
      String branch;


    public Employee(int id,String name,String branch) {
        this.id = id;
        this.branch=branch;
        this.name=name;
    }
    public String toString()
    {
        return "\nEmployee :" + "\nID: " + this.id + "\nName: " + this.name + "\nBranch: "+ this.branch;
    }
    static void display4(ArrayList<Customer> all)
    {
        System.out.println("\n--------------Customer List---------------\n");
        System.out.println(String.format("%-10s%-20s", "ID","Name"));
        for(Customer a : all)
        {
            System.out.println(String.format("%-10s%-20s",a.id,a.name));
        } }

}


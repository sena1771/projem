import java.io.*;
import java.util.ArrayList;

public class Admin {

    static void display(ArrayList<Employee> al)
    {
        System.out.println("\n--------------Employee List---------------\n");
        System.out.println(String.format("%-10s%-20s%-10s", "ID","Name", "Branch"));
        for(Employee e : al)
        {
            System.out.println(String.format("%-10s%-20s%-10s",e.id,e.name,e.branch));
        } }
    static void display2(ArrayList<Transportation> al2)
    {
        System.out.println("\n--------------Transportation Personel List---------------\n");
        System.out.println(String.format("%-10s%-10s%-10s", "ID","Name", "Branch"));
        for(Transportation e : al2)
        {
            System.out.println(String.format("%-10s%-10s%-10s",e.id1,e.name1,e.branch1));
        } }
    static void display3(ArrayList<Branch> al3)
    {
        System.out.println("\n--------------Branch List---------------\n");
        System.out.println(String.format("%-10s%-10s", "ID","Name"));
        for(Branch e : al3)
        {
            System.out.println(String.format("%-10s%-10s",e.id2,e.name2));
        } }
}
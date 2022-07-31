import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int id;
        String name;
        String branch;

        Shipment shipment1 = new Shipment(1, "Sena Engin", "Fatma Dogan");
        Shipment shipment2 = new Shipment(2, "Feyza Engin", "Ayse Dogan");
        //List all=new ArrayList<Customer>();
        ArrayList<Customer> all = new ArrayList<Customer>();
        File f4=null;
        FileInputStream fis4=null;
        ObjectInputStream ois4=null;
        FileOutputStream fos4=null;
        ObjectOutputStream oos4=null;
        //Scanner scannn=new Scanner(System.in);

        ArrayList<Transportation> al2 = new ArrayList<Transportation>();
        File f1= null;
        FileInputStream fis1=null;
        ObjectInputStream ois1 = null;
        FileOutputStream fos1=null;
        ObjectOutputStream oos1=null;
        Scanner scan = new Scanner(System.in);
        //List al=new ArrayList<Employee>();
        //

        ArrayList<Employee> al = new ArrayList<Employee>();
        File f = null;
        FileInputStream fis = null;
        ObjectInputStream ois=null;
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;
        Scanner scanner = new Scanner(System.in);
        //Scanner scanner1=new Scanner(System.in);

        ArrayList<Branch> al3 = new ArrayList<Branch>();
        File f2 = null;
        FileInputStream fis2 = null;
        ObjectInputStream ois2 = null;
        FileOutputStream fos2 = null;
        ObjectOutputStream oos2 = null;
        // Scanner scanner2=new Scanner(System.in);

        System.out.println("Enter the system as a:  \n 1-Administrator \n " +
                "2-Branch employee \n " +
                "3-Transportation personnel \n" +
                "4-Customer\n" +
                "5-Exit");

        int enter = scanner.nextInt();
        try {

            f4 = new File("C:\\Users\\DELL\\IdeaProjects\\untitled62\\src\\EmployeeDataList4.txt");
            //boolean result;
            //result = f4.createNewFile();
            if (f4.exists()) {
                fis4 = new FileInputStream(f4);
                ois4 = new ObjectInputStream(fis4);
                all = (ArrayList<Customer>) ois4.readObject();
            }

        } catch (Exception exp) {
            System.out.println(exp);
        }
        try {
            //Path fi = Paths.get("C:\\Users\\DELL\\IdeaProjects\\untitled62\\src\\EmployeeDataList1.txt");
           /*try {
               Files.write(fi, al);
               System.out.println(fi.toFile().getAbsolutePath());
           } catch (Exception e) {
               e.printStackTrace();
           } */
            f = new File("C:\\Users\\DELL\\IdeaProjects\\untitled62\\src\\EmployeeDataList1.txt");
            /*BufferedWriter writer = new BufferedWriter(new FileWriter(f, true));
            writer.write(al.toString());
            writer.newLine();
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        } */
            if(f.exists())
            {
                fis = new FileInputStream(f);
                ois = new ObjectInputStream(fis);
                al = (ArrayList<Employee>)ois.readObject();
            }

        }
            //ois.close();
            //f.mkdirs();
            //f.createNewFile();
          /* try {
               Files.write(f, al);
               System.out.println(
                       f.toFile().getAbsolutePath()
               );
           } catch (Exception e) {
               e.printStackTrace();
           } */
            //boolean result;
            //try
            //{
            //result = f.createNewFile();
           /* if(result)
            {
                fis = new FileInputStream(f);
                ois = new ObjectInputStream(fis);
                al = (ArrayList<Employee>)ois.readObject(); */


               /* try {
                    path(output, arrList);
                    System.out.println(
                            output.toFile().getAbsolutePath()
                    );
                } catch (Exception e) {
                    e.printStackTrace();
                }
*}
           /* else {
                System.out.println("ddff"); }*/


           catch(Exception exp){
            System.out.println(exp);
        }

        try{
            f2 = new File("C:\\Users\\DELL\\IdeaProjects\\untitled62\\src\\EmployeeDataList2.txt");
            //f2 = new File("EmployeeDataList2.txt");
            //boolean result;
            //result = f2.createNewFile();
            if(f2.exists())
            {

                fis2 = new FileInputStream(f2);
                ois2 = new ObjectInputStream(fis2);
                al3 = (ArrayList<Branch>)ois2.readObject();
            }


        } catch(Exception exp1){
            System.out.println(exp1);
        }
        try{
            f1 = new File("C:\\Users\\DELL\\IdeaProjects\\untitled62\\src\\EmployeeDataList.txt");
           // boolean result;
           // result = f1.createNewFile();
            if(f1.exists())
            {
                fis1 = new FileInputStream(f1);
                ois1 = new ObjectInputStream(fis1);
                al2 = (ArrayList<Transportation>)ois1.readObject();
            }


        } catch(Exception exp2){
            System.out.println(exp2);
        }



        switch (enter){
            case 1:
        do
        {
            System.out.println("\n*********Welcome to the Employee Management System**********\n");
            System.out.println("1). Add Employee to the DataBase\n" +
                    "2). Search for Employee\n" +
                    "3). Delete Employee \n" +
                    "4). List All Employees \n" +
                    "5). EXIT\n" +
                    "6). Add Transportation Personnel \n "+
                    "7). Search for Transportation Personnel \n" +
                    "8). Remove Transportation Personnel \n "+
                    "9). List All Transportation Personnel \n" +
                    "10) . Add Branch \n "+
                    "11) . Remove Branch \n"+
                    "12). List All Branches");
            System.out.println("Enter your choice : ");
            int ch = scan.nextInt();
            switch(ch) {
                case 1:

                    System.out.println("\nEnter the following details to ADD list:\n");
                    System.out.println("Enter ID :");
                    id = scan.nextInt();
                    System.out.println("Enter Name :");
                    name = scan.next();
                    System.out.println("Enter Branch: ");
                    branch = scan.next();


                    al.add(new Employee(id, name, branch));
                    Admin.display(al);
                    break;
                case 2:
                    System.out.println("Enter the Employee ID to search :");
                    id = scan.nextInt();
                    int i = 0;
                    for (Employee e : al) {
                        if (id == e.id) {
                            System.out.println(e + "\n");
                            i++;
                        }
                    }
                    if (i == 0) {
                        System.out.println("\nEmployee Details are not available, Please enter a valid ID!!");
                    }
                    break;

                case 3:
                    System.out.println("\nEnter Employee ID to DELETE from the Database :");
                    id = scan.nextInt();
                    int k = 0;
                    try {
                        for (Employee e : al) {
                            if (id == e.id) {
                                al.remove(e);
                                Admin.display(al);
                                k++;
                            }
                        }
                        if (k == 0) {
                            System.out.println("\nEmployee Details are not available, Please enter a valid ID!!");
                        }
                    } catch (Exception ex) {
                        System.out.println(ex);
                    }
                    break;
                case 4:
                    try {
                        al = (ArrayList<Employee>)ois.readObject() ;

                    } catch (ClassNotFoundException e2) {

                        System.out.println(e2);
                    } catch (Exception e2) {

                        System.out.println(e2);
                    }
                    Admin.display(al);
                    break;

                case 5:
                    try {
                        fos = new FileOutputStream(f);
                        oos = new ObjectOutputStream(fos);
                        oos.writeObject(al);
                        fos1=new FileOutputStream(f1);
                        oos1=new ObjectOutputStream(fos1);
                        oos1.writeObject(al2);
                        fos2=new FileOutputStream(f2);
                        oos2=new ObjectOutputStream(fos2);
                        oos2.writeObject(al3);
                        fos4=new FileOutputStream(f4);
                        oos4=new ObjectOutputStream(fos4);
                        oos4.writeObject(all);
                    } catch (IOException e1) {
                        e1.printStackTrace();
                    } catch (Exception e2) {
                        e2.printStackTrace();
                    }


                    finally{
                    try {

                        ois.close();
                        fos.close();
                        oos.close();
                        ois1.close();
                        fos1.close();
                        oos1.close();
                        ois2.close();
                        fos2.close();
                        oos2.close();
                        ois4.close();
                        fos4.close();
                        oos4.close();

                    } catch (Exception e1) {
                        e1.printStackTrace();
                    }

                }
                System.out.println("\nYou have chosen EXIT !! Saving Files and closing the tool.");
                scan.close();
                System.exit(0);
                    /*System.out.println("Enter the system as a:  \n 1-Administrator \n " +
                            "2-Branch employee \n " +
                            "3-Transportation personnel \n" +
                            "4-Customer\n"+
                            "5-Exit");
                    int enter2 = scanner.nextInt();*/
                break;



                case 6:
                    System.out.println("\nEnter the following details to ADD list:\n");
                    System.out.println("Enter Transportation Personel ID :");
                    id = scan.nextInt();
                    System.out.println("Enter Name :");
                    name = scan.next();
                    System.out.println("Enter Branch: ");
                    branch = scan.next();
                    al2.add(new Transportation(id, name, branch));
                    Admin.display2(al2);
                    break;
                case 7:
                    System.out.println("Enter the Transport Personel ID to search :");
                    id = scanner.nextInt();
                    int i1 = 0;
                    for (Transportation e : al2) {
                        if (id == e.id1) {
                            System.out.println(e + "\n");
                            i1++;
                        }
                    }
                          if (i1 == 0) {
                        System.out.println("\nEmployee Details are not available, Please enter a valid ID!!");
                    }
                    break;
                case 8:
                System.out.println("\nEnter Transportation Personnel ID to DELETE from the Database :");
                    id = scan.nextInt();
                    int k1 = 0;
                    try {
                        for (Transportation e : al2) {
                            if (id == e.id1) {
                                al2.remove(e);
                                Admin.display2(al2);
                                k1++;
                            }
                        }
                        if (k1 == 0) {
                            System.out.println("\nEmployee Details are not available, Please enter a valid ID!!");
                        }
                    } catch (Exception ex) {
                        System.out.println(ex);
                    } break;
                case 9:

                    try {
                        al2 = (ArrayList<Transportation>) ois1.readObject();

                    } catch (ClassNotFoundException e2) {

                        System.out.println(e2);
                    } catch (Exception e2) {

                        System.out.println(e2);
                    }
                    Admin.display2(al2);
                    break;

                case 10:
                    System.out.println("\nEnter the following details to ADD list:\n");
                    System.out.println("Enter Branch ID :");
                    id = scan.nextInt();
                    System.out.println("Enter Branch Name :");
                    name = scan.next();

                    al3.add(new Branch(id, name));
                    Admin.display3(al3);
                    break;
                case 11:
                    System.out.println("\nEnter  Branch ID to DELETE from the Database :");
                    id = scan.nextInt();
                    int g = 0;
                    try {
                        for (Branch e : al3) {
                            if (id == e.id2) {
                                al3.remove(e);
                                Admin.display3(al3);
                                g++;
                            }
                        }
                        if (g == 0) {
                            System.out.println("\nEmployee Details are not available, Please enter a valid ID!!");
                        }
                    } catch (Exception ex) {
                        System.out.println(ex);
                    }
                    break;
                case 12:
                    try {
                        al3 = (ArrayList<Branch>) ois2.readObject();

                    } catch (ClassNotFoundException e3) {

                        System.out.println(e3);
                    } catch (Exception e3) {

                        System.out.println(e3);
                    }
                    Admin.display3(al3);
                    break;

                default:
                    System.out.println("\nEnter a correct choice from the List :");
                    break;

            }
        }
        while(true);
            case 2:
                Scanner sca=new Scanner(System.in);
System.out.println("Employee ID: ");
int id4=sca.nextInt();
                for(Employee e : al)
                {
if(id4==e.id){
  System.out.println("Your branch is: "+e.branch );
}
                    System.out.println("1). Add Customer \n" +
                            "2). Remove the Customer\n"+
                            "3). Add Cargo Status: \n");
                    System.out.println("Enter your choice : ");
                    int chf = scan.nextInt();
                    switch(chf) {
                        case 1:
                            System.out.println("\n Enter a ID for customer:\n");

                            id = scan.nextInt();
                            System.out.println("Enter Name :");
                            name = scan.next();

                            all.add(new Customer(id, name));
                            Employee.display4(all);
                            break;
                        case 2:
                            System.out.println("\nDelete Customer :");
                            id = scanner.nextInt();
                            int j= 0;
                            try {
                                for (Customer a : all) {
                                    if (id == a.id) {
                                        all.remove(a);
                                        Employee.display4(all);
                                        j++;
                                    }
                                }
                                if (j == 0) {
                                    System.out.println("\nEmployee Details are not available, Please enter a valid ID!!");
                                }
                            } catch (Exception ex3) {
                                System.out.println(ex3);
                            }
                            break;
                        case 3:
                            System.out.println("Shipment ID: ");
                           int idm=scan.nextInt();
                           if(idm==Shipment.id){

                               System.out.println("Shipment status changed ------Current Status: ");
                           }

}

        }

    } } }

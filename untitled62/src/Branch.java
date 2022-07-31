import java.io.Serializable;

class Branch implements Serializable {


     static int id2;
    static  String name2;
    public Branch(int id2,String name2) {
        this.id2 = id2;

        this.name2=name2;
    }
   /* public String toString()
    {

        return "\nBranches :" + "\nID: " + this.id2 + "\nName: " + this.name2 ;
    }
    /*public void branch1(){
       int id3=this.id2;
        setId2(id3);
        System.out.println(id3);

    }
*/}

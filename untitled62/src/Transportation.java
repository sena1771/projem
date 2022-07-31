import java.io.Serializable;
import java.io.Serializable;

class Transportation implements Serializable {
    String name1;
    int id1;
    String branch1;

    public Transportation(int id1,String name1,String branch1) {
        this.id1 = id1;
        this.branch1=branch1;
        this.name1=name1;
    }

    public String toString()
    {
        return "\nEmployee :" + "\nID: " + this.id1 + "\nName: " + this.name1 + "\nBranch: "+ this.branch1;
    }

}

public class Shipment {

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    private String sender;


   public String getReceiver() {
       return receiver;
   }
   public void setReceiver(String receiver){
       this.receiver=receiver;
   }

    private String receiver;
    String branch;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    static int id;

    public Shipment(int id,String sender,String receiver) {
        this.id=id;
        this.branch=branch;
        this.sender=sender;
        this.receiver=receiver;
    }
}

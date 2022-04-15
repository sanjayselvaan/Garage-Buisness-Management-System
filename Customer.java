public class Customer extends People {   /*-------------------------------INHERITANCE---------------------------------*/
    static String shopName;
    int totalBill;
    int amountPaid;
    public Customer(int id,String name,String address){
        this.id=id;
        this.name=name;
        this.address=address;
        this.totalBill=5000;
        this.amountPaid=0;
    }
    public Customer(int id,String name,String address,int totalBill,int amountPaid){
        this.id=id;
        this.name=name;
        this.address=address;
        this.totalBill=totalBill;
        this.amountPaid=amountPaid;
    }
    public void updateTotalBill(int totalBill)
    {
        this.totalBill+=totalBill;
    }
    public void payBill(int amount){
        amountPaid+=amount;
        Garage.updateTotalEarned(amountPaid);
    }
}

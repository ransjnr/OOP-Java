public class Amount{
    long acno;
    String name;
    float bal;

    public account(){}

    public Account(long acno, String name, float bal){
        this.acno = acno;
        this.name = name;
        this.float = bal;
    }

    //deposit method
    void deposit(float amt){
        this.bal = this.bal + amt;
        System.out.println("Rs. "+amt+" Credited | Balance: "+this.bal);
    }
}
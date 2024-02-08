class Account{
 //instance variables
  String aname;
  int bal;
  float deposit;

  Account(){}
  //local variables
  //this (referencing current objects)

  Account(String aname, int bal){
        this.aname = aname;
        this.bal = bal;
  }
  Account(String a, int b, float c){
    this(a,b); //constructor chaining
    /*
    aname = a;
    bal = b;
    */
    deposit = c;
  };

  void getDetails(){
    System.out.println(aname + " " + bal);
  }
}

public class OverloadingConstructors{
    public static void main(String[] args){
        Account acc1 = new Account("Rans",1000);
        Account acc2 = new Account();
        Account acc3 = new Account();

        acc1.getDetails();
        acc2.getDetails();
        acc3.getDetails();
    }
}
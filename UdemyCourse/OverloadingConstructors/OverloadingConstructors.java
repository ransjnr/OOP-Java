class Account{
 
  String aname;
  int bal;
  float deposit;

  Account(){}
  Account(String a, int b, float c){
    aname = a;
    bal = b;
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
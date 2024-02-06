class Account
{
  String aname;
  float bal;

//zero argument constructor method
  Account(){
    System.out.println("******");
    aname = "Rans";
    bal = 1000000;
  }

  //normal method
  void displayDetails(){
    System.out.println(aname + " " + bal);
  }

//   public static void main(String[] args)
//   {
//     Account emp = new Account();
//   }
}
//javap Account - to view the profile of the class
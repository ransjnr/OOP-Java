
class BankAccount{
    private double balance;

    public BankAccount(double openingBalance)
    {
        balance = openingBalance;
    }

    public void deposit(double amount)
    {
        balance = balance + amount;
    }

    public void withdraw(double amount)
    {
        balance = balance - amount;
    }

    public void display()
    {
        System.out.println("balannce=" + balance);
    }
}

class Account
{

    public static void main(String[] args)
    {
        BankAccount bal1 = new BankAccount(100.00);

        System.out.print("Before transactions, ");
        bal1.display();

        bal1.deposit(74.35);
        bal1.withdraw(20.00);


        System.out.print("After transactions, ");
        bal1.display();
    }
}
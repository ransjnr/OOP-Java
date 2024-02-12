
import java.util.Scanner;
public class AddInt {
    public static void main(String[] args){
        //variable definition
        int x,y,sum;
        //variable declaration
//        x = 56;
//        y = 30;
//        sum = x + y;
//        //display sum
//        System.out.println("the sum of the two numbers is: " + sum);

        //create a new object from the built-in func for taking input
        Scanner Scan = new Scanner(System.in);
        //tell the user to enter first value
        System.out.println("Please enter the first integer value: ");
        //store the input in the variable x
        x = Scan.nextInt();
        //tell the user to enter second value
        System.out.println("Please enter the second integer value: ");
        //store the input in the variable y
        y = Scan.nextInt();
        //define the addition of the values
        sum = x + y;
        //display the sum
        System.out.println("The sum of the two integer values is: "+ sum);
    }
}
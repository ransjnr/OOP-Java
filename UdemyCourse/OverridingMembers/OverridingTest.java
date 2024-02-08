/**
 * In Java, every class is a child of java.lang.object
 * Meaning you can add "super" in the parent class "base"
 * 
 * Types of variables: Instance, Local, ...
 */

class Base{
    int a = 5, b = 7;
    void display(){
        System.out.println("In Base Class: " + a + " | " + b); 
    }
}

class Derived extends Base{
    int a = 11, b = 22;
    void display(){
        System.out.println("In derived Class: " + this.a + " | " + b + " | " + super.a + " | " + super.b);
        super.display();
    }
}


public class OverridingTest{
    public static void main(String[] args){
        //create a child class instance
        Derived obj = new Derived();
        System.out.println(obj.a + " | " + obj.b);
        obj.display();
    }
}
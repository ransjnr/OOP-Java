class Base{
    int a = 10;
    int b = 20;

    void displayAB(){
        System.out.println("In base class: " + a + " | " + b);
    }
}

class Derived extends Base {
    int c = 30;

    void displayABC(){
        System.out.println("In derived class: " + a +  " | " + b + " | " + c);
    }
}

public class InheritanceTest1{
    public static void main(String[] args){
        Derived obj = new Derived();

        System.out.println(obj.a + " | " + obj.b + " | " + obj.c);
        obj.displayAB();
        obj.displayABC();
    }
}
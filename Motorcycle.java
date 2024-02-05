public class Motorcycle {
    String make;
    String color;
    boolean engineState;

    void startEngine() {
        if (engineState)
            System.out.println("The engine is already on");

        else {
            engineState = true;
            System.out.println("The engine is now on");
        }
    }
    void showAtt(){
        System.out.println("This motorcycle is a " + color + " " + make);
        if (engineState)
            System.out.println("The engine is on");
        else System.out.println("the engine is off");
    }

    public static void main (String[] args) {
        Motorcycle m = new Motorcycle();
        m.make = "Yamaha RZ350";
        m.color = "yellow";
        System.out.println("Calling showAtt...");
        m.showAtt();
        System.out.println("_________");
        System.out.println("Starting engine...");
        m.startEngine();
        System.out.println("________");
        System.out.println("Calling showAtt...");
        m.showAtt();
        System.out.println("__________");
        System.out.println("Starting Engine...");
        m.startEngine();
    }
}

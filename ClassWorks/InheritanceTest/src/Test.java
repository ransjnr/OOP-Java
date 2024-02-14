public class Test {
    public static void main(String[] args){

        Dog dog1 = new Dog();
        dog1.setName("Peace");
        Pig pig1 =new Pig();
        pig1.setName("Bofa");
        System.out.println("The name of my fisrt dog is " +dog1.getName());
        dog1.Sleep();
        dog1.Eat();
        System.out.println("The name of my fisrt dog is " +pig1.getName());
        pig1.Sleep();
        pig1.Eat();
    }
    
}

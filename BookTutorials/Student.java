//Class is blueprint of an object
//Objects are instances of a class

//entity - attributes(properties) and behavior(methods)

public class Student{

    String name;
    int age;
    String address;

    //constructors (special type of methods)
    public Student(String name, int age, String address){
        this.name = name;
        this.age = age;
        this.address = address;
    }
    //set and get
    public void setName(String name){
        this.name = name; //this - current object
    }
    public void setAge(int age){
        this.age = age;
    }
    public void setAddress(String address){
        this.address = address;
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public String getAddress(){
        return address;
    }

    //new is a keyword used to initialize anything in java
    public String toString(){
        return ("Student name is " + this.getName() + ", age is: " + this.getAge() +" and address is: "+ this.getAddress());
    }

    public static void main(String[] args) {
        Student john = new Student("John", 25, "23 East, California");
        System.out.println(john.getName());
        System.out.println(john.getAge());
        System.out.println(john.getAddress());
    }
}



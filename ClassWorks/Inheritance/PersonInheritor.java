package Inheritance;

import Inheritance.Person;

public class PersonInheritor extends Person {

    public PersonInheritor(String name, int age, String address) {
        super(name,age, address);
    }

    public static void main(String[] args){
        PersonInheritor john = new PersonInheritor("John", 25, "23 East, California");
        System.out.println(john);
    }
}
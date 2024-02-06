//PRACTICALS 01

class Employee {
    int empno;
    String ename;
    float sal;

    public static void main(String[] args){
        //create an object
        new Employee();
        //reference the new object
        Employee emp = new Employee();
        //access the employee object properties using the ref
        System.out.println(emp.empno + " | " + emp.ename + " | " + emp.sal); //output - 0 | null | 0.0
    }
}


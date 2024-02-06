class Employee1 {
    int empno;
    String ename;
    float sal;

    void setProperties(){
        ename = "Oppong";
        sal = 4000000.50f;
    }

    void displayProperties(){
        System.out.println(empno + " | " + ename + " | " + sal);
    }
    public static void main(String[] args){
        Employee1 emp = new Employee1();
        System.out.println(emp.empno + " | " + emp.ename + " | " + emp.sal);

        //1. changing the state of an object using references
        emp.empno = 101;
        emp.ename = "Ransford";
        emp.sal = 300000.50f;
        // System.out.println(emp.empno + " | " + emp.ename + " | " + emp.sal);
        emp.displayProperties();

        //2. changing the state of object using a method
        emp.setProperties();
        emp.displayProperties();

    }
}

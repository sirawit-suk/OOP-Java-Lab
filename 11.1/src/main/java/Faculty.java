public class Faculty extends Employee{
    public static void main(String[] args) {
        new Faculty(); // anonymous object -> made to use and leaves ??
    }
    
    Faculty(){
        super(); //HIDDEN AUTOMATICALLY INVOKE (INVOKE = GET)
        System.out.println("4. Faculty Constructors Invoked");
    }
}

class Employee extends Person{
    Employee(){
        //super(); //CAN'T BE HERE
        this("2. Employee Constructors Invoked"); //Calling constructor that take "String"
        System.out.println("3. Employee no-arg constructor invoked");
    }
    Employee(String s){
        super(); // IT SHOULD BE HERE
        System.out.println(s);
    }
}

class Person {
    Person(){
        //super(); NONO, BECAUSE PERSON IS BIGGEST BOSS ! 
        System.out.println("1. Person Constructors Invoked");
    }
}

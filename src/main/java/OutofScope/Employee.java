package OutofScope;

import java.util.Scanner;



public class Employee {

    String name;
    int age;
    double salary;
    String company;
    final String country = "Georgia";


     public Employee(String name, int age , double salary){
        this.name = name;
        this.age = age;
        this.salary = salary;

    }

    public Employee(){
        this("Unknown", 18, 1000);
    }

    public Employee(String name){
        this(name, 18, 1000)    ;
    }

     void display(){
        this.company = "Affex";
        String company = "Local company";

         System.out.println(name);
         System.out.println(age);
         System.out.println(salary);
         System.out.println(company);
         System.out.println(this.company);
         System.out.println(country);


    }

    static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println(" Enter  ur name : ");
        String name = scanner.nextLine();
        System.out.println(" Enter  ur age : ");
        int age = scanner.nextInt();
        System.out.println(" Enter  ur salary : ");
        double salary = scanner.nextDouble();

        Employee emp = new Employee(name, age, salary);
        emp.display();

        new Employee();

        new Employee(name);

        Employee emp2 = new Employee("David");
        System.out.println(emp2.name);

        Employee emp3 = new Employee();
        emp3.display();


    }





}

package Automation;

import java.util.Scanner;

public class Assignment_Eleven {

    static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your age: ");
        int age = scanner.nextInt();

        System.out.println("Enter your monthly salary: ");
        double salary = scanner.nextDouble();

        System.out.println("Years of experience:");
        int experience = scanner.nextInt();

        System.out.println("Do you have any debt ?");
        String debt = scanner.next();



        if (age >= 18){
            if (salary >= 3000) {
                if (experience >= 2){
                    if (debt.equalsIgnoreCase("yes") ){
                        System.out.println("How much debt do you have?");
                        double debtAmount = scanner.nextDouble();
                        if (debtAmount<=10000){
                            System.out.println("Eligible for loan ");
                        } else{
                            System.out.println("EDebt too high ");
                        }

                    } else {
                        System.out.println("Eligible for loan ");
                    }
                } else{
                    System.out.println("Not enough experience");
                }
            } else {
                System.out.println("Salary is too low");
            }
        } else {
            System.out.println("Age is too low");
        }

    }

}

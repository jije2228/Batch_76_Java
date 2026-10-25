package Automation;

import java.util.Scanner;

public class Assignment_TwentyNine {

    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        System.out.println("Enter your Age: ");
        int age = sc.nextInt();
        System.out.println("Enter your Salary: ");
        double salary = sc.nextDouble();
        System.out.println("Enter a byte number: ");
        byte byTe = sc.nextByte();
        System.out.println("Enter a short number: ");
        short sHort = sc.nextShort();
        System.out.println("Enter a long number: ");
        long loNg = sc.nextLong();
        System.out.println("Enter a float number: ");
        float floAt = sc.nextFloat();
        System.out.println("Enter true or false: ");
        boolean trueOrFalse = sc.nextBoolean();
        System.out.println("Enter your first name:: ");
        String name = sc.next();

        sc.nextLine();

        System.out.println("Enter your full address:: ");
        String address = sc.nextLine();



        System.out.println(age);
        System.out.println(salary);
        System.out.println(byTe);
        System.out.println(sHort);
        System.out.println(loNg);
        System.out.println(floAt);
        System.out.println(trueOrFalse);
        System.out.println(name);
        System.out.println(address);

        sc.close();
    }




}

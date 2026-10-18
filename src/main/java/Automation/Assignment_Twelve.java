package Automation;

import java.util.Scanner;

public class Assignment_Twelve {

    /*
     * " WAP to check person can vote only if he/she is 18 or above
     * and should not vote if age is less."
     */

    static void main(String[] args)  {

        Scanner scanner = new Scanner(System.in);

        System.out.println(" Please enter your age ");

        int age = scanner.nextInt();

        if (age >= 18){
            System.out.println(" you are eligible to give a VOTE");
        } else {
            System.out.println(" you are NOT eligible to VOTE");
        }

    }

}

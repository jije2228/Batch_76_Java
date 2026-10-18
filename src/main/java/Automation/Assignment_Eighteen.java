package Automation;

import java.util.Scanner;

 class Assignment_Eighteen {


    static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println(" Please enter your age ");

        int age = scanner.nextInt();

        assert age >= 18: "User must be at least 18 years old";
    }

}

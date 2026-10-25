package Automation;

import java.util.Scanner;

public class Assignment_ThirtyOne {

    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter base: ");
        double base = sc.nextDouble();

        System.out.println("Enter height: ");
        double height = sc.nextDouble();

        double area = (base  * height) / 2;

        System.out.println(area);


    }



}

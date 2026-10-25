package Automation;

import java.util.Scanner;

public class Assignment_ThirtyTwo {


    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Length: ");
        double length = sc.nextDouble();

        System.out.println(" Enter the width: ");
        double width = sc.nextDouble();

        double area = length * width;

        System.out.println(area);



    }

}

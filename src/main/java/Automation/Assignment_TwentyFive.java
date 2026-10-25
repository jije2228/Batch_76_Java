package Automation;

import java.util.Scanner;

public class Assignment_TwentyFive {

    String productName;
    double price;
    final double  DISCOUNT = 10;

    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter product name: ");

        Assignment_TwentyFive var = new Assignment_TwentyFive();
        var.productName = sc.next();

        System.out.println("Enter price:");
        var.price = sc.nextDouble();
        double finalPrice = var.price-(var.price / 100 * var.DISCOUNT);

        System.out.println("product : " + var.productName);
        System.out.println("Original price : " + var.price);
        System.out.println(var.DISCOUNT+ "%");
        System.out.println("final price : " + finalPrice);


    }





}

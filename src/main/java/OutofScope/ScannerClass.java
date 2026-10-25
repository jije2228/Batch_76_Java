package OutofScope;

import java.util.Scanner;

public class ScannerClass {

    static void main(String[] args) {


//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter your age: ");
//
//        int age = scanner.nextInt();
//        System.out.println(age);
//        //---------------//
//
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter your salary: ");
//
//        double salary = sc.nextDouble();
//        System.out.println(salary);
//        //----------------//
//
//        Scanner bt = new Scanner(System.in);
//        System.out.println("Enter a number from 1 to 100: ");
//
//        byte num = bt.nextByte();
//        System.out.println(num);
//        //-----------------//
//
//        Scanner sht = new Scanner(System.in);
//        System.out.println("Enter a number from -32000 TO 32000");
//
//        short num1 = sht.nextShort();
//        System.out.println(num1);
        // ------------------//

//        Scanner fullN = new Scanner(System.in);
//        System.out.println("Enter your full name:");
//
//        String name = fullN.next();
//        String name1 = fullN.nextLine();
//
//        System.out.println(name);
//        System.out.println(name1);
        //----------------------//

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your age:");
        int age = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Enter your full name:");
        String fullName = scanner.nextLine();

        System.out.println("Age: " + age);
        System.out.println("Full name: " + fullName);



    }


}

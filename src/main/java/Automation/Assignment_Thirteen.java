package Automation;

import java.util.Scanner;

public class Assignment_Thirteen {

    /*
     * WAP using switch case to display days of the week:1 for Monday,
     * 2 for Tuesday etc. 7 for Sunday.
     * if the input is not in between 1-7 ,print "Invalid Day"
     */
    static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println(" which day of the week you look for : ");
        int weekDay = scanner.nextInt();
        switch (weekDay){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid Day");

        }



    }


}

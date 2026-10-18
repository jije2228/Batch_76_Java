package Automation;

public class Assignment_TwentyFour {

    int age = 50;

    void human(){

    int age = 30;
    System.out.println(age);
    System.out.println(this.age);

    }

    static void main(String[] args) {
        Assignment_TwentyFour obj = new Assignment_TwentyFour();
        obj.human();
    }


}

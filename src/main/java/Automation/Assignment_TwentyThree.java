package Automation;

public class Assignment_TwentyThree {


     static void methodOne(){
         int numberOne;
         numberOne =10;
         System.out.println(numberOne);
    }

    void methodTwo(){
         int numberTwo;
         numberTwo = 20;
         System.out.println(numberTwo);
    }

    static void main() {
        methodOne();
        Assignment_TwentyThree obj = new Assignment_TwentyThree();
        obj.methodTwo();
    }

}

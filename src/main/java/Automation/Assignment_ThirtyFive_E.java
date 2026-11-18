package Automation;

public class Assignment_ThirtyFive_E extends Assignment_ThirtyFive_D {

    public int var3 = 3;

    public  void method3(){


        System.out.println("bye");


    }

    static void main(String[] args) {

        Assignment_ThirtyFive_E obj = new Assignment_ThirtyFive_E();

        System.out.println(obj.var);
        System.out.println(obj.var2);
        System.out.println(obj.var3);
        obj.method1();
        obj.method2();
        obj.method3();

    }

}

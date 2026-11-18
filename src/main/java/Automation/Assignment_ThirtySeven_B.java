package Automation;

public class Assignment_ThirtySeven_B extends Assignment_ThirtySeven{

    int var2 = 2;

    public void method2(){

        System.out.println("child 1");
    }


    static void main(String[] args) {
        Assignment_ThirtySeven_B obj = new Assignment_ThirtySeven_B();
        System.out.println(obj.var);
        System.out.println(obj.var2);
        obj.method1();
        obj.method2();

    }


}

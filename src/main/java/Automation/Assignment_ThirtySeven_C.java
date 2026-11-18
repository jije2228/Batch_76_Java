package Automation;

public class Assignment_ThirtySeven_C extends  Assignment_ThirtySeven {

    int var3 = 3;

    public void method3(){

        System.out.println("CHild 2 ");
    }

    static void main() {

        Assignment_ThirtySeven_C obj = new Assignment_ThirtySeven_C();

        System.out.println(obj.var);
        System.out.println(obj.var3);
        obj.method1();
        obj.method3();

    }

}

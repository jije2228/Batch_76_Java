package Automation;

public class Assignment_ThirtyNine {

    public void method1(){

        System.out.println("Method public");
    }

    protected void method2(){

        System.out.println("method protected ");
    }

    void method3(){

        System.out.println("Method default");
    }

    private void method4(){

        System.out.println("Method Private");
    }

    static void main(String[] args) {

        Assignment_ThirtyNine obj = new Assignment_ThirtyNine();

        obj.method1();
        obj.method2();
        obj.method3();
        obj.method4();
    }


}

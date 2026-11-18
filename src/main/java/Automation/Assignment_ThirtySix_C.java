package Automation;

public class Assignment_ThirtySix_C {

    Assignment_ThirtySix_C(){
        System.out.println("non Para");

    }

    Assignment_ThirtySix_C(int var){
        this();
        System.out.println(var);
    }

    static void main(String[] args) {
        new Assignment_ThirtySix_C(10);
    }




}

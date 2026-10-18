package Automation;

public class Assignment_Twenty {
    public Assignment_Twenty(){
    this("chair");

    }
    public  Assignment_Twenty(String furniture){
        this(furniture, 120);
        System.out.println(furniture);
    }
    public Assignment_Twenty(String furniture, int price){
        System.out.println(price);
        //System.out.println(furniture);
    }

    static void main(String[] args) {
        new Assignment_Twenty();

    }

}

package Automation;

public class Assignment_TwentyTwo {

    String name;

    public static void human(int age){

        System.out.println(age);

    }
    static void main(String[] args) {

        String gender;
        gender =  "Male";
        Assignment_TwentyTwo obj = new Assignment_TwentyTwo();
        obj.name = "Carlos";

        System.out.println(obj.name);
        human(36);
        System.out.println(gender);;

        gender = "Female";
        obj.name = "Carla";

        System.out.println(obj.name);
        human(40);
        System.out.println(gender);
    }

}

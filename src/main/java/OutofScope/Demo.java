package OutofScope;

public class Demo {

     int x = 10;

    void display()
    {
        int y = 20;
        System.out.println(x + y);
    }

    static void main(String[] args) {
        new Demo().display();
    }



}

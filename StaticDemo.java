import java.util.Scanner;

public class StaticDemo {
    final static int a=10;
    {
        int a =10;
        System.out.println(a+"  in instance block");
    }
    void m1(int a){

        System.out.println(a+" in method");
    }
    StaticDemo(){
        int a =20;
        System.out.println(a+" in constructor");
    }

    public static void main(String[] args) {
        StaticDemo obj = new StaticDemo();
        System.out.println(obj.a);
        obj.m1(5);
    }
}

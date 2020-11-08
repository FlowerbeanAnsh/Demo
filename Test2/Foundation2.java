package Test2;

import Test.*;

public class Foundation2 {
    public static void main(String[] args) {
        Foundation1 obj = new Foundation1();
        System.out.println(obj.num1);

    }
}
class Foundation3 extends Foundation1{
    public static void main(String[] args) {
        Foundation3 obj2 = new Foundation3();
        System.out.println(obj2.num4);
        System.out.println(obj2.num1);
    }
}

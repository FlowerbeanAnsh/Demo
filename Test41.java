import java.util.Scanner;

public class Test41 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.println("enter the value of a :");
        int a = kb.nextInt();
        System.out.println("enter the value of b :");
        int b = kb.nextInt();
        System.out.println("the division of a and b");
        try {
            System.out.println(a / b);
        } catch (ArithmeticException obj) {
            obj.printStackTrace();
        }
        try {
            System.out.println(args[7]);
        } catch (ArrayIndexOutOfBoundsException obj) {
            System.out.println("out of index");
        }
    }
}

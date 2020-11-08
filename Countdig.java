import java.util.Scanner;
public class Countdig {

    public static void main(String[] args) {
        int count = 0;
        System.out.println("Enter a number:");
        Scanner kb = new Scanner(System.in);
        int num = kb.nextInt();

        while (num > 0) {
            num = num / 10;
            count = count + 1;

        }
        System.out.println( count);
    }
    }
import java.util.Scanner;

public class Countnodig {
    public static void main(String[] args) {
        int c=0;
        Scanner kb = new Scanner(System.in);
        int d = kb.nextInt();

        while( d !=0)
        {
            d = d / 10;
                    c++;
        }
        System.out.println(c);
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Float.MAX_VALUE);
        System.out.println(Double.MIN_VALUE);
    }
}


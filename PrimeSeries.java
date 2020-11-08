import java.util.Scanner;

public class PrimeSeries {
    static boolean isprime(int n){

        if (n <= 1)
            return false;

        for (int i = 2; i < n; i++)
            if (n % i == 0)
                return false;

        return true;
    }
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.println("Enter the range:");
        int num = kb.nextInt();
        System.out.println(isprime(num));

    }
}

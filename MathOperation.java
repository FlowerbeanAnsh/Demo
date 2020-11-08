import java.util.Scanner;

public class MathOperation {
    public static void main(String[] args) {
        int sum=0;
        int avg;
        Scanner kb = new Scanner(System.in);
        int n = 5;

        int arr[] = new int[n];
        try{
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(args[i]);

        }
        }catch (NumberFormatException obj){
            System.out.println("enter integer value only");
        }

        for (int i = 0; i < n; i++) {
            sum = sum + arr[i];

        }

            avg = sum / n;
        System.out.println("average is= "+avg);



        System.out.println("sum is= " +sum);

    }
}
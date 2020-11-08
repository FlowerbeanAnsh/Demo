import java.util.Scanner;
public class Sum_array_elements {
    public static void main(String[] args) {
        int sum=0;
        Scanner s= new Scanner(System.in);

        int arr[] = new int[10];

        System.out.println("enter the number of values:");
        int num = s.nextInt();

        for(int i=0; i<num; i++){
            arr[i] = s.nextInt();
        }
        for(int i=0;i<num;i++){
            sum = sum + arr[i];

        }
        System.out.println("sum of all array elements is:"+ sum);
    }
}

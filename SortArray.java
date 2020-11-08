import java.util.Scanner;

public class SortArray {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int arr[] = new int[100];
        System.out.println("enter the numbers of elements");
        int n = kb.nextInt();
        for (int i = 0; i <=n; i++) {
            arr[i] = kb.nextInt();

        }
        for (int i = 0; i <=n; i++) {
            if (arr[i] < arr[i + 1]) {
                int temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
            } else if (arr[i] > arr[i + 1]) {
                int temp = arr[i + 1];
                arr[i + 1] = arr[i];
                arr[i] = temp;


                System.out.println(arr[i]);
            }

        }
    }
}


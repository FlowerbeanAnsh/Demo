import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        int arr[] = new int[8];
        for(int i=0; i<arr.length; i++){
            arr[i]=kb.nextInt();

        }
        for(int i=arr.length-1; i>=0; i--){
            System.out.println(arr[i]);
        }
    }
}


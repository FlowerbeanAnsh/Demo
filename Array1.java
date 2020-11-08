import java.util.Scanner;
public class Array1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int arr[]= new int[5];
        System.out.println(arr.length);     //here length is an attribute which only uses in array

        for(int i=0; i<arr.length; i++){
            arr[i]= s.nextInt();           // input of array
        }
        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
        s.close();   // not compulsary
    }
}

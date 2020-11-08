import java.util.Scanner;

public class SumEvenIndex {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int arr[]=new int[10];
        for(int i=0;i<arr.length;i++){
            arr[i]=kb.nextInt();

        }
        for(int i=0;i<arr.length;i++){
            if(i%2==0){
                System.out.println(arr[i]);
            }
        }
    }

}


import java.util.Scanner;

public class MaxtwoElements {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int arr[]=new int[10];
        for(int i=0;i<arr.length;i++){
            arr[i]=kb.nextInt();

        }
        int larg1,larg2,temp;
        larg1 = arr[0];
        larg2 =arr[1];
        if(larg1 < larg2){
            temp = larg1;
            larg1 = larg2;
            larg2 = temp;
        }
        for(int i=2;i<arr.length;i++){
            if(arr[i] > larg1){
                larg2 = larg1;
                larg1 = arr[i];
            }
            else if(arr[i] > larg2 && arr[i]!=larg1){
                larg2=arr[i];
            }
        }
        System.out.println("The largest number in elements is:"+ larg1);
        System.out.println("The second largest number in elements is:"+ larg2);
    }
}

import java.util.Scanner;

public class CheckOcuurance {
    public static void main(String[] args) {
        int count=0;
        Scanner kb=new Scanner(System.in);
        int arr[] = new int[8];
        System.out.println("Enter array elements:");
        for(int i=0;i<arr.length;i++){
            arr[i] = kb.nextInt();
            kb.nextLine();
        }
        System.out.println("enter the number whom you want occurance:");

        int num = kb.nextInt();
        for(int i=0;i<arr.length;i++){
            if(arr[i]==num){
                count=count+1;
            }

        }

        System.out.println("occrance of entered number is="+count);
    }
}

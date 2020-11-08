import java.util.Scanner;

public class Sol3 {
    public static void main(String[] args){
        Scanner kb = new Scanner(System.in);
        System.out.println("Enter the height:");
        int x= kb.nextInt();
        for(int i=1;i<=x;i++){
            for(int j=x;j>=1;j--){
                if(i>=j){
                    System.out.print("1 ");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}

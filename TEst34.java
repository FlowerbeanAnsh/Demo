import java.util.Scanner;

public class TEst34 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n= s.nextInt();
        int i =1;
        while( i <= n){    // 3
            int spaces = 1;
            while( spaces <= n-i){  //2
                System.out.println(spaces);
                spaces++;
            }
            System.out.println();
            i++;
        }
    }
}

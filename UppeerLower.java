import java.util.Scanner;

public class UppeerLower {
    public static void main(String[] args) {
        int temp;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a character:");
        char ch = s.next().charAt(0);
        if(ch>=65 && ch<=96){
            temp = ch + 32;
            System.out.println((char) temp);
        }
        else if(ch>=97 && ch<=123){
            temp = ch - 32;
            System.out.println((char) temp);
        }
    }
}

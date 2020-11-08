import java.util.Scanner;
public class Vow_cons {
    public static void main(String[] args) {
        Scanner ch = new Scanner(System.in);
        char c = ch.next().charAt(0);

        if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u' || c=='A' || c=='E' || c=='I' || c=='O' || c=='U')
        {
            System.out.println("entered char is a vowel");
        }
        else
        {

            System.out.println("entered char is not a vowel");
        }
    }

}

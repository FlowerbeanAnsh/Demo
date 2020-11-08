import java.util.Scanner;
public class Sol5 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the first string:");
        String s1=s.nextLine();
        System.out.println("Enter the second string:");
        String s2=s.nextLine();
        StringBuilder s3 = new StringBuilder();
        s3.append(s2);
        s3.reverse();
        System.out.println(s1+s3);


    }
}

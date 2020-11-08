import java.util.Scanner;
public class Sol6 {
    public static void main(String[] args) {
        Scanner str = new Scanner(System.in);
        System.out.println("Enter a String:");
        String s = str.nextLine();
        String s1 = s.replaceAll("[AaEeIiOoUu]", "Z");
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == 'a' || ch == 'A' || ch == 'e' || ch == 'E' || ch == 'i' || ch == 'I' || ch == 'o' || ch == 'O' || ch == 'u' || ch == 'u') {
                System.out.println(s1);
                break;
            } else {
                System.out.println("no vowels present");
            }
        }
    }
}

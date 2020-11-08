import java.util.Scanner;

public class Concat {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the first string:");
        String a = s.nextLine();
        System.out.println("Enter the Second String:");
        String b = s.nextLine();
        if(a.equals("GLA") && b.equals("Mathura")){
            System.out.println(a + " University " + b);
        }
        else if(a.equals("AAA") && b.equals("Delhi")){
            System.out.println(a + " Technologies " + b);
        }

    }
}


import java.util.Scanner;

public class CoupenVerification {
    public static void main(String[] args) {
        String real_coupen="covid19";
        System.out.println("Enter your coupen code:");
        Scanner kb = new Scanner(System.in);
         String coupen_code = kb.next();

         if(coupen_code.isBlank() || coupen_code.isEmpty()) {
             //if the entered string is empty or blank
             System.out.println("Please enter a valid code");
         }


         else if(coupen_code.toLowerCase().equals(real_coupen.toLowerCase())){
             //to.lowercasse and to.uppercase converts the strings
             System.out.println("Congrats!! you have got 50% discount");
        }
         else
         {
             System.out.println("Better luck next time");
         }
    }
}

import java.util.Scanner;
public class Demoa {
    public static void main(String... a) {
        System.out.println("Enter a year:");
        Scanner b = new Scanner(System.in);
        int year = b.nextInt();
        if (year % 400 == 0) {

                    System.out.println("Leap year");
                }
        else if(year % 4==0 && year%100!=0 )
        {
            System.out.println("leap year");

            }

        else {


            System.out.println("Non leap year");
        }
    }
}

import java.util.Scanner;

public class TriangleType {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.println("Enter the value of l= ");
        int l =kb.nextInt();
        System.out.println("enter the value of b= ");
        int b = kb.nextInt();
        System.out.println("enter the value of h= ");
        int h =kb.nextInt();
        if(l==b && l==h){
            System.out.println("1");  //triangle is equilateral

        }
        else if(l!=b && l!=h){
            System.out.println("-1"); //triangle is scalene
        }
        else{
            System.out.println("0"); //triangle is isosceles
        }
    }
    
}

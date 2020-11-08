import java.util.Scanner;

public class AllNumbers {
    public static void main(String[] args) {
        int a=0,b=1,c;     // a and b are initial fixed numbers in series
        System.out.println(a);
        System.out.println(b);
        int range=100;     // taking a number input from user
        c=a+b; //c=0+1=1
        while(c <= range) {  //while loop will run untill the value of c < num
            a = b;   //a=1,1,2,3......
            b = c;    //b=1,2,3,5................
            c = a + b;   //c=2,3,5,"8"..(fibonachi series)......
            System.out.println(c);
        }
    }
}

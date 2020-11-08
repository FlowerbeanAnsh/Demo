import java.util.Scanner;

public class FibonachiNo {
    public static void main(String[] args) {
        int a=0,b=1,c;     // a and b are initial fixed numbers in series
        System.out.println("Enter a number:");
        Scanner kb = new Scanner(System.in);
        int num=kb.nextInt();     // taking a number input from user
        // let suppose value is 8
        if(num==a || num==b) {
            System.out.println("fibonachi");
        }
            c=a+b; //c=0+1=1
            while(c < num) {  //while loop will run untill the value of c < num
                a = b;   //a=1,1,2,3......
                b = c;    //b=1,2,3,5................
                c = a + b;   //c=2,3,5,"8"..(fibonachi series)......
            }
                if(c==num){   // if c==8
                    System.out.println("Yes,this number is a part of fibonachi series");

                }
                else{
                    System.out.println("No,this number is not a part of fiobonachi series");
                }
            }
        }



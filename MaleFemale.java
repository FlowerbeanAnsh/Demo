import java.util.Scanner;

public class MaleFemale {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter your gender:");
        String gender=s.nextLine();
        System.out.println("Enter your age:");
        int age = s.nextInt();
        if(gender.equals("Female")){
            if(age>=1 && age<=58){
                System.out.println("the percentage of interst is 8.2%");
            }
            else if(age>=59 && age<=100){
                System.out.println("the percentage of interst is 8.2%");
            }

        }
        else if(gender.equals("Male")){
            if(age>=1 && age<=58){
                System.out.println("the percentage of interst is 8.4%");
            }
            else if(age>=59 && age<=100){
                System.out.println("the percentage of interst is 10.5%");
            }
        }

    }
}


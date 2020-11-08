class Sal {
    int salary;
    int hours;
    public void getinfo(int s,int h){
        salary=s;
        hours=h;

    }


    public void addsal(){
        if(salary<500){
            salary=salary + 10;
        }

    }
    public void addwork(){
        if(hours>6){
            salary=salary + 5;
        }
        System.out.println("final salary is: " + salary);
    }
}
public class Employee1{
    public static void main(String[] args) {
        Sal obj = new Sal();
        obj.getinfo(300,4);
        obj.addsal();
        obj.addwork();


    }
}

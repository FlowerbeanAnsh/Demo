public class Employee {
    int sa=0;
    int ho=0;

    public void getinfo(int s,int h){
        sa=s;
        ho=h;
        System.out.println("salary is:" + s);
        System.out.println("work hours is:"+ h);

    }
    public int addsal(){

        if(sa<500){
            sa= sa + 10;


        }
        return sa;

    }
    public int addwork(){
        int new_salary;
        if(ho>6){
            new_salary= sa + 5;
        }
     return sa;
    }
    public static void main(String[] args) {
        Employee obj = new Employee();
        obj.getinfo(400,8);

    }
}

class Person{
    public void m1() {

        String Pname = "Elon";
        System.out.println("Employee name is: " + Pname);
    }
}
class Employe extends Person{
    public void m2(){

    }
    Employe(double salary,int year,String NIN){
        System.out.println("salary is: "+ salary);
        System.out.println("year is: "+ year);
        System.out.println("NIN is: "+ NIN);
    }

}
public class TestEmployee {
    public static void main(String[] args) {
        Employe obj1 = new Employe(85_000,2017,"EMP52212");
        obj1.m1();


    }
}

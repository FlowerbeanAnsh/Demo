class Member{
    public String Name;
    public int age;
    public String address;
    public int phone;
    public double salary;
    public double Printsalary(double salary){
        return salary;

    }
}// end of member class

class Employee123 extends Member{
    String specialization;

}
class Manager extends Member{
    String department;

}

public class Practice2{
    public static void main(String[] args) {
        Employee123 obj = new Employee123();
        Manager obj2 = new Manager();
        obj.Name="Rahul Bansal";
        obj.age=32;
        obj.address="Agra";
        obj.phone=976273682;
        obj.salary=45_000;
        obj.specialization="IT";
        obj2.department="EC";
        System.out.println(obj.Name);
        System.out.println(obj.salary);
        System.out.println(obj.specialization);
        System.out.println(obj.age);
        System.out.println(obj.address);
        System.out.println(obj2.department);


        System.out.println(obj.Printsalary(50_000));


    }
}

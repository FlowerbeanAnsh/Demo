public class Student12 {
    String name;
    int age;
    String address;
    Student12(){
        this.name="unknown";
        this.age=0;
        this.address="not available";
    }
    public void setinfo(String n,int a) {
        System.out.println("Name: " +n);
        System.out.println("age: " +a);
        System.out.println(address);
    }
    public void setinfo(String na,int ag,String add){
        System.out.println("Name:" +na);
        System.out.println("age is:" + ag);
        System.out.println("address is:" +add);


    }


    public static void main(String[] args) {
        Student12 obj = new Student12();
        obj.setinfo("Ajay",12);
        obj.setinfo("Rahul",18,"Rampur");
        obj.setinfo("jay",33,"Bijnor");
        obj.setinfo("Omkar",56);
        obj.setinfo("Abhishek",19,"valsad");
        obj.setinfo("Gautam",19,"city");
        obj.setinfo("Ayush",18);
    }
}

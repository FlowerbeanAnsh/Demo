public class Practice1 {
    public void m1(){
        System.out.println("This is parent class");
    }
}//end of the class

class Practice1_2 extends Practice1{
    public void m2(){
        System.out.println("This is child class");
    }
}
class MainPractice1{
    public static void main(String[] args) {
        Practice1 obj = new Practice1();
        obj.m1();
        Practice1_2 obj1 = new Practice1_2();
        obj1.m2();
        obj1.m1();

    }
}


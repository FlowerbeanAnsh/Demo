// in this program Test4 is inherited by Test5 class and methods name are same but no. of
// arguments are different . so we can say classes and methods are different but name of method is
// same. this concept is called as "Overloading of method"
class Test4{
    public void m1(int a){
        System.out.println("parent class");
    }
}
class Test5 extends Test4{
    public void m1(int a,int b){
        System.out.println("child class");
    }
}

public class OverLoading {
    public static void main(String[] args) {
        Test5 obj = new Test5();
        obj.m1(67);
        obj.m1(54,89);
    }
}

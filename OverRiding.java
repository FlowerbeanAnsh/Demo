// in this program Test6 is inherited by Test7 class , methods name are same and no. of arguments
// should also same. this concept is called as Overriding of method.
// we do overriding to update the features of inherited class.that's why methods name are same

class Test6{
    public void m1(int a){
        System.out.println("parent class");
    }
}
class Test7 extends Test6{
    public void m1(int a){
        System.out.println("child class");
    }
}

public class OverRiding {
    public static void main(String[] args) {
        Test7 obj = new Test7();
        obj.m1(78);

    }
}

//constructor channing in inheritance
class Test78{
    public Test78(int x){
        System.out.println(x);
    }
    public Test78(){
        System.out.println("a");
    }

}

class Test65 extends Test78 {
    public Test65() {
        super(7);
        System.out.println("c");
    }
}


public class Example23{
    public static void main(String[] args) {
        Test65 obj = new Test65();
    }
}
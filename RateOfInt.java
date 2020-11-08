abstract class RBI{
    public abstract int MainInt();
}
class SBI extends RBI {  //here we are also showing hirarchical inheritance
    public int MainInt() {
        return 8;
    }
}

class BOB extends RBI {
    public int MainInt() {
        return 9;
    }
}

class HDFC extends RBI {
    public int MainInt() {
        return 10;
    }
}
public class RateOfInt {
    public static void main(String[] args) {
        RBI obj = new HDFC();
        RBI obj1 = new BOB();
        RBI obj2 = new SBI();
        System.out.println("HDFC bank interst is: " + obj.MainInt() +"%");
        System.out.println("BOB interst is: " + obj1.MainInt() +"%");
        System.out.println("SBI interst is: = " + obj2.MainInt() +"%");
    }
}





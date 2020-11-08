class Overriding12{
    public int m(int a){
        return a;
    }
    public float m(float b){
        return b;
    }
    public double m(double c){
        return c;
    }
    public boolean m(boolean d){
        return d;
    }
}

public class PrintNumber {
    public static void main(String[] args) {
        Overriding12 obj = new Overriding12();
        System.out.println(obj.m(12));
        obj.m(12.5f);
        obj.m(123.66);
        obj.m(true);
    }
}

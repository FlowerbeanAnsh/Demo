class Outer{
    int a= 20;
    class inner{
        int a=90;
        public void m(){
            int a = 100;
            System.out.println(a);
            System.out.println(this.a);
            System.out.println(Outer.this.a);
        }
    }
}
public class Test1 {
    public static void main(String[] args) {
        Outer obj = new Outer();
        Outer.inner obj1= obj.new inner();
        obj1.m();

    }
}

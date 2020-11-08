interface sum{
    void sums(int a , int b);
}
class Test46{
    public void sub(int e, int f){
        int subs = e -f;
        System.out.println(subs);
    }
}
class Test45 extends Test46 implements sum{
    public void sums(int c, int d){
        int total = c + d;
        System.out.println("sum of two no is: " + total );
    }

}

public class Test56 {
    public static void main(String[] args) {
        Test45 obj = new Test45();
        obj.sums(34,23);
        obj.sub(45,21);
    }
}

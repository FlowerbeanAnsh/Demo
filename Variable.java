public class Variable {
    int a;          //intance variables
    int b;

    public static void main(String[] args) {
        Variable obj = new Variable();
        obj.a =10;
        obj.b=20;
        int sum = obj.a + obj.b;             // sum is a local variable
        System.out.println("Sum is = " + sum);

    }
}

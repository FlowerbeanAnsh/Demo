//how we can differentiate local variable and instance variable if both are having same name 
public class Variable2 {
    int num1;                //instance variable
    public void method1(int num1){        //local variable
        System.out.println(num1);
        System.out.println(this.num1);

    }
    public void method2(int num1){
        System.out.println(num1);

        System.out.println(this.num1);

    }

    public static void main(String[] args) {
        Variable2 obj = new Variable2();
        obj.num1=100;
        obj.method1(200);
        obj.method2(300);
    }
}


public class WrapperClass {
    public static void main(String[] args) {
        //int a = 12; using preemptive data type
        // int b= 15;
        Integer a =Integer.parseInt("67");
        Integer b =Integer.valueOf("23");
        Float c = Float.valueOf("15.1f");
        Double d = Double.valueOf("23.67");



        System.out.format("%.2f",a+b+c+d);

    }

}

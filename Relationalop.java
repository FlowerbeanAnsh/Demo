public class Relationalop {
    public static void main(String[] args) {
        //String s1 = new String("ansh");
        //String s2 = new String("ansh");
        //System.out.println(s1==s2);  // == compares only the address/reference
        //System.out.println(s1.equals(s2));  // compare the values

        //StringBuffer s3 = new StringBuffer("ansh");
        //StringBuffer s4 = new StringBuffer("ansh");
        //System.out.println(s3==s4); //compares only the address/reference
        //System.out.println(s3.equals(s4));  //compares only the address/reference

        String st = "Ansh";
        StringBuffer s1 = new StringBuffer("Ansh");
        System.out.println(s1.equals(st));      // false is the result because of different string classes
    }
}

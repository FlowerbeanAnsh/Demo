public class Constructor {
    static int count=0;
    {
        count = count + 1;
        System.out.println("in instance block "+ count);
    }
    Constructor()
    {

        //System.out.println(count);
    }

    public static void main(String[] args) {
        Constructor obj1 = new Constructor();
        Constructor obj2 = new Constructor();
        Constructor obj3 = new Constructor();
        Constructor obj4 = new Constructor();
        Constructor obj5 = new Constructor();
    }
}

public abstract class Compartment {
    public abstract String notice();
}//end of the class

class Firstclass extends Compartment{
    public String notice() {
        return "Firstclass";
    }
}
class Ladies extends Compartment{
    public String notice(){
        return "Ladies coach";
    }
}
class General extends Compartment{
    public String notice(){
        return "General Coach";
    }
}
class MyMainclass{
    public static void main(String[] args) {
        Firstclass obj1= new Firstclass();
        Ladies obj2 = new Ladies();
        General obj3 = new General();
        System.out.println(obj1.notice());
        System.out.println(obj2.notice());
        System.out.println(obj3.notice());
    }

}

public class Fruit {
    String name,taste;
    int size;
    public void eat() {
        this.name = "Mango";
        this.taste = "yummy";
        this.size = 4;
        System.out.println("Mango taste is "+ this.taste);
    }
    }// end of the class
class Apple extends Fruit{
    public void eat(){
        this.taste="good";
        System.out.println("Apple taste is "+this.taste);
    }
}
class Orange extends Fruit{
    public void eat(){
        this.taste="great";
        System.out.println("Orange taste is "+this.taste);
    }
}
class Mainclass{
    public static void main(String[] args) {
        Fruit obj = new Fruit();
        Apple obj1 = new Apple();
        Orange obj2 = new Orange();
        obj.eat();
        obj1.eat();
        obj2.eat();
    }
}



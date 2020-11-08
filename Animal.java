
class Animal1 {  // parent classs
    public Animal1() {   //intanse
        this.eat();      // invoking methods using "this" object
        this.sleep();
        System.out.println("A new Animal");
    }

    public void eat() {
        System.out.println("eat method,Animal1,");
    }

    public void sleep() {
        System.out.println("sleep method,Animal1");

    }// end of the class
}

class Bird extends Animal1 {   //child class
    public Bird() {
        this.sleep();
        this.eat();
        this.fly();

    }

    public void eat() {
        System.out.println("eat method,Bird");
    }

    public void sleep() {
        System.out.println("sleep method,Bird");
    }

    public void fly() {
        System.out.println("fly method,Bird");

    }
}

public class Animal {   // main class
    public static void main(String[] args) {
        Animal1 obj1 = new Animal1();
        Bird obj2 = new Bird();

    }
}



class t1 implements Runnable{
    @Override
    public void run(){
        for (int i = 0; i <10; i++) {
            Thread.currentThread().setName("one");
            System.out.println("thread 1 ");
        }

    }
}
class t2 extends Thread{
    @Override
    public void run(){
        for (int i = 0; i <10 ; i++) {
            Thread.currentThread().setName("two");
            Thread.currentThread().setPriority(2);
            System.out.println("thread 2");
        }
    }
}
public class Multithreading {
    public static void main(String[] args) {
        Thread obj1 = new Thread(new t1());
        Thread obj2 = new Thread(new t2());
        obj1.start();
        obj2.start();
    }

}

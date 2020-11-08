package live;
import music.String.*;
import music.Wind.*;
import music.*;
public abstract class Test23 implements Playable{
    public static void main(String[] args) {
        veena obj = new veena();
        obj.play();
        System.out.println("veena class");
        Saxophone obj1 = new Saxophone();
        System.out.println("saxophone");
        obj1.play();



    }
}

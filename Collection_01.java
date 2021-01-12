import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Collection_01 {
    public static void main(String[] args) {
        ArrayList l1 = new ArrayList(90);
        l1.add("Rahul");
        l1.add(1,"Ansh");
        Iterator it = l1.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }


    }
}

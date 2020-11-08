import java.sql.Date;
import java.util.*;

public class Test31 {
    public static void main(String[] args) {
        Date obj =new  Date(0);
        System.out.println(obj.getClass().getName());
        java.util.Date obj1 = new java.util.Date(0);
        System.out.println(obj1.getClass().getName());
    }

}


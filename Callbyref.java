public class Callbyref {
    public void m1(String tstr[]){
        for (String s:tstr)
              {
                  System.out.println(s);

        }

    }
    public static void main(String[] args) {
        String str[] = {"aaa","bbb","ccc"};
        Callbyref obj = new Callbyref();
        obj.m1(str);
        for (String s:str)
              {
                  System.out.println(s);
        }




    }
}

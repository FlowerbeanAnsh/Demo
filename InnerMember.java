class Door{
    public boolean islocked(String keycode){
        class Lock{  //memeber class
            public boolean lockstatus(String key){
                if(key.equals("12345")){
                    return true;
                }
                else{
                    return false;
                }
            }

        }
        Lock obj = new Lock();
        return obj.lockstatus(keycode);
    }
}

public class InnerMember {
    public static void main(String[] args) {
        Door obj2 = new Door();
        boolean res =obj2.islocked("12345");
        if(res){
            System.out.println("shop is open");
        }
        else{
            System.out.println("shop is closed");
        }
    }
}

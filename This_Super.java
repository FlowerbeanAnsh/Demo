class Parent{
    public int rollno=70;  // super keyword using this value of parent class

    Parent(){
        System.out.println(this.rollno);

    }

}//end of this class

class child extends Parent {
    int num = 30;     //current class instanse variable
    public void m1(int num){

        System.out.println(this.num);   //30
        System.out.println(num);   //100
        System.out.println(super.rollno);  //100
    }

}


public class This_Super {
    public static void main(String[] args) {
        child obj = new child();
        obj.m1(100);

    }


}

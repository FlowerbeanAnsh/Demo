class a1{
    public a1() {
        System.out.println(" a1 not args");
    }
    public a1(int b){
        System.out.println(" a1 with argument");
    }

}//end of the class
class a2 extends a1{
    public a2(){
        System.out.println("a2 non argumnent");
    }
    public a2(int f){
        System.out.println("a2 with args");
    }

}
class a3{
    public static void main(String[] args) {
        a2 obj = new a2();

    }
}



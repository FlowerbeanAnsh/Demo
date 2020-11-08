public class Rectangle {
    int length;
    int breadth;
    public void m() {
        int area = length * breadth;
        System.out.println(area);
}
        Rectangle() {
            this.length = 0;
            this.breadth = 0;
        }
        Rectangle( int l, int b){
            this.length = l;
            this.breadth = b;
        }
        Rectangle( int n){
            this.length = n;
            this.breadth = n;


        }


    public static void main(String[] args) {

        Rectangle obj = new Rectangle();
        Rectangle obj1 = new Rectangle(3,4);
        Rectangle obj2 = new Rectangle(5);
        obj.m();
        obj1.m();
        obj2.m();


    }




    }


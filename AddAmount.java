
public class AddAmount {
    int amount=50;
    AddAmount(){


    }
    AddAmount(int a){
        amount=amount+a;
        System.out.println(amount);
    }


    public static void main(String[] args) {
        AddAmount obj= new AddAmount(10);

    }
}

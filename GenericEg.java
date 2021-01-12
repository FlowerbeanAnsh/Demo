public class GenericEg{
    public <p> void PrintArray(p [] s1){
        for (int i = 0; i < s1.length; i++) {
            System.out.println(s1[i]);
        }

    }

    public static void main(String[] args) {
        GenericEg obj = new GenericEg();
        String[] names = new String[]{"Ansh","vansh","ankur","vishal"};
        Integer[] numbers = {10,12,34,55,23};
        obj.PrintArray(names);
        obj.PrintArray(numbers);
    }
}
// we are using generic method because it is very difficult to overload a method many
//times according to datatype..so generic methods help us to solve this problem
// we have only a single method by which we can print all type of values
// we can not use generic method without arguments



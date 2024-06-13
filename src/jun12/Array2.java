package jun12;

public class Array2 {

    public static void main(String[] args) {
        String a = "Apple";
        String[] fruits = {"Apple", "Orange", "Lime", "Pineapple", "Mango" , "Grape"};

//        System.out.println(fruits[0]);
//        System.out.println(fruits[1]);
//        System.out.println(fruits[2]);
//        System.out.println(fruits[3]);
//        System.out.println(fruits[4]);

        System.out.println(fruits.length);

        for(int i = 0; i < fruits.length; i++){
            System.out.println(fruits[i]);
        }
    }
}

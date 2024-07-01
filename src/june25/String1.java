package june25;

import java.util.ArrayList;

public class String1 {


    public static void main(String[] args) {

       ArrayList<Integer> a = new ArrayList<>();
       a.add(2);
       a.add(4);
       a.add(6);

        System.out.println(a);
        System.out.println(a.get(0));

        String b = "Java is a popular language.";

        System.out.println(b);

        System.out.println(b.charAt(0));

        System.out.println(b.contains("popular"));

        System.out.println(b.length());

        System.out.println(b.charAt(10));

    }
}

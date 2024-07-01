package june25;

import java.util.ArrayList;

public class ArrayList1 {

    public static void main(String[] args) {
        ArrayList<String> a = new ArrayList<>();

        a.add("new york");
        a.add("texas");
        a.add(0, "new jersey");
        a.add("california");
        a.add("florida");
        a.add("north carolina");


        for(int i = 0; i < a.size(); i++){
            System.out.println(a.get(i));
        }

        System.out.println(a.get(4));

        System.out.println(a.size());

        a.remove(1);
        a.remove(2);

        System.out.println("----------------");


        for(int i = 0; i < a.size(); i++){
            System.out.println(a.get(i));
        }

        a.clear();


    }
}

package june25;

import java.util.AbstractList;
import java.util.ArrayList;

public class ArrayList2 {

    public static void main(String[] args) {

        ArrayList<Integer> a = new ArrayList<>();


        a.add(2);
        a.add(4);
        a.add(2, 6);
        a.add(8);
        a.add(1, 10);

        a.remove(2);

        for(int i = 0; i < a.size(); i++){
            System.out.println(a.get(i));
        }


    }
}

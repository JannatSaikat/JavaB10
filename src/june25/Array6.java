package june25;

import java.util.ArrayList;

public class Array6 {

    public static void main(String[] args) {

        int[] a = {2 , 4, 6};

        for(int i = 0; i <= a.length - 1; i++){
            System.out.println(a[i]);
        }

        ArrayList<Integer> b = new ArrayList<>();

        b.add(2); b.add(4); b.add(6);

        for(int j = 0; j < b.size(); j++){
            System.out.println(b.get(j));
        }

        System.out.println(b.get(2));
        System.out.println(b.get(3));


    }
}

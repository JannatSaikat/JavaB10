package jun26;

import java.util.ArrayList;

public class ArrayList3 {

    public static void main(String[] args) {
        int[] a = {2, 4, 6};

        ArrayList<Integer> b = new ArrayList<>();
        b.add(2);
        b.add(4);
        b.add(6);

        String c  ="Java is a programming language";

        for(int i =0; i < a.length; i++){
            System.out.println(a[i]);
        }

        for(int x: a){
            System.out.println(x);
        }

        for(int i = 0; i < b.size(); i++){
            System.out.println(b.get(i));
        }

        for(int i = 0; i < c.length(); i++){
            System.out.println(c.charAt(i));
        }
    }
}

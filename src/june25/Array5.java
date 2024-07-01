package june25;

public class Array5 {

    public static void main(String[] args) {
        int a = 5;

        a = 6;

        int b[] = {5, 10, 15 };

        for(int i = 0; i < b.length; i++){
            System.out.println(  b[i]);
        }

        b[1] = 55;

        int c[] = new int[3];
        c[0] = 20;
        c[1] = 25;
        c[2] = 30;

        for(int j = 0; j < c.length; j++) {
            System.out.println(c[j]);
        }

        System.out.println(c.length);
    }
}

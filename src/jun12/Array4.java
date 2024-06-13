package jun12;

public class Array4 {

    public static void main(String[] args) {
        int a = 5;
        int b;
        b = 10;

        int[] c = { 3, 5, 7, 9};

        int[] d = new int[4];
        d[0] = 3;
        d[1] = 5;
        d[2] = 7;
        d[3] = 9;

        for(int i = 0; i < d.length; i++){
            System.out.println(d[i]);
        }

        System.out.println(d.length);


    }
}

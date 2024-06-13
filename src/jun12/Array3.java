package jun12;

public class Array3 {

    public static void main(String[] args) {

        int b = 7;
        int[] a = {1, 3, 5, 7, 9, 11};

        System.out.println(a[3]);

        //number of elements are 6
        //index range is 0 -5
        /*
        for(int i = 0; i <= (6 - 1): i++)
        for(int i = 0; i < 6: i++)
         */


        for(int i = 0 ; i <= a.length - 1; i++){
            System.out.println(a[i]);
        }
    }
}

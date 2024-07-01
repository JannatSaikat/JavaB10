package june25;

public class MaxMin {

    /*
    "Write a program that finds the maximum and minimum elements in an array of integers.
    Numbers: {5, 2, 8, 1, 9, 23, 7, 12, -8}"
     */

    public static void main(String[] args) {
        int[] a = {5, 2, 8, 1, 9, 23, 7, 12, -8};

        int min = a[0];

        for(int i = 0; i < a.length; i++){
            if(a[i] < min) {
                min = a[i];
            }
        }

        System.out.println(min);

        int max = a[0];

        for(int x=0; x < a.length; x++){
            if(a[x] > max) {
                max = a[x];
            }
        }

        System.out.println(max);

    }
}

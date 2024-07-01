package jun18;

public class LargestOfThree {

    public static void main(String[] args) {
        int a = 5;
        int b = 10;
        int c  = 15;

        int largest = a; //largest = 5;

        if( b > largest) { // 10 > 5
            largest = b;  // largest =  10;
        }

        if (c > largest) {  // 15 > 10
            largest = c;  // largest = 15;
        }

        System.out.println(largest);

    }
}

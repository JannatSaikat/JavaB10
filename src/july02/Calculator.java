package july02;


import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("please input the 1st number");
        int number1 = sc.nextInt();

        System.out.println("please input the 2nd number");
        int number2 = sc.nextInt();

        int sum = number1 + number2;

        System.out.println("The sum is: " + sum);
    }
}

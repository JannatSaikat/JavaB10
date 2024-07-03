package july02;

import java.util.Scanner;

public class UserInput1 {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("please input your name here: ");
        String name = scanner.next();

        System.out.println("please input current year here: ");
        int currentYear = scanner.nextInt();

        System.out.println("Name is: " + name + ". Current year is: " + currentYear);
    }
}

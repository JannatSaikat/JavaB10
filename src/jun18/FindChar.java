package jun18;

public class FindChar {

    /*Write a program that takes a character as input from the user
    and checks if it's a vowel (a, e, i, o, u) or a consonant.
    Print the appropriate message.
     */

    public static void main(String[] args) {
        char x = 'd';

        if(x == 'a' || x == 'e' || x == 'i' || x == 'o' || x=='u'){
            System.out.println("it's vowel");
        } else {
            System.out.println("it's consonant");
        }
    }
}

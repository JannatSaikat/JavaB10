package jun11;

public class Voting {

    public static void main(String[] args) {
        int age = 43;
        String citizenship = "non-citizen";


        if(age >= 18 && citizenship == "citizen"){
            System.out.println("You can vote");
        } else if(age < 18 || citizenship!="citizen") {
            System.out.println("you can't vote");
        }
    }
}

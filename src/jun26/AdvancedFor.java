package jun26;

import java.util.ArrayList;

public class AdvancedFor {


    public static void main(String[] args) {

        String[] states = {"NY", "NJ", "MA", "PA", "MI", "MD", "LA"};


        for(int a = 0; a < states.length; a++){
            System.out.println(states[a]);
        }

        for(String b : states){
            System.out.println(b);
        }

        ArrayList<Double> balances = new ArrayList<>();
        balances.add(23.3);
        balances.add(24.6);
        balances.add(27.4);

        for(Double c: balances){
            System.out.println(c);
        }

    }
}

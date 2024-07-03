package july02;

import java.sql.SQLOutput;

public class Calculator2 {
    public static void main(String[] args) {

        Calculator2 ref = new Calculator2();
        ref.sum(12, 13);
        ref.sum(12, 15);
        ref.multiply(12, 20);
        ref.name("Bob Dylan");
        ref.name("Leonard Cohen");
        ref.sum(23, 56);
        ref.sum(34, 45);

    }

    void sum(int a , int b){
        System.out.println(a + b);
    }

    void multiply(int c, int d){

        System.out.println( c * d);
    }

    void name(String a){

        System.out.println(a);
    }
}

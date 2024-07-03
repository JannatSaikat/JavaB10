package july02;

public class Method1 {

    public static void main(String[] args) {
        Method1 ref = new Method1();
        ref.multiply();
    }

    private void sum(){
        int a = 5;
        int b = 10;
        System.out.println(a  + b);
    }

    private void multiply(){
        int a = 5;
        int b = 10;
        System.out.println(a * b);
    }

    void method1(){
        System.out.println("Method 1 is here");
    }


}

package july02;

public class Parameter1 {
    // print name and state
    void printSomething(String a, String b){
        System.out.println("Name is: "+ a + ". State is: " + b + ".");
    }

    public static void main(String[] args) {
        Parameter1 ref = new Parameter1();
        ref.printSomething("Sharif", "MA");
        ref.printSomething("Kowshik", "NY");

    }
}

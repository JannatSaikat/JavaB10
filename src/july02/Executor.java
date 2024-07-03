package july02;
import jun26.ClassA;
public class Executor {

    public static void main(String[] args) {
        Method1 a = new Method1();
        ClassA ca = new ClassA();
        ca.m1();
        System.out.println(ClassA.j);
        Executor e  = new Executor();
        e.n1();
        n2();
    }

    void n1(){
        System.out.println("method n1");
    }

    static void n2(){
        System.out.println("this is static method");
    }

    //Scanner - take input from users
    //Object - utilize any resource from the specific class
    //Access Modifier - defines who can access what
    //Parameter - placeholder
    //Static - doesn't need object creation
}

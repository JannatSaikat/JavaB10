package jun11;

public class Grading {

    //4 A
    //3 B
    //2 C
    //1 F

    public static void main(String[] args){
        int point = 1;


        if(point == 4) {
            System.out.println("grade is A");
        } else if (point == 3) {
            System.out.println("grade is B");
        } else if(point == 2){
            System.out.println("grade is C");
        } else {
            System.out.println("grade is F");
        }
    }
}

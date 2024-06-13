package jun11;

public class Grading2 {

    //80-100 A
    //60-79 B
    //40-59 C
    //0-39 F

    public static void main(String[] args) {
      int point = 158;


      if(point >= 80 && point <=100){
          System.out.println('A');
      } else if (point >= 60 && point <= 79) {
          System.out.println('B');
      } else if (point >= 40 && point <= 59) {
          System.out.println('C');
      } else if(point <=39 && point >=0) {
          System.out.println('F');
      } else{
          System.out.println("Wrong input");
      }
    }
}

package p2;

import java.util.Scanner;

public class StuMain {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        Student obj1= new Graduate_Student(s.nextInt(),s.next(),s.next(),s.nextFloat(),s.next());
        Student obj2= new Research_Student(s.nextInt(),s.next(),s.next(),s.next(),s.nextInt());
        obj1.display_student_info();
        obj2.display_student_info();

    }
}

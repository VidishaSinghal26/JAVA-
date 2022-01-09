import java.util.Scanner;

public class Student {
    private int rollno;
    private int marks;
    private String name;

    public void setRollno(int rollno) {
        this.rollno = rollno;
    }

    public int getRollno() {
        return rollno;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void display(String name ,int rollno,int marks) {
        System.out.println(name + " " + rollno + " " + marks);
    }

    public static void main(String[] args) {
        Student arr[] = new Student[10];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            arr[i] = new Student();
            arr[i].setRollno(sc.nextInt());
            arr[i].setMarks(sc.nextInt());
            arr[i].setName(sc.next());
        }
        int max = arr[0].marks;
        int min = arr[0].marks;
        for (int i = 0; i < 10; i++) {
            if (arr[i].marks > max) {
                max = arr[i].marks;
            } else if (arr[i].marks < min) {
                min = arr[i].marks;
            }
        }
        for (int i = 0; i < 10; i++) {
            if (arr[i].marks == max) {
                arr[i].display(arr[i].name,arr[i].rollno,arr[i].marks);
                //System.out.println(arr[i].name+" "+arr[i].rollno+" "+arr[i].marks);
            }
            else if (arr[i].marks == min)
            {
                arr[i].display(arr[i].name,arr[i].rollno,arr[i].marks);
               // System.out.println(arr[i].name + " " + arr[i].rollno + " " + arr[i].marks);
            }
        }

    }

}

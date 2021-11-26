package p1;

public class Student {
    protected int rollno ;
    protected String name ;
   public Student (int roll, String namee)
    {
        rollno = roll;
        name = namee;
    }
    public Student ()
    {
       rollno = 44;
       name = "XYZ";
    }
    public void method1(){
        System.out.println(rollno + " " + name);
    }
}

import p1.Student;
public class Test extends Student
{
    public static void main(String[] args) {
        Student obj1 = new Student();
        Student obj2 = new Student(22,"Vidisha");
        obj1.method1();
        obj2.method1();
    }
}

package p2;

import p2.Student;

public class Graduate_Student extends Student {
    public float percentage;
    public String stream;
    Graduate_Student(int age, String name, String program,float percentage,String stream)
    {
        super(age,name,program);
        this.percentage = percentage;
        this.stream = stream;
    }
    public void display_student_info()

    {
        System.out.println(name+" "+age+" "+program+" "+percentage+" "+stream);
    }
}

package p2;

public class Student {
    public String name;
    public int age;
    public String program;

    Student(int age, String name, String program) {
        this.age = age;
        this.name=name;
        this.program=program;
    }

    public void display_student_info() {
        System.out.println(name + " " + age + " " + program);
    }

}
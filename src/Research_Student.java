package p2;
import p2.Student;
public class Research_Student extends Student {
    String specialization;
    int years_of_experience;
    Research_Student( int age, String name, String program,String specialization, int years_of_experience)
    {
        super(age,name,program);
        this.specialization = specialization;
        this.years_of_experience = years_of_experience;
    }
    public void display_student_info()
    {
        System.out.println(name+" "+age+" "+program+" "+specialization+" "+years_of_experience);
    }
}

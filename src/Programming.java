import java.util.Scanner;

public class Programming {
    String s,name;
    Programming()
    {
        name="I love programming language";
    }
    Programming(String s)
    {
        name=s;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Programming obj = new Programming();
         obj.s=sc.next();
        System.out.println("I love "+obj.s);
        System.out.println(obj.name);
        //Programming obj1 = new Programming(sc.next());
    }
}

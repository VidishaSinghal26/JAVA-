import java.util.Scanner;

public class ExceptionHandling1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter an integer:");
        String ss= s.next();
        try {
            int a=Integer.parseInt(ss);
            System.out.println("The square value is "+a*a);
        }
        catch (NumberFormatException e) {
            System.out.println("Enter input is not a valid format for an integer");
        }

    }
}

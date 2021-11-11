import java.util.Scanner;
public class Palindrome {

    int num,a;
    int rev;
    int rem;

    Palindrome(int n) {
        num = n;
        rev = 0;
        a=n;

    }
    public void palind() {
        while(num>0) {
            rem = num % 10;
            rev = (rev * 10) + rem;
            num = num / 10;
        }
    }
    public void display(){
        if (rev==a)
        {
            System.out.println(a+" is a palindrome");
        }
        else{
            System.out.println(a+" is not a palindrome");
        }
    }


    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Palindrome obj = new Palindrome(s.nextInt());
        obj.palind();
        obj.display();
    }
}

import java.util.Scanner;

public class DoorKey {

    public void m1( String key) {
        class Lock {// Local Class

            public void check(String key) {
                if (key.equals("1234")) {
                    System.out.println("Valid Key");
                } else {
                    System.out.println("Invalid Key");
                }
            }

        }
                Lock obj = new Lock();
                obj.check(key);

        }
        // new Lock().check(key);// when method making and method calling is non static
        //Lock.check(key);// when method is static
    }

class DoorMain{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String key= s.next();
        new DoorKey().m1(key);
    }
}

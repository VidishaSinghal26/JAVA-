import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n1=s.nextInt();
        for (int i =0;i<n1;i++){
            int n2=s.nextInt();
            int c=0;
            for (int j=1;j<=n2;j++){
                if (n2%j==0){
                    c++;
                }
            }
            if (c==2){
                System.out.println("prime");
            }
            else{
                System.out.println("not prime");
            }
        }

    }
}

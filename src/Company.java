import java.util.Scanner;

public class Company {

    public static void main(String[] args) {
        Company[] salesman = new Company[5];
        int product[][] = new int[5][3];
        Scanner sc = new Scanner(System.in);
        int sum = 0, sum1 = 0;
        int k = 1;
        for (int i = 0; i < salesman.length; i++) {
            salesman[i] = new Company();

            System.out.println("Enter the sales of 3 items sold by");
            System.out.print("salesman " + k + ":");
            for (int j = 0; j < 3; j++) {
                product[i][j] = sc.nextInt();
            }
            k++;
        }

        k = 1;
        int l = 1;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 3; j++) {
                sum = sum + product[i][j];
            }
            System.out.println("Total sales by salesman" + k + "=" + sum);
            k++;
            sum = 0;
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                sum1 = sum1 + product[j][i];
            }
            System.out.println("Total sales of item" + l + "=" + sum1);
            l++;
            sum1=0;
        }
    }
}


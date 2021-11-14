import java.util.Scanner;

public class ExceptionHandling2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array:");
        int n=s.nextInt();
        int arr1[] = new int[n];
        System.out.println("Enter the elements in the array");
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = s.nextInt();
        }
        System.out.print("Enter the index of the array element you want to access:");
        int a= s.nextInt();
        try {
            System.out.println("The array element at index "+a+" = "+arr1[a]);
            }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
        }

    }
}

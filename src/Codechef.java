import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int c=0;
        String s;
        for (int i=1;i<=a;i++)
        {
            s=sc.next();
            
            for (int j=0 ; j<(s.length()-1); j++)
            {
                if(s.charAt(j)==s.charAt(j+1))
                {
                    c++;
                }
            }
            System.out.println(c);
            c=0;
        }

    }
}


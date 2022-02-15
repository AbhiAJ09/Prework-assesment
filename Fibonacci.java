import java.util.*;
public class Fibonacci {
    public static void main (String [] args)
    {
        Scanner num = new Scanner (System.in);
        System.out.println("Enter the no. for Fibonacci series");
        int input = num.nextInt();
        int a=0; int b=1;
        for ( int i=1; i<=input; ++i)
        {
            System.out.print(a + " ");
            int sum=a+b;
            a=b;
            b=sum;
            
        }

    }
}
import java.util.*;
public class CheckPrime {
    public static void main (String [] args) {
        Scanner num = new Scanner (System.in);
        System.out.println("enter any integer no.");
        int input = num.nextInt();
        int flag=0;
        for (int i =2; i<=input/2; ++i)
        {
            if(input%i==0)
            {
              flag=1;
            }
        }

        if (flag==1)
        {
            System.out.println("Entered no. is not prime");
        }
        else{
            System.out.println("Entered no. is prime no.");
        }
    }
}
import java.util.*;
public class Pattern {
    public static void main (String [] args) {
        Scanner star= new Scanner (System.in);
        System.out.println("Enter the no. of levels of star to be printed");
        int input=star.nextInt();
        int i,j;
        for (i=input; i>=0; i--)
        {
            for (j=i; j>=0; j--)
            {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
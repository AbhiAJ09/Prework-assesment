import java.util.*;
public class CheckPalindrome{
    public static void main (String [] args)
{
Scanner num=new Scanner(System.in);
System.out.println("Entered a no.");
int a=num.nextInt();
int b= a;
int revNum=0;
while (a>0)
{
revNum = revNum *10 + (a%10);
a=a/10;


}
if (b==revNum)
{
    System.out.println("Entered no. is a palindrone no.");
     System.out.println(revNum);
}
else
{
    System.out.println("Entered no. is not a palindrone no.") ;
    System.out.println(revNum);
}

}
}
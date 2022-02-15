import java.util.*;
public class CheckPalindrome{
    public static void main (string [] args)
{
Scanner num=new Scanner(System.in);
int a=num.nextint();
int revNum=0;
while (a>0)
{
revNum = revNum *10 + (a%10);
a=a/10;
return rev_num;
}
if (a=revNum)
{
    System.out.println("Entered no. is a palindrone no.");
}
else()
{
    System.out.println("Entered no. is not a palindrone no.") ;
}

}
}
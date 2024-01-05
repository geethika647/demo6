//JAVA PROGRAME TO PRINT THE REVERESE THE DIGITS
import java.util.Scanner;
class Reveresedigits
{
public static void main(String args[])
{
Scanner scob=new Scanner(System.in);
int n;
int rd=0;
n=scob.nextInt();
while(n>0)
{
rd=rd*10+(n%10);
n=n/10;
}
System.out.println(rd);
}
}

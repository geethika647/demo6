//JAVA PROGRAME TO FIND THE SUM OF THE DIGITS
import java.util.Scanner;
class Sumdigits
{
public static void main(String args[])
{
Scanner scob=new Scanner(System.in);
int n;
int sd=0;
n=scob.nextInt();
while(n>0)
{
//rem=n%10;
sd=sd+n%10;
n=n/10;
}
System.out.println(sd);
}
}


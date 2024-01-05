// to print the factors of the given number
import java.util.Scanner;
class Factors
{
public static void main(String args[])
{
Scanner scob=new Scanner(System.in);
int n=scob.nextInt();
for(int i=1;i<=n;i++)
{
if(n%i==0)
{
System.out.print(i);
if(i!=n)
System.out.print(",");
}
}
}
}


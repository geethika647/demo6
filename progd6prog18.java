// to check whether the given number is prime or not
import java.util.Scanner;
class Prime
{
public static void main(String args[])
{
Scanner scob=new Scanner(System.in);
int n=scob.nextInt();
int count=0;
for(int i=1;i<=n;i++)
{
if(n%i==0)
{
count++;
System.out.print(i);
if(i!=n)
System.out.print(",");
}
}
System.out.println("\nCount of factors of "+n+" is "+count);
if(count==2)
{
System.out.println("PRIME");
}
else
{
System.out.println("NOT PRIME");
}
}
}


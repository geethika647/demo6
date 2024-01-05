import java.util.Scanner;
class Productdigits
{
public static void main(String args[])
{
Scanner scob=new Scanner(System.in);
int n;
int pd=1;
n=scob.nextInt();
while(n>0)
{
pd=pd*(n%10);
n=n/10;
}
System.out.print(pd);
}
}

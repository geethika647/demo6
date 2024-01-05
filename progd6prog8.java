// pailindrome
import java.util.Scanner;
class Palindrome
{
public static void main(String args[])
{
Scanner scob=new Scanner(System.in);
int n,temp;
int pd=0;
n=scob.nextInt();
temp=n;
while(n>0)
{
pd=pd*10+(n%10);
n=n/10;
}
if(pd==temp)
{
System.out.println("the number is a palindrome");
}
else
{
System.out.println("the number is not a palindrome");
}
}
}
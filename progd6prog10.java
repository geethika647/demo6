//PALINDROME STRING
import java.util.Scanner;
class Palindromestring
{
public static void main(String args[])
{
Scanner scob=new Scanner(System.in);
String str;
String ps="";
System.out.println("enter a string");
str=scob.next();
int len=str.length()-1;
for(int i=len;i>=0;i--)
{
ps=ps+str.charAt(i);
}
if(str.equals(ps))
{
System.out.println("it is a palindrome");
}
else
{
System.out.println("it is not a palindrome");
}
}
}
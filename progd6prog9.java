//reverese the string
import java.util.Scanner;
class Reveresestring
{
public static void main(String args[])
{
Scanner scob=new Scanner(System.in);
String str;
String rs="";
System.out.println("enter a string");
str=scob.next();
int len=str.length()-1;
for(int i=len;i>=0;i--)
{
rs=rs+str.charAt(i);
}
System.out.println(rs);
}
}
import java.util.Scanner;
class Breakex1
{
public static void main(String args[])
{
Scanner scob=new Scanner(System.in);
int n=scob.nextInt();
byte i=0;
//short i=0;
while(true)
{
System.out.print(i+",");
if(i==n)break;
i++;
}
}
}
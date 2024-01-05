//printing the values from 1 to 20 and getting its result as the output
class Forloop
{
public static void main(String args[])
{
int i;
int sum=0;
for(i=0;i<=100; i=i+5)
{
System.out.print(i+"+");
sum=sum+i;
}//while
System.out.println("\b"+"=" +sum);
}//main
}
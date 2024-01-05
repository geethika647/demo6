//printing the values from 1 to 20 and getting its result as the output
class Test1
{
public static void main(String args[])
{
int i=1;
int sum=0;
while(i<=20)//if we declare ++i then number 1 will not be added(++i <=20 then the output is 209)
{
sum=sum+i;//sum +=i;
i++;//it adds the one(the output is 210)
}//while
System.out.println(sum);
}//main()
}
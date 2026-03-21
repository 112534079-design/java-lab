import java.util.*;
class five
{
static public void main(String[]args)throws Exception
{
String s1,s2;
int i1,i2;
Scanner Input = new Scanner (System.in);
System.out.println("Enter the first value");
s1=Input.nextLine();
i1=Integer.parseInt(s1);
System.out.println("Enter second value");
s2=Input.nextLine();
i2=Integer.parseInt(s2);
if((i1%i2)==0)
{
System.out.println("The given number is even");
}
else
{
System.out.println("The given number is odd");
}
}
}
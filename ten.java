import java.util.*;
class ten
{
static public void main(String []args)throws Exception
{
int x,y;
Scanner s1=new Scanner (System.in);
System.out.println("Enter x value");
x=Integer.parseInt(s1.nextLine());
System.out.println("Enter y value");
y=Integer.parseInt(s1.nextLine());
if(x>y)
{
System.out.println("x is greater than y");
}
else
{
System.out.println("y is greater than x");
}
}
}
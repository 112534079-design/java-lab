import java.util.*;
class eight
{
static public void main(String []args)throws Exception
{
Scanner s1 =new Scanner(System.in);
String s11;
int x,y;
System.out.println("Enter the value of x");
s11=s1.nextLine();
x =Integer .parseInt(s11);
y = Integer.parseInt(s11);
x=x+=y;
System.out.println("the value of x is"+x);
y=x-=y;
System.out.println("The value of y is"+y);
}
}
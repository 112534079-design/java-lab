import java.util.*;
class nine
{
static public void main(String[]args)throws Exception
{
Scanner s1=new Scanner(System.in);
String s11;
int a,b;
System.out.println("Enter a value");
s11=s1.nextLine();
a=Integer.parseInt(s11);
a++;
System.out.println("Value of a is"+a);
b=a;
++b;
System.out.println("Value of b is"+b);
a++;
b=a;
System.out.println("Value of b is"+b);
}
}
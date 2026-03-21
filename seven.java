import java.util.*;
class seven
{
static public void main(String[]args)throws Exception
{
Scanner input= new Scanner(System.in);
String s1,s2;
System.out.println("Enter first string");
s1 = input .nextLine();
System.out.println("Enter second string");
s2 = input.nextLine();
if(s1==s2)
{
System.out.println("Two string are equal");
}
if(s1!=s2)
{
System.out.println("Two string are not equal");
}
}
}
import java.util.Scanner;
import java.util.*;
class MakeString{
public static void main(String [] args)
{
Scanner sc =new Scanner(System.in);
String n,t;
StringBuilder sb =new StringBuilder();
System.out.println("enter the Main String");
n=sc.nextLine();
System.out.println("enter the sub string to be searched in the main String");
t=sc.nextLine();
int i=n.indexOf(t);
if(i>=0)
{
sb.append(n.charAt(i-1));
sb.append(n.charAt(i+t.length()));
System.out.println("the character just before and after of the given sub string first Ocuurence is: "+sb.charAt(0)+" and " +sb.charAt(1));
}
else
{
System.out.println("the given sub string does not occur in the main String");
}
}
}
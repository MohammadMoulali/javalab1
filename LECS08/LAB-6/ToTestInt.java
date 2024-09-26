import java.util.*;
import java.lang.Math;
interface test {
 int square(long a);
}
class Arithmatic implements test
{
public int square(long a)
{
	if(a<0)
	{
	a=a*(-1);
	}

return ((int)Math.pow(a,2));
}
}
class ToTestInt{
public static void main(String [] args)
{
 test ob=new Arithmatic();
Scanner sc =new Scanner(System.in);
System.out.println("enter a number");
int d=sc.nextInt();
System.out.println("the square value of given no is"+ob.square(d));
}
}
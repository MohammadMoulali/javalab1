import java.util.*;
class Point
{
int x,y;
Point(int a,int b)
{
x=a;
y=b;
}
public int slope(int x2,int y2)
{
	int j;
 try{
	if(x ==x2)
	{
		throw new ArithmeticException();
	}
		
           
	

}
catch(ArithmeticException e){
System.out.println("the x coordinates are equal we can not find the slope"+e);
}
j=(int)(y2-y)/(x2-x);
return j;
}
}
class SlopeFinder
{
public static void main(String [] args)
{
	Scanner sc =new Scanner(System.in);
	System.out.println("enter first  point coordinates ");
	int x=sc.nextInt();
	int y=sc.nextInt();
	System.out.println("enter second  point coordinates ");
	int x1=sc.nextInt();
	int y1=sc.nextInt();
	Point p=new Point(x,y); 
	System.out.println("the slope is "+p.slope(x1,y1));
}
}	



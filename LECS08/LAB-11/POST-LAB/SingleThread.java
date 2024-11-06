import java.util.*;
import java.io.*;
class Add extends Thread
{
int n1,n2;
	Add(int x1,int x2)
{
n1=x1;
n2=x2;
}

public void run()
{

System.out.println("the addition of two numbers is "+(n1+n2));
}
}
class Sub extends Thread
{
int n1,n2;
	Sub(int x1,int x2)
{
n1=x1;
n2=x2;
}


public void run()
{
System.out.println("the substraction of two numbers is "+(n1-n2));
}
}
class Mul extends Thread
{
int n1,n2;
	Mul(int x1,int x2)
{
n1=x1;
n2=x2;
}

public void run()
{
System.out.println("the multiplication  of two numbers is "+(n1*n2));
}
}



class SingleThread
{
public static void main(String[] args)
{
	Scanner sc = new Scanner(System.in);
	System.out.println("enter two numbers to perform operation");
	int n1=sc.nextInt();
	int n2=sc.nextInt();
	Add a1=new Add(n1,n2);
	Sub a2=new Sub(n1,n2);
	Mul a3=new Mul(n1,n2);
	a1.start();
	a2.start();
	a3.start();
	




}
}



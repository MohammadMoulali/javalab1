import java.util.*;
import java.lang.Math;
interface Number 
{
boolean isZero(int n);
boolean isPositive(int n);
boolean isNegative(int n);
boolean isOdd(int n);
boolean isEven(int n);
boolean isPrime(int n);
boolean isAmstrong(int n);
}
class Verification implements Number 
{
public boolean isZero(int n)
{
	if(n==0)
	 	return true;
	else
		return false;
}
public boolean isPositive(int n)
{
	if(n>0)
		return true;
	else 
		return false;
}
public boolean isNegative(int n)
{
  	if(n<0)
		return true;
	else
		return false;
}
public boolean isOdd(int n)
{
	if(n%2!=0)
		return true;
	else
		return false;
}
public boolean isEven(int n)
{
	if(n%2==0)
		return true;
	else
		return false;
}
public boolean isPrime(int n)
{
	int j=0;
	for(int i=1;i<=n;i++)
	{
		if(n%i==0)
		{
			j++;
		}
 	}
      	if(j==2)
		return true;
	else
		return false;
}
public boolean isAmstrong(int n)
{
if(n<0)
{
n=n*(-1);
}
double c=0;
int x=n;
while(x>0)
{
int r=x%10;
c++;
x=x/10;
}
int y=n;
double sum=0;
while(y>0)
{
double r=y%10;
sum=sum+Math.pow(r,c);
y=y/10;
}
if(sum==n)
{
return true;
}
else
return false;
}
}
class Check
{
public static void main(String []args)
{
Scanner sc =new Scanner(System.in);
System.out.println("enter a number");
int  a=sc.nextInt();
Number obj=new Verification();
String s;
s=" ";
int i=0;
if(obj.isZero(a))
{
  s=s.concat("and zero");
}
if(obj.isPositive(a))
{
 s=s.concat(" and positive");
}
if(obj.isNegative(a))
 s=s.concat(" Negative");
if(obj.isOdd(a))
 s=s.concat(" and Odd");
if(obj.isEven(a))
 s=s.concat(" and Even");
if(obj.isPrime(a))
 s=s.concat(" and Prime");
if(obj.isAmstrong(a))
 s=s.concat(" and Amstrong");
System.out.println(s.substring(5,s.length()));
}
}





import resturant.*;
import java.util.*;
public class Customer
{
public static void main(String [] args)
{
Scanner sc=new Scanner(System.in);
Menu m=new Menu();
Bill b=new Bill();
m.displayMenu();
System.out.println("Enter your choice");
int ch=sc.nextInt();
System.out.println("enter quantity");
int q=sc.nextInt();
int tb=b.calculateBill(ch,q);
if(tb>0)
{
System.out.println("Total Bill: "+tb);
}
}
}
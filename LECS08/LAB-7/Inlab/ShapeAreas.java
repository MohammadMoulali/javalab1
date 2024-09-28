import shape.*;
import java.util.Scanner;
class ShapeAreas
{
public static void main(String [] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("enter height and width");
int h=sc.nextInt();
int w=sc.nextInt();
Rectangle r=new Rectangle();
Square s=new Square();
Triangle t =new Triangle();
t.area(h,w);
r.area(h,w);
s.area(h,w);
}
}

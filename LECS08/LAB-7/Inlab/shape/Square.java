package shape;
public class Square
{
int height,width;
public void area(int a, int b)
{
height=a;
width=b;
if(height==width)
System.out.println("Area of Square ="+(height*width));
else
System.out.println("Area of Square="+"Invalid Dimensions");
}
}

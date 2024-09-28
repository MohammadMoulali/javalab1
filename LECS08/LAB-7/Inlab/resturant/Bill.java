package restaurant;
public class Bill
{
public int calculateBill(int choice,int quantity)
{
int price=0;
switch(choice)
{
case 1:price=50;
	break;
case 2:price=20;
	break;
case 3:price=40;
	break;
}
return price*quantity;
}
}

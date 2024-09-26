import java.util.Scanner;
class Meal{
public static void main(String [] args){
Scanner sc=new Scanner(System.in);
float meal,tippercent,taxpercent,tip,tax,bill;
System.out.println("Enter meal Price");
meal=sc.nextFloat();
System.out.println("Enter  tip percentage");
tippercent=sc.nextFloat();
System.out.println("Enter tax Percentage");
taxpercent=sc.nextFloat();
tip=meal*tippercent/100;
tax=meal*taxpercent/100;
bill=meal+tip+tax;
System.out.println("Total bill price: "+bill);
}
}




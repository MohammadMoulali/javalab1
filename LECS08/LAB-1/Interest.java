import java.util.Scanner;
public class Interest
{
	public static void main(String[] args)
	{
		float balance=100000;
		int deposit=1000;
		System.out.println("to caluculate the intrest ");
		for(int month=1;month<=12;month++)
		{
			double intrestrate;
			if(balance<=110000)
			{
				intrestrate=0.01;
			}
			else if(balance>110000&&balance<=125000)
			{
				intrestrate=0.015;
			}
			else
			{
				intrestrate=0.02;
			}
			double intrest;
			intrest=balance*intrestrate;
			balance+=intrest;
			balance+=deposit;
			if(month<=12)
			{
				System.out.println("month"+month);
				System.out.println("intrestrate"+intrestrate);
				System.out.println("intrest"+intrest);
				System.out.println("balance"+balance);
			}
		}
	}
}

import java.util.Scanner;

class Agent
{
	static void startsWithMethod(String c)
	{
 	if(!c.substring(0,5).equalsIgnoreCase("agent"))
	{
	 System.out.println("you are not entering agent in starting ");
	}
else
{
System.out.println("yur code name is successfully register");
}
	}

	public static void main(String [] args)
	{
	Scanner sc=new Scanner(System.in);
	String codename,confirm;
	System.out.println("enter a Codename it start with agent and ends with x");
	codename=sc.nextLine();
	int i=0;
	while(true){
	try{
	int j=codename.charAt(i);
	if(j!=-1){
	i++;
	}
	else
	{
	break;
	}
	}
	catch(Exception e)
	{
 	break;
	}
	}
	if(i<=6)
	{
	System.out.println("INVALID CODE NAME");
	System.out.println("enter  a code name");
	codename=sc.nextLine();
	}
	else
	{
	System.out.println();
	System.out.println(" re enter your code name");
	confirm=sc.nextLine();
	if(confirm.equalsIgnoreCase(codename))
	{
	System.out.println("CODE NAME VERIFIED");
	}
	else
	{
	System.out.println("CODE NAME MIS-MATCH");
	}
	if(!codename.endsWith("X") &&!codename.endsWith("x"))
	{
	System.out.println("your codename must end with x");

	}
	startsWithMethod(codename);
		}
	}
}
 
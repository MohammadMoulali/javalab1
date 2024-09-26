import java.util.Scanner;

class Agent
{
void startsWithMethod(String c)
{
 if(c.subString(0,4)!='agent' || c.subString(0,4)!='Agent')
{
 System.out.println("you are not entering agent in starting or please enter agent as agent or Agent");
}
}

public static void main(String [] args)
{
String codename,confirm;
System.out.println("enter a Codename it start with agent and ends with x");
codename=sc.nextLine();
int i=0;
while(1){
try{
if(codename.charAt(i)){
i++;
}
else
{
break;
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
if(confirm==codename)
{
System.out.println("CODE NAME CONFIRMED");
}
else
{
System.out.println("CODE NAME MIS-MATCH");
}
if(codename.charAt(codename.length()-1)!='x' ||codename.charAt(codename.length()-1)!='X')
{
System.out.println("your codename must end with x");
}
startWithMethod(codename);
System.out.println("yur code name is successfully register");
}
}
}
 
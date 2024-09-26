import java.util.*;
interface EmployeeDetails
{
    void enterData();
    void displayData();
    void exit();
}
class Userselection implements EmployeeDetails
{
    String name;
    int id,salary;
    Scanner sc=new Scanner(System.in);
    public void enterData(){
        System.out.println("enter employee name,id,Salary");
        name=sc.nextLine();
        id=sc.nextInt();
        salary=sc.nextInt();
    }
    public void displayData()
    {
        System.out.println("Employee Name= "+name);
        System.out.println("Employee Id= "+id);
        System.out.println("Employee Salary= "+salary);
    }
    public void exit()
    {
        System.exit(0);
    }
    public static void main(String [] args)
    {
        Userselection ob=new Userselection();
        Scanner sc=new Scanner(System.in);
             ob.enterData();
            ob.displayData();
            ob.exit();
    }


    
}

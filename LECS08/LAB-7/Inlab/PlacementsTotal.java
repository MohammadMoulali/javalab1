import placements.Number_Of_Placements;
import java.util.Scanner;
class PlacementsTotal
{
    public static void main(String []args)
    {
        Scanner sc =new Scanner(System.in);
        System.out.println("Number of years ");
        int n=sc.nextInt();
        Number_Of_Placements[] ob = new Number_Of_Placements[n];
        int s=0;
        for(int i=0;i<n;i++)
        {
            ob[i]=new Number_Of_Placements();
            int d=ob[i].read_data();
            s=s+d;
        }
System.out.println("Total Number of placements "+s);
sc.close();
    }
    
}
import java.util.*;
class  Max
{
	public static void main(String [] args)
	{
		try
		{
			File obj=new File("Scores.txt.txt");
			
 			Scanner  f= new Scanner((Readable) obj);
			int max=Integer.MIN_VALUE;
			int s;
			while(true)
			{
			try{
			 s=f.nextInt();
			if(s>max)
			{
				max=s;
			}
			}
			catch(NoSuchElementException e)
			{
				if(max==Integer.MIN_VALUE)
				{
				 System.out.println("there are no elements");
				}
				else
				{
					System.out.println("the max is "+max);
				}
break;
			}
}
							
}
		catch(Exception e)
		{
		System.out.println(e);
		}
	}
}












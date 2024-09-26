 import java.util.Scanner; 
 public class VendingMachine 
{ 
	public static void main(String[] args)
	 { 
		Scanner sc = new Scanner(System.in); 
		int g=0,ch=0,p=0,j=0;
		boolean running = true; 
		do{ 
			System.out.println("Select an option: [1] Get gum  [2] Get chocolate [3] Get popcorn [4] Get juice [5] Display total sold so far [6] Quit"); 
			int choice = sc.nextInt(); 
			switch (choice) 
			{ 
				case 1: g++; 
					System.out.println("Here is your gum");
 					break; 
				case 2: ch++;
 					System.out.println("Here is your chocolate"); 
					break; 
				case 3: p++; 
					System.out.println("Here is your popcorn"); 
					break; 
				case 4: j++; 
					System.out.println("Here is your juice"); 
					break; 
				case 5: 
					System.out.println(g+" items of gum sold "+ch + " items of chocolate sold "+p + " items of popcorn sold "+j+" items of juice sold"); 
					break; 
				case 6: running = false;
					System.out.println("Quitting the program..."); 
					break; 
				default: System.out.println("Error"); 
			} 
		} while (running) ; 
   	} 
} 

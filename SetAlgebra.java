import java.util.Scanner;

public class SetAlgebra {        // This is main class for the program where the calling to the set.java happens
	
	public static void main(String[] args){
		
		Set x = new Set();
		x.command();
		int selection;
		Scanner input = new Scanner (System.in);
		System.out.println("Please enter the number of the command ");
		selection = input.nextInt();
		while (selection < 6 ){
		switch (selection){            // This is a switch statement method this is the easiest way to do this program. it take each case
			case 1:						// and breaks it down and executes a different case for each case 
				Set a = new Set();
				a.Create();
				break;
			case 2:
				System.out.println("");
				System.out.println("The Names of the sets that you have created so far are: ");
				System.out.println(Set.namearray);
				System.out.println("");
				break;
			case 3:
				System.out.println("what is the name of the set you want to print");
				Set b = new Set();
				b.printSet();
				break;
			case 4:
				Set c = new Set();
				c.union();
				break;
			case 5:
				Set d = new Set();
				d.intersection();
				break;
			case 6:
				Set e = new Set();
				e.subtraction();
				break;
			
		}
		Set a = new Set();
		a.command();
		System.out.println("Please enter the number of the command ");
		selection = input.nextInt();
		
		}
		switch(selection){			// this case ends the process of everything
		case 7:
			System.out.println("Exit");
			break;
		}
		
	}
	
	
	
}
	

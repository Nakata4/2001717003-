package project;

import java.util.Scanner;

public class Ticket {
	double horror;
	double comedy;
	double fantasy;
	double action;

public void getInput(){
	       Scanner userInput = new Scanner(System.in);
	       String bulkString;
	       System.out.println("horror , comedy , fantasy , action");
	       bulkString= userInput.nextLine();
	       userInput.close();
	       bulkString.trim();

	       String[] values = new String[3];
	       values = bulkString.split(" ");
	       
	      horror = (double)Integer.parseInt(values[0]); 
	      comedy = (double)Integer.parseInt(values[1]);
	      fantasy = (double)Integer.parseInt(values[2]); 
	      action = (double)Integer.parseInt(values[3]);
	}
/**
 *
 */
	
	public void Choose(){{		
		if (horror == 1)
		if (comedy == 2)
		if (fantasy == 3)
		if (action == 4);		
		}

		{
			System.out.println(" Please enter a valid value.");		
	}
		/**
		 * end of print()
		 */
}
	
}

package nesneyonemlianaliz2;

import java.util.Scanner;

public class TusTakimi implements ITusTakimi {

	 Scanner scanner=new Scanner(System.in);
	    @Override
	    public String stringVeriAl() {
	        return scanner.nextLine();
	    }
	    
	    public int intVeriAl()
	    {
	    	 return scanner.nextInt();
	    }
	
	
}

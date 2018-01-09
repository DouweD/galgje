
import java.util.Scanner;

public class Galgje {

	public static void main(String[] args) {
		System.out.println("Welkom bij galgje!");
		System.out.println("Het te raden woord: ");

		String teRadenWoord = "Boot";
		int aantalBeurten = 20;
		
		System.out.println(teRadenWoord);
		Scanner sc = new Scanner(System.in);
	    
	    for(int i = 0; i < aantalBeurten; i++) {
	    	
	    	String str = sc.nextLine();
	    
		    if(teRadenWoord.contains(str)) {
		    	System.out.println("Yes, deze letter zit erin!");
		    } else {
		    	System.out.println("Helaas, probeer het nog eens..");
		    }
		    
		    System.out.println("Het spel is klaar.");

	    }
	     
	}

}

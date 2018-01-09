
import java.util.Scanner;

public class Galgje {
	public static String teRadenWoord = "Water"; //static = class variable, niet static = instance variable
	public static void main(String[] args) {
		System.out.println("Welkom bij galgje!");
		System.out.println("Het te raden woord: ");
		
		int aantalBeurten = 20;
		
		System.out.println(teRadenWoord);
		Scanner sc = new Scanner(System.in);
	    for(int i = 0; i < aantalBeurten; i++) {
	    	String str = sc.nextLine();
	    	checkenOfLetterBestaat(str);
	    	
	    	/*
		    if(teRadenWoord.contains(str)) {
		    	System.out.println("Yes, deze letter zit erin!");
		    } else {
		    	System.out.println("Helaas, probeer het nog eens..");
		    }
		    
		    System.out.println("Het spel is klaar.");
			*/
	    }
	}
	    public static void checkenOfLetterBestaat(String str) {
	    	if(teRadenWoord.contains(str)) {
		    	System.out.println("Yes, deze letter zit erin!");
		    } else {
		    	System.out.println("Helaas, probeer het nog eens..");
		    }
		    
		    System.out.println("Het spel is klaar.");
	    }

}

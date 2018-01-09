
import java.util.Scanner;

public class Galgje {

	public static void main(String[] args) {
		System.out.println("Welkom bij galgje!");
		System.out.println("Het te raden woord: ");

		String teRadenWoord = "Boot";
		
		System.out.println(teRadenWoord);
		Scanner sc = new Scanner(System.in);
	    String str = sc.nextLine();
	    System.out.println(str);	    
	    
	    if(teRadenWoord.contains(str)) {
	    	System.out.println("ja");
	    } else {
	    	System.out.println("nee");
	    }
	    
	    System.out.println("Het spel is klaar.");
	}

}

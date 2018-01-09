
import java.util.Scanner;

public class Galgje {
	public static String teRadenWoord = "Water"; //static = class variable, niet static = instance variable
	public static StringBuilder sb = new StringBuilder("*****");
	public static void main(String[] args) {
		System.out.println("Welkom bij galgje!");
		System.out.println("Het te raden woord: ");
		
		int aantalBeurten = 20;
		
		System.out.println(teRadenWoord);
		Scanner sc = new Scanner(System.in);
	    for(int i = 0; i < aantalBeurten; i++) {
	    	String str = sc.nextLine();
	    	checkenOfLetterBestaat(str);
	    }
	}
	
	public static void checkenOfLetterBestaat(String str) {
		int positie = teRadenWoord.indexOf(str);
	    if(teRadenWoord.contains(str)) {
			System.out.println("Yes, deze letter zit erin! " + teRadenWoord.indexOf(str));
			} else {
		   	System.out.println("Helaas, probeer het nog eens..");
		}
		    
		    System.out.println("Het spel is klaar.");
		    sb.replace(positie, positie+1, str);
		    System.out.println(sb);
	}
	
	
	    
	    
	    
	    /*
	    public static void woordPrinten(String hetWoord, char[] ingevoerdeLetters) {
	    	//boolean woordGeprint = false;
	    	
	    	for(int a = 0; a < hetWoord.length(); a++) {
	    		
	    	}
	    }
		*/
}


/*
public static boolean printWord(String word, char[] enteredLetters) {
    // Iterate through all letters in word
    boolean asteriskPrinted = false;
    for (int i = 0; i < word.length(); i++) {
        char letter = word.charAt(i);
        // Check if letter already have been entered bu user before
        if (inEnteredLetters(letter, enteredLetters))
            System.out.print(letter); // If yes - print it
        else {
            System.out.print('*');
            asteriskPrinted = true;
        }
    }

*/
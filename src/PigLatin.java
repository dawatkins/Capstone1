import java.util.Scanner;

public class PigLatin {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		String userInput;
		String repeat;

		Title();

		do {
			System.out.println("Enter a word:");
			userInput = scnr.nextLine();

			
			Translator(userInput);
			
			System.out.println();
			System.out.println("Translate again? (y/n):");
			repeat = scnr.nextLine();
			repeat = repeat.toLowerCase();
		} while (repeat.equals("y"));

		System.out.println("Goodbye!");
		scnr.close();
	}

	private static void Title() {
		System.out.println("Welcome to the Pig Latin Transltor!");
	}

	private static void Translator(String s) {
		if (s.startsWith("a") || s.startsWith("e") || s.startsWith("i") || s.startsWith("o") || s.startsWith("u")) {
			s = s.concat("way");
			System.out.print(s);
		} else {
			System.out.print(constants(s) + " ");
		}
		
	}
	
	private static String constants(String word) {
	    char a = 'a';
	    char e = 'e';
	    char i = 'i';
	    char o = 'o';
	    char u = 'u';

	    int start = 0;
	    int firstVowel = 0;
	    int end = word.length();
	    for(int j = 0; j < end; j++) {
	        char c = word.charAt(j);
	    		
	        if(Character.toLowerCase(c) == a || Character.toLowerCase(c)  == e || Character.toLowerCase(c)  == i || Character.toLowerCase(c)  == o || Character.toLowerCase(c)  == u) {
	            firstVowel = j;
	            break;
	        }
	    }
	    if(start != firstVowel) {
	        String startString = word.substring(firstVowel, end);
	        String endString = word.substring(start, firstVowel) + "ay";
	        return startString+endString;
	    }
	    return word;
	}
	
}//class ending

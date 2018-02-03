/**
 * 
 */
package morse_code_translator;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author Kia Alderson
 *
 */
public class morse_code_translator {

	/**
	 * Class to translate given alpha/numerical strings into Morse code
	 */
	public static void main(String[] args) {
		System.out.println("MORSE CODE TRANSLATOR (a-z, A-Z, 0-9 and symbols)");
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a string to be translated: ");
		String alpha_string = scanner.next();
		scanner.close();
		
		translator(alpha_string);
	}
	
	
	public static void translator(String alpha){
		//Set up receiving variable
		String translated = "";
		
		//Alphabet in Morse
		String morse_alpha[] = new String[] {".-  ", "-...  ", "-.-.  ", "-..  ", ".  ","..-.  ", 
		         					   "--.  ", "....  ", "..  ", ".---  ", "-.-  ", ".-..  ", 
		         					   "--  ", "-.  ", "---  ", ".--.  ", "--.-  ", ".-.  ", 
		         					   "...  ", "-  ", "..-  ", "...-  ", ".--  ", "-..-  ", 
		         					   "-.--  ", "--..  "};
		
		//Numbers in Morse
		String morse_num[] = new String[] {"-----  ", ".----  ", "..---  ", "...--  ", "....-  ", ".....  ", 
										   "-....  ", "--...  ", "---..  ", "----.  "};
		
		for(int i = 0; i < alpha.length(); i++){
			// Character to_check = new Character(alpha.charAt(i));
			
			if (Character.isDigit(alpha.charAt(i))){
				//Is a digit 0-9
				char digit = (char) Character.getNumericValue(alpha.charAt(i));
				
				translated += morse_num[digit];
				
			} else if (Character.isLetter(alpha.charAt(i))){
				//Is a character a-z, A-Z
				Character letter = Character.toLowerCase(alpha.charAt(i));
				
				int ascii = (int) letter;
				translated += morse_alpha[ascii - 97];
				
				
			} else {
				//Is a symbol
				String symbol = alpha.substring(i, i+1);
				translated += symbol;
			}
			
		}
		
		
		System.out.println(translated);
	}





}

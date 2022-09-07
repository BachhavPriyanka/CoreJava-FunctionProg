package day5;
import java.util.*;
public class VowelOrConsonent {
	public static void main(String args[]){

	        Scanner sc = new Scanner(System.in);
	        System.out.println("Enter a alphabet:");
	        char character = sc.next().charAt(0);

	        switch (character){
	        	case 'a': System.out.println(character + " Alphabet is Vowel");
	        				break;
	            case 'e': System.out.println(character + " Alphabet is Vowel");
	            			break;
	            case 'i': System.out.println(character + " Alphabet is Vowel");
                			break;
	            case 'o': System.out.println(character + " Alphabet is Vowel");
	            			break;
	            case 'u': System.out.println(character + " Alphabet is Vowel");
                			break;
	            default: System.out.println(character + " Alphabet is Consonant");
	            			break;
	        }
	    }

}

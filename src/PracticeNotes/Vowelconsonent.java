package PracticeNotes;

import java.util.Scanner;

public class Vowelconsonent {
public static void main(String[] args) {
	Scanner s = new Scanner (System.in);
	
	System.out.println("enter the character");
	
	char c = (s.next().charAt(0));
	switch (c>='A' && c<='Z'?(char) (c+32) : c)
	{
	case 'a': System.out.println("vowel");
	break;
	
	case 'e': System.out.println("vowel");
	break;

	case 'i': System.out.println("vowel");
	break;
	
	case 'o': System.out.println("vowel");
	break;
	
	case 'u': System.out.println("vowel");
	break;
	
	default: System.out.println("consonant");
	break;
	}
}
}

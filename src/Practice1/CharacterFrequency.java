package Practice1;

public class CharacterFrequency {
public static void main(String[] args) {
	
	String str = "hello world";
	char targetChar = 'l';
	int frequency = 0;
	
	for(int i = 0;i <str.length();i++) {
		if(str.charAt(i)==targetChar) {
			frequency++;
		}
	}
	System.out.println("the character " + targetChar+" occurs" + frequency+" times.");
	
}
}

package Practice1;

public class String2 {
public static void main(String[] args) {
	
	String s1 = "Malayalam";
	String s = s1.toLowerCase();
	String rev="";
	
	for (int i = s.length()-1; i>=0;i--)
	{
		char c = s.charAt(i);
		rev += c;
	
	}
	System.out.println(rev);
	
	if (s.equals(rev)) {
		System.out.println(" Palindrome");
}
	else {
		System.out.println(" not palindrome");
	}
	}
}

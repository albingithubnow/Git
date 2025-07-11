package Practice1;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {

		String s1 = "listen";
		String s2 = "listen";
		if(s1.length()==s2.length())
		{
			char ch1[] = s1.toCharArray();
			char ch2[] = s2.toCharArray();
			
			Arrays.sort(ch1);
			Arrays.sort(ch2);
			boolean rs = Arrays.equals(ch1, ch2);
			if(rs == true);
			{
				System.out.println("given Strings are anagram");
			}
			
		}
		else
		{
			System.out.println("given strings are not anagrams");
		}
	}

}

package Practice1;

public class String1 {

	public static void main(String[] args) {

	String s = "A3J2C4";
	int sum=0;
	String cha="";
	
	char[] ch = s.toCharArray();
	
	for(int i = ch.length-1; i>=0;i--) {
		if(ch[i] <='Z' && ch[i] >='A' ) {
			cha += ch[i];
		} else {
			sum += ch[i]-'0';
			
		}
	}
	System.out.println("The Characters : " +cha);
	System.out.println("The addition of numbers: "+sum);
		
		
	}

}

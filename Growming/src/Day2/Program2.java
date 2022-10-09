package Day2;

import java.util.Scanner;

// Program 2 to check weather String Palindrom or not
// palindrome mean after reverse string reamain same 
//ex: madam 
//madam
public class Program2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Enter The String");
		
		String s1 =sc.next();
		
		String s2="";
		
		for (int i=s1.length()-1;i>=0;i--) {
			
			 s2 =s2+s1.charAt(i);
			
		}
		//String s1 = "Rakesh";
		System.out.println(s2);
		System.out.println(s1.equals(s2));
		
	}
}

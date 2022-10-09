import java.util.Iterator;
import java.util.Scanner;

// find wovels in string
public class Program5 {

	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
				
		System.out.println("Enter The String");
		
		String s1 =sc.nextLine();
		System.out.println("Entered String is:=>"+s1);
		
		s1=s1.toLowerCase();
		
		System.out.println("After Converting To LowerCase:=>"+s1);
		
		int count =0;
		
		for (int i = 0; i < s1.length(); i++) {
			
			if (s1.charAt(i)=='a'||s1.charAt(i)=='e'||s1.charAt(i)=='i'||s1.charAt(i)=='o'||s1.charAt(i)=='u')
			{
				count++;
			}
			
				
		}
		System.out.println("Total Number Of Vowel: "+count);
	}
}

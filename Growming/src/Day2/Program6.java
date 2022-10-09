package Day2;

import java.util.Scanner;

public class Program6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
				
		System.out.println("Enter The String");
		
		String s1 =sc.nextLine();
		System.out.println("Entered String is:=>"+s1);
		
		s1=s1.toLowerCase();
		
		System.out.println("After Converting To LowerCase:=>"+s1);
		
		int ccount =0,vcount = 0;
		int scount=0;
		
		for (int i = 0; i < s1.length(); i++) {
			
			if (s1.charAt(i)=='a'||s1.charAt(i)=='e'||s1.charAt(i)=='i'||s1.charAt(i)=='o'||s1.charAt(i)=='u')
			{
				ccount++;
			}
			else if(s1.charAt(i)!=' ')
			{
				vcount++;
			}
			else if(s1.charAt(i)==' ')
			{
				scount++;
			}
				
		}
		System.out.println("Total Number Of Vowel:" +ccount);
		System.out.println("Total Consonant      :" +vcount);
		System.out.println("Count Of Space       :" +scount);
	}
}

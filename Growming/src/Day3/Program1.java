package Day3;
// Check Frequency of Given Char In String 

import java.util.Scanner;
public class Program1 {
	public static void main(String[] args) 
	{
		
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Enter The String");
				
			String s1=sc.nextLine();
			
			System.out.println("Enter The char You Want Count");
			char ch =sc.next().charAt(0);
			int count=0;
			for (int i = 0; i < s1.length()-1; i++) 
			{
					if(ch ==s1.charAt(i))
					{
						count++;
					}
			}
			System.out.println("The Frequency Of :"+ch+"is :"+count);
			sc.close();
	}
}

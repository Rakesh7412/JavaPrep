package Day3;

import java.util.Iterator;

// Check Frequency of Given Char In String 

import java.util.Scanner;
public class Program1 {
	public static void main(String[] args) 
	{
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Enter The String");
				
			String s1=sc.nextLine();
			
			System.out.println("This Is Char AT Position 1"+s1.charAt(0));
			System.out.println("This Is Char AT Position 2"+s1.charAt(1));
			System.out.println("This Is Char AT Position 3"+s1.charAt(2));
			System.out.println("This Is Char AT Position 4"+s1.charAt(3));
			
			//System.out.println("Enter The char You Want Count");
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
	}
}

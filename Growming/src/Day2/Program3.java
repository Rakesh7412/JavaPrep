package Day2;

import java.util.Scanner;

// Program 3 : String Builder 
public class Program3 {
public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter The String");
	 
	String s1 = sc.next();
	// String Builder is modify 
	// StringBuilder(String str) ===> Constructor
	StringBuilder s= new StringBuilder(s1);
	// reverse () is built in method in StringBuilder class 
	System.out.println("Reversed String is:==> "+s.reverse());
	
	
	
	
	}
}

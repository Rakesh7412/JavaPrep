package Day5;

import java.util.Scanner;

public class Program1 {
		public static void main(String[] args) {
			System.out.println("Enter The String You Want To Split");
			
			Scanner sc = new Scanner(System.in);
			
			String s1=sc.nextLine();
			
			String[] s2=s1.split(" ",1);
			

					
			for (int i = 0; i <= s2.length; i++) {
				
				String s3=s2[i];
				
			System.out.println(s3);
			}
		}
}

package Q2577;

import java.util.Scanner;

public class MyAnswer {

	public static void main(String[] args) {

		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		String n = ""+(a * b * c);
		for (int i = 0; i < 10; i++) {
			int count = 0;
			for (int j = 0; j < n.length(); j++) {
				if(i == Character.getNumericValue(n.charAt(j))) {
					count++;
				}
				
			}
			System.out.println(count);
		}
		
		sc.close();
		
	
	}

}

package Q2869;

import java.util.Scanner;

public class MyAnswer {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		int mount = (c - b) / (a-b);
		
		if( (c - b) % (a - b) != 0 ) {
			mount++;
		}
		
		
		System.out.println(mount);
		sc.close();
	}
}

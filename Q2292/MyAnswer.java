package Q2292;

import java.util.Scanner;

public class MyAnswer {
	
	public static void main(String[] args) {
		// https://www.acmicpc.net/problem/2292
		// 2021-04-13
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int count = 1;
		int range = 2;
		
		if(n == 1) {
			System.out.println(1);
		}else {
			
			while( range <= n ) {
				
				range = range + (6 * count);
				count++;
				
			}
			
			System.out.println(count);
			
		}
		sc.close();
		
		
	}
}

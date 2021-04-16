package Q1193;

import java.util.Scanner;

public class MyAnswer {
	
	public static void main(String[] args) {
		// https://www.acmicpc.net/problem/1193
		// 2021-04-16
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if(n == 1) {
			System.out.println("1/1");
			sc.close();
			return;
		}
		int i = 1;
		int count = 0;
		while(n > i ) {
			
			n -= i;
			
			i++;
			count++;
		}
		int z = 1;
		for (int j = 0; j < n - 1; j++) {
			i--;
			z++;
		}
		
		if(count % 2 == 1) {
			System.out.println(z + "/" + i);
		}else {
			System.out.println(i + "/" + z);
			
		}
		sc.close();
	}
}

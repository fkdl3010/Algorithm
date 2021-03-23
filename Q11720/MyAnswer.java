package Q11720;

import java.util.Scanner;

public class MyAnswer {
	public static void main(String[] args) {
		// https://www.acmicpc.net/problem/11720
		// 2021-03-23
		
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		String numbers = sc.next();
		int n = 0;
		for (int i = 0; i < m; i++) {
			n += Integer.parseInt(numbers.charAt(i)+"");
		}
		System.out.println(n);
		sc.close();
	}
}

package Q2908;

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		// https://www.acmicpc.net/problem/2908
		// 2021-03-31
		// StringBuilder 클래스를 이용한 방법 reverse() 메소드를 제공한다
		
		Scanner in = new Scanner(System.in);
        
		int A = in.nextInt();
		int B = in.nextInt();
        
        in.close();
        
		A = Integer.parseInt(new StringBuilder().append(A).reverse().toString());
		B = Integer.parseInt(new StringBuilder().append(B).reverse().toString());
		
		System.out.print(A > B ? A : B);
	}

}

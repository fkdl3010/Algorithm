package Q2908;

import java.util.Scanner;

public class MyAnswer {

	public static void main(String[] args) {
		// https://www.acmicpc.net/problem/2908
		// 2021-03-31
		
		Scanner sc = new Scanner(System.in);
		String[] s = new String[2];
		s = sc.nextLine().split(" ");
		sc.close();
		int[] reverseNum = new int[2];
		for (int i = 0; i < s.length; i++) {
			String reverse = "";
			for (int j = 0; j < s[i].length(); j++) {
				reverse += s[i].charAt(s[i].length() - (j + 1) ) + "";
			}
			reverseNum[i] = Integer.parseInt(reverse);
		}
		
		System.out.println(reverseNum[0] > reverseNum[1] ? reverseNum[0] : reverseNum[1]);
		
	}

}

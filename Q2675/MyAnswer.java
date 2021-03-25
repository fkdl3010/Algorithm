package Q2675;

import java.io.IOException;
import java.util.Scanner;

public class MyAnswer {

	public static void main(String[] args) throws IOException{
		// https://www.acmicpc.net/problem/2675
		// 2021-03-25
		
		Scanner sc = new Scanner(System.in);
		StringBuffer sb = new StringBuffer();
		int totalRoop = sc.nextInt();
		
		for (int i = 0; i < totalRoop; i++) {
			int sRoop = sc.nextInt();
			String txt = sc.next();
			for (int j = 0; j < txt.length(); j++) {
				for (int j2 = 0; j2 < sRoop; j2++) {
					sb.append(txt.charAt(j));
				}
				
				
			}
			sb.append("\n");
		}
		System.out.println(sb.toString());
		sc.close();
	}

}

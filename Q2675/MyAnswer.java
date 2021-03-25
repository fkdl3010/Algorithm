package Q2675;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class MyAnswer {

	public static void main(String[] args) throws IOException{
		// https://www.acmicpc.net/problem/2675
		// 2021-03-25
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuffer sb = null;
		int totalRoop = br.read() - '0';
		
		for (int i = 0; i < totalRoop; i++) {
			int innerRoop = br.read() - '0';
			String txt = br.readLine();
			sb = new StringBuffer();
			for (int j = 0; j < innerRoop; j++) {
				
				for (int j2 = 0; j2 < txt.length(); j2++) {
					
					for (int k = 0; k < innerRoop; k++) {
						
						sb.append(txt.charAt(j2));
						
					}
					
				}
			}
			System.out.println(sb);
		}

	}

}

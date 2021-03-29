package Q1152;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MyAnswer {

	public static void main(String[] args) throws IOException{
		// https://www.acmicpc.net/problem/1152
		// 2021-03-29
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		
		String[] arrayS = s.trim().split(" ");
		int count = 0;
		for (int i = 0; i < arrayS.length; i++) {
			count++;
		}
		
		if (s.equals(" ")) {
			count = 0;
		}
		System.out.println(count);
	}

}

package Q5622;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MyAnswer {
	
	public static void main(String[] args) throws IOException{
		//https://www.acmicpc.net/problem/5622
		// 2021-04-01
		
		String[] alpa = {"ABC","DEF","GHI","JKL","MNO","PQRS","TUV","WXYZ"};
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String read = br.readLine();
		int answer = 0;
		for (int i = 0; i < read.length(); i++) {
			for (int j = 0; j < alpa.length; j++) {
				if(alpa[j].indexOf(read.charAt(i)) >= 0) {
					answer += j + 3;
				};
			}
		}
		System.out.println(answer);
	}
}

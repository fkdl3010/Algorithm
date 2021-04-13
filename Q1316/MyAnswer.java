package Q1316;

import java.io.BufferedReader;
import java.io.InputStreamReader;


public class MyAnswer {

	public static void main(String[] args) throws Exception{
		// https://www.acmicpc.net/problem/1316
		// 2021-04-08
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int count = 0;
		String[] s = new String[n];
		for(int i = 0; i < n; i++) {
			s[i] = br.readLine().trim();
		}
		
		
		for(int i = 0; i < n; i++) {
			boolean isPass = true;
			for (int j = 0; j < s[i].length(); j++) {
				
				if(s[i].length() == 1) {
					isPass = true;
					break;
				}
				
				char ch = s[i].charAt(j);
				
				int start = s[i].indexOf(ch + "");
				int last = s[i].lastIndexOf(ch + "");
				
				for (int k = start; k <= last; k++) {
					if(s[i].charAt(k) != ch) {
						isPass = false;
						break;
					}
					if(start == last) {
						if(!isPass) {
							break;
						}else {
							isPass = true;
							
						}
						break;
						
					}else if(last - start == 1){
						if(!isPass) {
							break;
						}else {
							isPass = true;
							
						}
						break;
					}
					//isPass = true;
				}
				
			}
			if(isPass) {
				count++;
			}
		}
		System.out.println(count);
		
		
		
		
	}

}

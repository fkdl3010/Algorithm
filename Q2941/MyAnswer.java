package Q2941;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class MyAnswer {
		public static void main(String[] args) throws Exception{
			
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			
			String target = br.readLine();
			int count = 0;
			char ch = ' ';
			for(int i = 0; i < target.length(); i++) {
				
				ch = target.charAt(i);
				
				if(ch == 'c') {
					
					
					if(i < target.length() - 1) {
						
						if(target.charAt(i + 1) == '=') {
							i++;
						}
						else if(target.charAt(i + 1) == '-') {
							i++;
						}
					}
					
				}
				 
				if(ch == 'd') {
					if(i < target.length() - 1) {
						
						if(target.charAt(i + 1) == 'z') {
							
							if(i < target.length() - 2) {
								
								if(target.charAt(i + 2) == '=') {
									
									i += 2;
								} 
							}
						}
						else if(target.charAt(i + 1) == '-') {
							i++;
						}
					}
					
				}
				
				if(ch == 'l') {
					
					
					if(i < target.length() - 1) {
						
						if(target.charAt(i + 1) == 'j') {
							i++;
						}
						
					}
					
				}
				
				if(ch == 'n') {
					
					
					if(i < target.length() - 1) {
						
						if(target.charAt(i + 1) == 'j') {
							i++;
						}
						
					}
					
				}
				
				if(ch == 's') {
					
					
					if(i < target.length() - 1) {
						
						if(target.charAt(i + 1) == '=') {
							i++;
						}
						
					}
					
				}
				
				if(ch == 'z') {
					
					
					if(i < target.length() - 1) {
						
						if(target.charAt(i + 1) == '=') {
							i++;
						}
						
					}
					
				}
				count++;
			}
			
			System.out.println(count);
			
		}
}

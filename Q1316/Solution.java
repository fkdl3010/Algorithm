package Q1316;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
 
public class Solution {
	
	// https://www.acmicpc.net/problem/1316
	// 2021-04-08
	
	/*
	 * 솔루션 설명
	 * 알파벳은 26개이므로 boolean타입으로 길이 26의 배열을 사용한다.
	 * 단어를 한글자씩 쪼개 이전 글자와 현재글자를 비교한다.
	 * 이전글자와 현재글자가 같다면? prev 값에 현재값을 넣어주고 다음 글자를 비교한다.
	 * 이전글자와 다르다면 ? boolean 배열에 해당 글자(알파벳) 인덱스 값이
	 *  바뀌었는지 비교한다. ( 비교 글자가 처음 진입한 글자면 boolean 배열에서 해당 글자 인덱스를 true로 바꿔줌)
	 * 현재 글자가 boolean 배열에 인덱스 값이 true 라면 ?
	 * 이전에 나왔던 글자이므로 false를 반환한다. 즉 그룹단어가 아님.
	 */
	
	
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 
	public static void main(String[] args) throws IOException {
 
		int count = 0;
		int N = Integer.parseInt(br.readLine());
 
		for (int i = 0; i < N; i++) {
			if (check()) {
				count++;
			}
		}
		System.out.print(count);
	}
 
	public static boolean check() throws IOException {
		boolean[] check = new boolean[26];
		int prev = 0;
		String str = br.readLine();
		
		for(int i = 0; i < str.length(); i++) {
			int now = str.charAt(i);
			
			
			if (prev != now) {		
				if (!check[now - 'a']) {
					check[now - 'a'] = true;
					prev = now;	
				}
				else {
					return false;	
				}
			}
		}    
		return true;
	}
}
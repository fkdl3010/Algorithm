package Q1157;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class MyAnswer {

	public static void main(String[] args) throws IOException{
		// https://www.acmicpc.net/problem/1157
		// 2021-03-26
		long before = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String target = br.readLine().toLowerCase();
		// 중복제거를 위해 set을 사용
		Set<String> eachString = new LinkedHashSet<String>();
		Iterator<String> itr = null;
		String[] tempString = null;
		int[] eachNum = null;
		int num = 0;
		int count = 0;
		int max = 0;
		String answer = "";
		
		// 입력받은 문자열의 길이만큼 루프를 돌며 set에 저장
		for (int i = 0; i < target.length(); i++) {
			eachString.add(target.charAt(i) + "");
		}
		
		// 각 문자의 반복 수를 체크하기 위해 set 길이의 int 배열 선언
		eachNum = new int[eachString.size()];
		// int배열의 최대값 인덱스와 매칭시키기 위한 String 배열
		tempString = new String[eachString.size()];
		itr = eachString.iterator();
		
		while(itr.hasNext()) {
			num = 0;
			String temp = itr.next();
			tempString[count] = temp; 
			for (int i = 0; i < target.length(); i++) {
				if(temp.equals(target.charAt(i) + "")) {
					num++;
				}
			}
			eachNum[count++] = num;
		}
		// max 값을 구해줌
		for (int i = 0; i < eachNum.length; i++) {
			
			if (max < eachNum[i]) {
				max = eachNum[i];
			}
			
		}
		count = 0;
		for (int i = 0; i < eachNum.length; i++) {
			// 최대값의 index를 구함
			if(max == eachNum[i]) {
				count++;
				max = i;
			}
			// 최대값이 2개 이상이면 답에 ?를 넣어줌
			if(count > 1) {
				answer = "?";
				break;
			}
		}
		br.close();
		System.out.println(answer == "" ? tempString[max].toUpperCase() : answer);
		System.gc();

		// 실행 후 메모리 사용량 조회
				long after  = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
				
				// 메모리 사용량 측정
				long usedMemory = (before - after)/1024/1024;

				System.out.println("Used Memory : " + usedMemory);
	}

}

package Q1065;

import java.util.ArrayList;
import java.util.Scanner;

public class MyAnswer {
	
	public static int d(int num) {
		int count = 0;
		if(num == 1) {
			count++;
			return count;
		}
		if(num == 1000) {
			count--;
		}
		for (int i = 1; i <= num; i++) {
			ArrayList<Integer> result = new ArrayList<Integer>();
			boolean isEquars = false;
			if(i < 100) {
				count++;
			}else {
				String tempString = i + "";
				int[] tempNum = new int[tempString.length()];
				for (int j = 0; j < tempNum.length; j++) {
					tempNum[j] = tempString.charAt(j) - '0';
				}
				for (int j = 0; j < tempNum.length - 1; j++) {
					result.add(tempNum[j + 1] - tempNum[j]);
				}
				for (int j = 0; j < result.size() - 1; j++) {
					if(result.get(j) == result.get(j + 1)) {
						isEquars = true;
					}
				}
				
				
				if(isEquars) {
					count++;
				}
			}
		}
		return count;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println(d(sc.nextInt()));
		sc.close();
	}
}

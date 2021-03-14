package Q3052;

import java.util.HashSet;
import java.util.Scanner;

public class MyAnswer {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		HashSet<Integer> answer = new HashSet<>();		
		for (int i = 0; i < 10; i++) {
			answer.add(sc.nextInt() % 42);
			
		}
		sc.close();
		System.out.println(answer.size());

	}
}

package Q1546;

import java.util.Scanner;

public class MyAnswer {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		double[] temp = new double[n];
		double max = 0;
		double total = 0;
		for (int i = 0; i < n; i++) {
			temp[i] = sc.nextInt();
		}
		sc.close();
		for (int i = 0; i < temp.length; i++) {
			if(temp[i] > max) {
				max = temp[i];
			}
		}
		
		for (int i = 0; i < temp.length; i++) {
			temp[i] = temp[i]/max*100;
			total += temp[i];
		}
		
		System.out.println(total/n);
	}
}

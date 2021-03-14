package Q4344;

import java.util.Scanner;

public class MyAnswer {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			double m = 0;
			double[] temp = new double[sc.nextInt()];
			double count = 0;
			for (int j = 0; j < temp.length; j++) {
				
				temp[j] = sc.nextDouble();
				m += temp[j];
			}
			
			for (int j = 0; j < temp.length; j++) {
				if(temp[j] > m/temp.length) {
					count++;
				}
			}
			System.out.printf("%.3f", count * 100 / temp.length);
            System.out.println("%");
		}
		
		sc.close();
		
	}
}

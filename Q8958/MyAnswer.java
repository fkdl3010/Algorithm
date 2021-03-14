package Q8958;

import java.util.ArrayList;
import java.util.Scanner;

public class MyAnswer {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		ArrayList<String> list = new ArrayList<String>();
		int n = sc.nextInt();
		
		for (int i = 0; i < n; i++) {
			
			list.add(sc.next());
		}
		sc.close();
		for(String temp: list) {
			int m = 0;
			int house = 0;
			for (int i = 0; i < temp.length(); i++) {
				if(temp.charAt(i) == 'O') {
					house++;
					m += house;
				}else {
					house = 0;
				}
			}
			
			System.out.println(m);
		}
		
	}

}

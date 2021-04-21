package Q10250;

import java.util.Scanner;

public class MyAnswer {

	public static void main(String[] args) {
		
		// https://www.acmicpc.net/problem/10250
		// 2021-04-21

		Scanner sc = new Scanner(System.in);

		int roop = sc.nextInt();
		int h[] = new int[roop];
		int w[] = new int[roop];
		int guest[] = new int[roop];
		for (int i = 0; i < roop; i++) {
			h[i] = sc.nextInt();
			w[i] = sc.nextInt();
			guest[i] = sc.nextInt();
		}
		sc.close();
		for (int i = 0; i < roop; i++) {



			int wCoord = guest[i] / h[i];
			int hCoord = guest[i] % h[i];

			if(hCoord == 0){
				// 나머지가 0 으로 떨어질 경우 해당 guest는 꼭대기층에 위치
				hCoord = h[i];
				// 나머지가 0 으로 떨어질 경우 해당 guest는 꼭대기층에 위치하여 옆 호수로 이동하지 않음
				wCoord = wCoord - 1;
			}

			System.out.println(hCoord + "" + (String.valueOf(wCoord+ 1).length() < 2 ? ("0" + (wCoord + 1) ) : wCoord + 1));

		}


	}
}

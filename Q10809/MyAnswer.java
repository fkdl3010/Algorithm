package Q10809;

import java.util.Scanner;

public class MyAnswer {

	public static void main(String[] args) {
		// https://www.acmicpc.net/problem/10809
		
		Scanner sc = new Scanner(System.in);
		String[] alpa = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p"
							,"q","r","s","t","u","v","w","x","y","z"};
		
		String target = sc.next();
		String answer = "";
		for(int i = 0; i < alpa.length; i++) {
			for (int j = 0; j < target.length(); j++) {
				if(target.charAt(j) + "" == alpa[i]) {
					answer += " " + target.indexOf(alpa[i]);
					System.out.println(target.indexOf(alpa[i]));
				}else {
					answer += "-1";
				}
			}
		}
		sc.close();
	}

}

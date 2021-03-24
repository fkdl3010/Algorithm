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
			boolean check = false;
			for (int j = 0; j < target.length(); j++) {
				if((target.charAt(j) + "").equals(alpa[i]) ) {
					answer += " " + target.indexOf(alpa[i]);
					check = true;
					break;
				}
			}
			if(!check) {
				answer += " -1";
			}
		}
		System.out.println(answer);
		sc.close();
	}

}

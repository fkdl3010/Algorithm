import java.util.Scanner;

public class Q2562 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[] n = new int[9];
		int max = 0;
		int index = 0;
		
		
		for (int i = 0; i < n.length; i++) {
			n[i] = sc.nextInt();
		}
		
		for (int i = 0; i < n.length; i++) {
			if(n[i] > max) {
				max = n[i];
				index = i+1;
			}
		}
		
		System.out.println(max + "\n" + index);
		sc.close();
		
		
	}
}

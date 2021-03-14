package Q15596;

public class Test {

	public long sum(int[] a) {
		int answer = 0;
		
		for (int i = 0; i < a.length; i++) {
			answer += a[i];
		}
		
		return answer;
	}
}

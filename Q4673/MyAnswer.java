package Q4673;

public class MyAnswer {

	public static int d(int number) {
		
		int sum = number;
		while(number != 0) {
			sum += number%10;
			
			number = number/10;
		}
		return sum;
	}
	
	public static void main(String[] args) {
		
		boolean[] isSelfNum = new boolean[10001];
		
		for (int i = 1; i < isSelfNum.length; i++) {
			
			// 1부터 10000까지 숫자를 넣어봤을 때 리턴되는 값은 생성자가 있는 값이므로
			// 셀프넘버가 아니다. 셀프넘버가 아닌값들은 true를 줘서 걸러낸다.
			int n = d(i);
			
			if(n < 10001) {
				isSelfNum[n] = true;
			}
		}
		
		for (int i = 1; i < isSelfNum.length; i++) {
			if(!isSelfNum[i]) {
				System.out.println(i);
			}
		}
		
	}
}

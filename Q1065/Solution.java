package Q1065;

public class Solution {
	
	
	public static int solution(int num) {
		
		int cnt = 0; // 함수 카운트
		
		if(num < 100) {
			return num; // 1 ~ 100 은 어차피 그 수 그대로 등차수열 개수임
		}else {
			
			cnt = 99; // 카운트 초기화
			
			if(num == 1000) { // 1000까지 이므로 1000 예외처리
				num = 999;
				
			}
			
			for(int i = 100; i <= num; i++) {
				int hun = i / 100; // 백의 자리수
				int ten = (i / 10) % 10; // 십의 자리수
				int one = i % 10;
				
				if( (hun - ten) == (ten - one) ) {
					cnt++;
				}
			}
			
		}
		
		return cnt;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(solution(1000));
	}

}

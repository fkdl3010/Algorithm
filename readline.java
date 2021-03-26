import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class readline {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		
//		Scanner sc = new Scanner(System.in);
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		
//		String scanner = sc.next();
//		String buffer = br.readLine();
//		
//		System.out.println("scanner:" + scanner);
//		System.out.println("buffer: " + buffer);
//		sc.close();
		
		Scanner s = new Scanner("우리나라\n대한민국\n");
		String str = null;


		str = s.next();
		System.out.println("출력:"+str); 
		str = s.nextLine();
		System.out.println("출력:"+str);


		str = s.nextLine();
		System.out.println("출력:"+str);
	}

}

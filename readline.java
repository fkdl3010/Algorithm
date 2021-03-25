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
		
		Scanner s = new Scanner("\n\n\n가나다\n\n라\n\n");
		String str = null;
		while(s.hasNext()){
			str = s.next();
			System.out.println("출력:"+str);
			}
	}

}

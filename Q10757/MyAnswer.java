package Q10757;

import java.math.BigInteger;
import java.util.Scanner;

public class MyAnswer {
    public static void main(String[] args) {
        // https://www.acmicpc.net/problem/10757
        // 2021-04-28

        Scanner sc = new Scanner(System.in);
        BigInteger a = sc.nextBigInteger();
        BigInteger b = sc.nextBigInteger();
        sc.close();
        
//        int d = sc.nextInt();

        System.out.println(a.add(b));
    }
}

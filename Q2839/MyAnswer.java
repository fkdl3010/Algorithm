package Q2839;

import java.util.Scanner;

public class MyAnswer {
    public static void main(String[] args) {
        // https://www.acmicpc.net/problem/2839
        // 2021-04-26

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int bout = 0;
        int fiveN = 0;
        int threeN = 0;

        while (n > 0){
            if (n > 5) {
                n = n % 5;
                bout = n / 5;
                fiveN+= bout;
            }

            if(n > 3){
                
            }

        }


    }
}

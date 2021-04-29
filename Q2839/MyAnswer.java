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

        if( n % 5 == 0){
            System.out.println(n/5);
            return;
        }

        while (n != 0){
            n = n - 3;
            bout++;
            if( n < 0 ){
                bout = -1;
                break;
            }
            if( n % 5 == 0){
                bout += n / 5;
                break;
            }else{
                continue;
            }
        }
        System.out.println(bout);



    }
}

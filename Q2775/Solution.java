package Q2775;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        // https://www.acmicpc.net/problem/2775
        // 2021-04-22
        int[][] Apt = new int[15][15];
        for (int i = 0; i < Apt.length; i++) {
            // i층 1호는 1로 고정
            Apt[i][1] = 1;
            Apt[0][i] = i;
        }

        for (int i = 1; i < Apt.length; i++) {

            for (int j = 1; j < Apt.length; j++) {
                Apt[i][j] = Apt[i][j - 1] + Apt[i-1][j];

            }

        }

        Scanner sc = new Scanner(System.in);

        int roop = sc.nextInt();

        for (int i = 0; i < roop; i++) {
            System.out.println(Apt[sc.nextInt()][sc.nextInt()]);

        }

    }
}

package Q2775;

import java.util.Scanner;

public class MyAnswer {
    public static void main(String[] args) {
        // https://www.acmicpc.net/problem/2775
        // 2021-04-22

        Scanner sc = new Scanner(System.in);

        int roop = sc.nextInt();
        int[] array = new int[roop];
        for (int i = 0; i < roop; i++) {
             int h = sc.nextInt();
             int w = sc.nextInt();

             if(w == 1){
                 array[i] = 1;
                 continue;
             }else if(w == 2){
                 array[i] = h+2;
                 continue;
             }
             int rowCount = 0;
             //
             int mount = 0;
             // 해당 호수 전까지의 합
             int beforeTotal = 0;
            for (int j = 0; j < w; j++) {
                rowCount++;
                mount += rowCount;
            }
            // 층 올라갈때 마다 더해줘야할 수
            int appendCount = mount - w;

            for (int j = 0; j < h; j++) {
                rowCount += appendCount;
                appendCount += w + j;
            }
            array[i] = rowCount;
        }

        for (int i = 0; i < roop; i++) {
            System.out.println(array[i]);

        }
    }
}

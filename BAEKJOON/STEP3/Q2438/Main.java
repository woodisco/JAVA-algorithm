package BAEKJOON.STEP3.Q2438;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 2438번 : 별 찍기 - 1
public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        br.close();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
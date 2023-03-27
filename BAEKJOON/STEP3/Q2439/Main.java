package BAEKJOON.STEP3.Q2439;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;

// 2439번 : 별 찍기 - 2
public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        br.close();

        for (int i = 1; i <= n; i++) {
            for (int k = 1; k <= n-i; k++) {
                bw.write(' ');
            } 
            
            for (int j = 1; j <= i; j++) {
                bw.write('*');
            }
            bw.newLine();
        }
        bw.flush();
		bw.close();
    }
}
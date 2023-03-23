package BAEKJOON.STEP3.Q15552;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

// 15552번 : 빠른 A+B
public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        StringTokenizer st; // StringTokenizer : 특정 문자에 따라 문자열을 나눔
        int a, b;

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            a = Integer.parseInt(st.nextToken()); // nextToken() : 분리된 문자열을 확인 함
            b = Integer.parseInt(st.nextToken());

            bw.write((a + b) + "\n");
        }
        br.close();

        bw.flush(); // flush() : writer 하는 역활
        bw.close();
    }
}
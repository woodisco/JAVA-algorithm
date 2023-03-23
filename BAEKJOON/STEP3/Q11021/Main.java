package BAEKJOON.STEP3.Q11021;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

// 11021번 : A+B - 7
public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        StringTokenizer st; // StringTokenizer : 특정 문자에 따라 문자열을 나눔
        int a, b;

        for (int i = 1; i <= n; i++) {
            st = new StringTokenizer(br.readLine());
            a = Integer.parseInt(st.nextToken()); // nextToken() : 분리된 문자열을 확인 함
            b = Integer.parseInt(st.nextToken());

            bw.write("Case #" + i + ": " + a + " + " + b + " = " + (a + b) + "\n");
        }
        br.close();

        bw.flush(); // flush() : writer 하는 역활
        bw.close();
    }
}
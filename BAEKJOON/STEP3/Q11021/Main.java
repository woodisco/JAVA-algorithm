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
        // 표준 입력(System.in)으로부터 입력을 읽어오기 위해 BufferedReader를 사용
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // BufferedReader로부터 한 줄씩 읽어오기 위해서는 readLine() 메소드를 사용
        int n = Integer.parseInt(br.readLine());
        // readLine() 메소드는 String 타입으로 반환하기 때문에 숫자로 변환해주기 위해 StringTokenizer 클래스를 사용
        StringTokenizer st;
        int a, b;

        for (int i = 1; i <= n; i++) {
            st = new StringTokenizer(br.readLine());
            a = Integer.parseInt(st.nextToken());
            b = Integer.parseInt(st.nextToken());

            bw.write("Case #" + i + ": " + a + " + " + b + " = " + (a + b) + "\n");
        }
        br.close();

        bw.flush(); // flush() : writer 하는 역활
        bw.close();
    }
}
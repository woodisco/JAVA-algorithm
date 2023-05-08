package BAEKJOON.STEP4.Q10811;

import java.io.*;
import java.util.StringTokenizer;
import java.util.Stack;

// 10811번 : 바구니 뒤집기
public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in)); // 문열을 읽음
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); // 문자열을 씀

        // StringTokenizer : 문자열을 분할
        StringTokenizer st = new StringTokenizer(bf.readLine(), " "); // bf를 사용하여 문자열을 읽고 " " 기준으로 분리 

        int N = Integer.parseInt(st.nextToken()); // 5
        int M = Integer.parseInt(st.nextToken()); // 4
        int[] arr = new int[N+1];
        
        for(int i=1; i<=N; i++) {// 12345
            arr[i] = i;
        }


        for(int k=0; k<M; k++) {
            Stack<Integer> stack = new Stack<>(); // Stack은 후입선출(LIFO)의 구조
            st = new StringTokenizer(bf.readLine(), " ");
            int i = Integer.parseInt(st.nextToken()); // 1
            int j = Integer.parseInt(st.nextToken()); // 2
            
            for (int m=i; m<=j; m++) {
                stack.push(arr[m]); // 12
            }    

            for (int m=i; m<=j; m++) {
                arr[m] = stack.pop(); // 21345
            }
        }

        StringBuilder sb = new StringBuilder(); // 문자열을 더는 상황에 사용
        for (int i=1; i<=N; i++) {
            sb.append(arr[i] + " ");
        }

        bw.write(sb.toString() + "\n"); // 만들어진 문자열 출력
        bw.flush();
        bw.close();
        bf.close();
    }
}
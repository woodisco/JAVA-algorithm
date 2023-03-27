package BAEKJOON.STEP4.Q10813;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 10813번 : 공 바꾸기
public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken()); // 5
        int M = Integer.parseInt(st.nextToken()); // 4
		int[] arr = new int[N]; // 출력

		for (int i = 0; i < N; i++) {
			arr[i] = i+1;
		}
		
		for (int i = 0; i < M; i++) {
			st = new StringTokenizer(br.readLine());

			int I = Integer.parseInt(st.nextToken()); // 1
			int J = Integer.parseInt(st.nextToken()); // 2
			
			int tmp = arr[I-1];
			arr[I-1] = arr[J-1];
			arr[J-1] = tmp;
		}
		br.close();

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
    }
}
package BAEKJOON.STEP4.Q2562;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 2562번 : 최댓값
public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 
		int[] arr = new int[9];
		
		for(int i = 0 ; i < 9 ; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
 
		int max = 0;
        int cnt = 0;
        int index = 0;
		
		for(int k : arr) {
            cnt++;
			if(k > max) {
				max = k;
                index = cnt;
			}
		}

        System.out.println(max);
        System.out.println(index);
    }
}
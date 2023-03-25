package BAEKJOON.STEP4.Q10818;

import java.util.Arrays;
import java.util.Scanner;

// 10818번 : 최소, 최대
public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] arr = new int[N];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);
        System.out.print(arr[0] + " " + arr[N - 1]);
    }
}
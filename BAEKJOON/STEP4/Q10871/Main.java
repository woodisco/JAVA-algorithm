package BAEKJOON.STEP4.Q10871;

import java.util.Scanner;

// 10871번 : X보다 작은 수
public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int X = sc.nextInt();

        for (int i = 0; i < N; i++) {
            int A = sc.nextInt();
            if (A < X) {
                System.out.print(A + " ");
            }
        }
    }
}
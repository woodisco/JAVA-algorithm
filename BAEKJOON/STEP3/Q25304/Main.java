package BAEKJOON.STEP3.Q25304;

import java.util.Scanner;

// 25304번 : 영수증
public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        int sum = sc.nextInt(); // 총 가격
        int n = sc.nextInt(); // 상품종류의 수
        int a; // 상품의 가격
        int b; // 상품의 수

        int price = 0;

        for (int i = 1; i <= n; i++) {
            a = sc.nextInt();
            b = sc.nextInt();
            price += a * b;
        }

        if (sum == price) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
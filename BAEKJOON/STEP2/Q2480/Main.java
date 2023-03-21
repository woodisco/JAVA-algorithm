package BAEKJOON.STEP2.Q2480;

import java.util.Scanner;

// 2480번 : 주사위 세개
public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a, b, c;
        
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();

        int money;

        if (a == b && b == c) {
            money = 10000 + (a * 1000);
            System.out.println(money);
        } else if (a == b|| a == c) {
            money = 1000 + (a * 100);
            System.out.println(money);
        } else if (b == c) {
            money = 1000 + (b * 100);
            System.out.println(money);
        } else {
            money = Math.max(Math.max(a, b), c) * 100;
            System.out.println(money);
        }
    }
}
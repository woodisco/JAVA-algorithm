package BAEKJOON.STEP2.Q2525;

import java.util.Scanner;

// 2525번 : 오븐 시계
public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int h, m, c, min;
        
        h = sc.nextInt(); // 시 ex) 13시
        m = sc.nextInt(); // 분 ex) 40분
        c = sc.nextInt(); // 필요한 시간 : 분 ex) 40분

        min = m + c; // ex) 80분

        h += min / 60; // ex) 14시
        m += c - (60 * (min / 60));  // ex) 20분
        if (h > 23) {
            h -= 24;
        }
        System.out.println(h + " " + m); // ex) 14시 20분
    }
}
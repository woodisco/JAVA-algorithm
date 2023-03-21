package BAEKJOON.STEP2.Q2884;

import java.util.Scanner;

// 2884번 : 알람 시계
public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int h, m;
        
        h = sc.nextInt(); // 시
        m = sc.nextInt(); // 분
        
        if (m < 45) {
            h--;
            m = 60 - (45-m);
            if (h < 0) {
                h = 23;
            }
            System.out.println(h + " " + m);
        } else {
            System.out.println(h + " " + (m - 45));
        }    
    }
}
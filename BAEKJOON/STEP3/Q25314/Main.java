package BAEKJOON.STEP3.Q25314;

import java.util.Scanner;

// 25314번 : 코딩은 체육과목 입니다
public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int a = n/4;

        for (int i = 1; i <= a; i++) {
            System.out.print("long" + " ");
        }

        System.out.println("int");
    }
}
package BAEKJOON.STEP2.Q1330;

import java.util.Scanner;

// 1330번 : 두 수 비교하기
public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a, b;
        
        a = sc.nextInt();
        b = sc.nextInt();
        
        if (a > b) {
            System.out.println(">");
        } else if (a < b) {
            System.out.println("<");
        } else if (a == b) {
            System.out.println("==");
        }    
    }
}
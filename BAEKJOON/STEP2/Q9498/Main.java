package BAEKJOON.STEP2.Q9498;

import java.util.Scanner;

// 9498번 : 시험 성적
public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a;
        
        a = sc.nextInt();
        
        if (a >= 90) {
            System.out.println("A");
        } else if (a >= 80) {
            System.out.println("B");
        } else if (a >= 70) {
            System.out.println("C");
        } else if (a >= 60) {
            System.out.println("D");
        } else {
            System.out.println("F");
        }
    }
}
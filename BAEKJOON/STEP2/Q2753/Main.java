package BAEKJOON.STEP2.Q2753;

import java.util.Scanner;

// 2753번 : 윤년
public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a;
        
        a = sc.nextInt();
        
        // System.out.printLn((a%4 == 0) ? ((a%400 == 0) ? "1" : (a%100 == 0) ? "0" : "1") : "0");
        if (a%4 == 0) {
            if (a%400 == 0) {
                System.out.println("1");
            } else if (a%100 == 0) {
                System.out.println("0");
            } else {
                System.out.println("1");
            }
        } else {
            System.out.println("0");
        }
    }
}
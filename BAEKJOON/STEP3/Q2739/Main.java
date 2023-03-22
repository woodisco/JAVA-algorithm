package BAEKJOON.STEP3.Q2739;

import java.util.Scanner;

// 2739번 : 구구단
public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a;
        
        a = sc.nextInt();  
        
        for (int i = 1; i <= 9; i++) {
            System.out.println(a + " * " + i + " = " + (a * i));
        }
    }
}
package BAEKJOON.STEP3.Q8393;

import java.util.Scanner;

// 8393번 : 합
public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        int a;
        int sum = 0;
        
        a = sc.nextInt(); 

        for (int i = 1; i <= a; i++) {
            sum += i;
        }

        System.out.println(sum);
    }
}
package BAEKJOON.STEP3.Q10950;

import java.util.Scanner;

// 10950번 : A+B - 3
public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a, b, c;
        
        c = sc.nextInt(); // 테스트케이스 수

        for (int i = 0; i < c; i++) {
            a = sc.nextInt();  
            b = sc.nextInt();
            System.out.println(a+b);
        }
    }
}
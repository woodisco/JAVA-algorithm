package BAEKJOON.STEP3.Q10951;

import java.util.Scanner;

// 10951번 : A+B - 4
public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNextInt()) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            
            System.out.println(a + b);
        }
        
        sc.close();
    }
}
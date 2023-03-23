package BAEKJOON.STEP3.Q10952;

import java.util.Scanner;

// 10952번 : A+B - 5
public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            
            if (a == 0 && b == 0) {
                sc.close();
                break;
            }
            System.out.println(a + b);
        }
    }
}
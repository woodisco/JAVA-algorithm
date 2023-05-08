package BAEKJOON.STEP4.Q3052;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

// 3052번 : 나머지
public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		/* HashSet은 자바 Collection 중 Set의 파생클래스 
           중복되는 원소를 넣을 경우 하나만 저장한다. 즉, 중복원소를 허용하지 않는다.
           HashSet은 순서개념이 없다. 따라서 Collections.sort() 메소드를 사용할 수 없다. 만약 정렬을 하고 싶다면 리스트로 변환 후 정렬해야한다.
        */
        HashSet<Integer> h = new HashSet<Integer>();
 
		
		for (int i = 0; i < 10; i++) {
			// 입력받은 값의 나머지 값을 add메소드를 통해 HashSet에 저장
            h.add(Integer.parseInt(br.readLine()) % 42);
		}
		
		// HashSet의 크기(= 저장되어 있는 원소의 개수)를 반환
        System.out.print(h.size());
    }
}
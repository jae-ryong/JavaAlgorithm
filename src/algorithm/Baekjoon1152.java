package algorithm;

//StringTokenizer는 문자열 나눌때 중요하다.

import java.util.Scanner;
import java.util.StringTokenizer;

public class Baekjoon1152 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a = sc.nextLine();
		StringTokenizer st = new StringTokenizer(a," "); 
		System.out.println(st.countTokens());
	}
}

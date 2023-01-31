package algorithm;

/*
 * StringBulider는 문자열을 다루는 클래스이고
 * 여기에 reverse()라는 함수가 있다.
 */
import java.util.Scanner;

public class Baekjoon2908 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		String b = sc.next();
		int num1 = Integer.parseInt(a);
		int num2 = Integer.parseInt(b);
		int result1 = (num1%10)*100+ ((num1/10)%10)*10 +num1/100;
		int result2 = (num2%10)*100+ ((num2/10)%10)*10 +num2/100;
		if(result1>result2) System.out.println(result1);
		else System.out.println(result2);
	}
}

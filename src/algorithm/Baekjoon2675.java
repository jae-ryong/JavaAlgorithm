package algorithm;
//백준 2675번
import java.util.Scanner;

public class Baekjoon2675 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		for(int i=0;i<num;i++) {
			int h = sc.nextInt();
			String a = sc.next();
			for(int j=0;j<a.length();j++) {
				for(int k=0;k<h;k++) {
					System.out.print(a.charAt(j));
				}
			}
			System.out.println();
		}
	}
}

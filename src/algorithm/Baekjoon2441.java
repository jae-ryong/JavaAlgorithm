package algorithm;
// 백준 2441번
import java.util.Scanner;
public class Baekjoon2441 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		for(int i=num;i>0;i--) {
			for(int k=num;k>i;k--) {
				System.out.print(" ");
			}
			for(int j=i;j>0;j--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}

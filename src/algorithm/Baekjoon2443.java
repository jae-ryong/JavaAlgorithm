package algorithm;
//백준 2443번
import java.util.Scanner;

public class Baekjoon2443 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		for(int i=num;i>0;i--) {
			for(int k=i;k<num;k++) {
				System.out.print(" ");
			}
			
			for(int j = 0;j<2*i-1;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}

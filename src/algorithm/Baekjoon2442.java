package algorithm;
//백준 2442번
import java.util.Scanner;

public class Baekjoon2442 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		for(int j=1;j<num+1;j++) {
			for(int k=num-1;k>j-1;k--) {
				System.out.print(" ");
			}
			for(int i=1; i<=2*j-1;i++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}

}

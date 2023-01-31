package algorithm;

import java.util.Scanner;

//백준 2444번(별찍기)
public class Baekjoon2444 {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int num = sc.nextInt();
		for(int i=1;i<=num;i++) {
			for(int k=0;k<num-i;k++) {
				System.out.print(" ");
			}
			for(int j=0;j<2*i-1;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for(int k=num-1;k>=0;k--) {
			for(int m=0;m<num-k;m++) {
				System.out.print(" ");
			}
			for(int n=0;n<2*k-1;n++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}

package algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon3460 {
	public static void main(String[] args) throws  IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int a = Integer.parseInt(br.readLine());
		for(int i=0;i<a;i++) {
			int n = Integer.parseInt(br.readLine());
			int count = 0;
			while(n!=0) {
				if(n%2==1) System.out.print(count + " ");
				n/=2;
				count++;
			}
			System.out.println();
		}
	}
}

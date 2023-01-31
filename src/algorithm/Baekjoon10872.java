package algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon10872 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		System.out.println(fact(num));
	}
	
	public static int fact(int num) {
		if(num==1) return num;
		else if(num==0) return 1;
		else return num * fact(num-1);
	}

}

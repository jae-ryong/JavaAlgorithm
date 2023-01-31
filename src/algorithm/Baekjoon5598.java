package algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon5598 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		char[] array = br.readLine().toCharArray();
		
		for(int i=0;i<array.length;i++) {
			if(array[i]=='A') array[i]=91;
			if(array[i]=='B') array[i]=92;
			if(array[i]=='C') array[i]=93;
			System.out.print((char)(array[i]-3));
		}
	}
}

package algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon1037 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		int[] arr = new int[num];
		int max=0;
		int min=1000000;
		int result = 0;
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i=0;i<num;i++) {
			arr[i]=Integer.parseInt(st.nextToken());
		}
		if(num==1) {
			result = arr[0]*arr[0];
		}else {
			for(int i=0;i<arr.length;i++) {
				if(max<arr[i]) max =arr[i];
				if(min>arr[i]) min =arr[i];
				result = min*max;
			}
		}
		System.out.println(result);
	}
}

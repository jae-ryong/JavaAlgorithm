package algorithm;
//백준2576번
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon2576 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] arr = new int[7];
		int min=100;
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2!=0) {
				sum+=arr[i];
				if(min>arr[i]) min =arr[i];
			}
		}
		if(sum==0) System.out.println(-1);
		else {
			System.out.println(sum);
			System.out.println(min);
		}
	}
}

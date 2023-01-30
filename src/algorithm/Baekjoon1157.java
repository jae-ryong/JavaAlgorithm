package algorithm;
// 백준 1157번
import java.util.Scanner;
public class Baekjoon1157 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		int idx=0;
		int[] arr = new int[26];
		for(int i=0;i<a.length();i++) {
			if(a.charAt(i)-'A'>25) {
				arr[a.charAt(i)-'a'] += 1;
			}else {
				arr[a.charAt(i)-'A'] += 1;
			}
		}
		int max = arr[0];
		for(int i=1;i<arr.length;i++) {
			if(max<arr[i]) {
				max = arr[i];
				idx = i;
			}
		}
		int count = 0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==arr[idx]) count +=1;
		}
		if(count==1) {
			System.out.println((char)(idx+'A'));
		}else System.out.println("?");	
	}
}

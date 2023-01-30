package algorithm;
//백준 10809번

import java.util.Scanner;
public class Baekjoon10809 {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		 String a = sc.next();
		 int[] arr =new int[26];
		 for(int i=0;i<arr.length;i++) {
			arr[i]=-1;
		 }
		 for(int i=0;i<a.length();i++) {
			 if(arr[a.charAt(i)-'a']>=0) {
				 continue;
			 }else arr[a.charAt(i)-'a']=i;
		 }
		 
		 for(int i=0;i<arr.length;i++) {
			 System.out.print(arr[i]+" ");
		 }
	}
}

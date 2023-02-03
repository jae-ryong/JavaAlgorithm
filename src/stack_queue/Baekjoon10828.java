package stack_queue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon10828 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		int top=-1;
		int[] stack = new int[num];
		for(int i=0;i<num;i++) {
			String a = br.readLine();
			if(a.equals("top")) {
				if(top<0) System.out.println(-1);
				else {
					System.out.println(stack[top]);
				}	
			}else if(a.equals("size")) {
				System.out.println(top+1);
			}else if(a.equals("empty")) {
				if(top==-1) System.out.println(1);
				else if(top>=0) System.out.println(0);
			}else if(a.equals("pop")) {
				if(top<0) System.out.println(-1);
				else {
					System.out.println(stack[top]);
					top--;
				}		
			}else if(a.contains("push")) {
				String[] arr1 = a.split(" ");
				int m = Integer.parseInt(arr1[1]);
				stack[++top]=m;
			}
		}
	}
}

package stack_queue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;


public class Baekjoon9093 {
	public static void main(String[] args) throws  IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		Stack<Character> list = new Stack<>();
		StringBuilder sb = new StringBuilder();
		while(N-->0) {
			String s = br.readLine()+"\n";
			for(char ch : s.toCharArray()) {
				if(ch==' ' || ch=='\n') {
					while(!list.isEmpty()) {
						sb.append(list.pop());
					}
					sb.append(' ');
				}else {
					list.push(ch);
				}
			}
			sb.append('\n');
		}
		System.out.println(sb);
	}
}

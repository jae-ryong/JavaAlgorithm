package stack_queue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Baekjoon9012 {
	public static void main(String[] args) throws IOException {
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		Stack<Character> stack = new Stack<>();
		while(N-->0) {
			String s = br.readLine();
			for(int i=0;i<s.length();i++) {
				char ch = s.charAt(i);
				if(ch=='(') stack.push(ch);
				else {
					if(stack.size()==0) {
						stack.push(ch);
						break;
					}
					else stack.pop();
				}
			}
			if(stack.isEmpty()) System.out.println("YES");
			else System.out.println("NO");
			stack.clear();
		}
	}
}

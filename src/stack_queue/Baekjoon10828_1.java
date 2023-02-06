package stack_queue;

/*
 * 백준10828번을 스택을 이용해서 구현해보기
 * 그리고 StringBuilder도 이용해보았다.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Baekjoon10828_1 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		Stack<Integer> stack = new Stack<>();
		StringBuilder sb =new StringBuilder();
		while(N-->0) {
			StringTokenizer st = new StringTokenizer(br.readLine()," ");
			switch(st.nextToken()) {
			case "push":
				int num1 = Integer.parseInt(st.nextToken());
				stack.push(num1);
				break;
			case "pop":
				if(stack.size()==0) sb.append(-1).append('\n');
				else sb.append(stack.pop()).append('\n');
				break;
			case "size":
				sb.append(stack.size()).append('\n');
				break;
			case "empty":
				if(stack.size()==0) sb.append(1).append('\n');
				else sb.append(0).append('\n');
				break;
			case "top":
				if(stack.size()==0) sb.append(-1).append('\n');
				else sb.append(stack.peek()).append('\n');
				break;
			}
		}
		System.out.println(sb);
	}
}

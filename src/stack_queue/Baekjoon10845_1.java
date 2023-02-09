package stack_queue;

/*
 * 큐를 이용하여 구현하기
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Baekjoon10845_1 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Queue<Integer> queue = new LinkedList<>();
		int N = Integer.parseInt(br.readLine());	
		StringBuilder sb = new StringBuilder();
		while(N-->0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			switch(st.nextToken()) {
			case "push":
				int num = Integer.parseInt(st.nextToken());
				queue.add(num);
				break;
			case "pop":
				if(queue.isEmpty()) sb.append(-1).append('\n');
				else sb.append(queue.poll()).append('\n');
				break;
			case "size":
				sb.append(queue.size()).append('\n');
				break;
			case "empty":
				if(queue.isEmpty()) sb.append(1).append('\n');
				else sb.append(0).append('\n');
				break;
			case "front":
				if(queue.isEmpty()) sb.append(-1).append('\n');
				else sb.append(queue.peek()).append('\n');
				break;
			case "back":
				if(queue.isEmpty()) sb.append(-1).append('\n');
				else {
					for(int i=0;i<queue.size()-1;i++) {
						queue.add(queue.poll());
					}
					sb.append(queue.peek()).append('\n');
					queue.add(queue.poll());
				}
				break;
			}
		}
		System.out.println(sb);
	}
}

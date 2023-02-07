package stack_queue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Baekjoon1158 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		LinkedList<Integer> list = new LinkedList<>(); 
		int num1 = Integer.parseInt(st.nextToken());
		int num2 = Integer.parseInt(st.nextToken());
		StringBuilder sb= new StringBuilder();
		sb.append("<");
		for(int i=0;i<num1;i++) {
			list.add(i+1);
		}
		while(!list.isEmpty()) {
			if(list.size()==1) {
				sb.append(list.remove()).append(">");
			}else {
				for(int i=0;i<num2;i++) {
					if(i==num2-1) {
						sb.append(list.remove()).append(", ");
					}else {
						list.add(list.remove());
					}
				}
			}
		}
		System.out.println(sb);
	}
}

package stack_queue;

/*
 * 백준 10828번보다 깔끔한 형식으로 풀어봤다. (case문)
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon10845 {
	public static int[] stack;
	public static int index=-1;
	
	public static void main(String[] args) throws  IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		stack = new int[N];
		while(N-->0) {
			StringTokenizer st = new StringTokenizer(br.readLine()," ");
			switch(st.nextToken()) {
			case "push":
				int num = Integer.parseInt(st.nextToken());
				stack[++index]=num;
				break;
			case "pop":
				if(index<0) System.out.println(-1);
				else {
					System.out.println(stack[0]);
					for(int j=0;j<index;j++) {
						stack[j]=stack[j+1];
					}
					index -=1;
				}
				break;
			case "size":
				System.out.println(index+1);
				break;
			case "empty":
				if(index<0) System.out.println(1);
				else System.out.println(0);
				break;
			case "front":
				if (index<0) System.out.println(-1); 
				else System.out.println(stack[0]);
				break;
			case "back":
				if (index<0) System.out.println(-1); 
				else System.out.println(stack[index]);
				break;
			}
		}
	}
}

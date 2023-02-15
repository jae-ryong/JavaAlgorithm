package dfs_bfs;
/*
 * 스택으로 구현해본 것이다.
 */
import java.util.*;

public class DFSex2 {
	static int[][] graph = {{},{2,3,8},
			{1,7},{1,4,5},
			{3},{3},
			{7},{2,6,8},
			{1,7}};
	static boolean visited[]= {false,false,false,false,false,false,false,false,false};
	
	public static void main(String[] args) {
		int start=1;
		dfs(start);
	}
	
	public static void dfs(int num) {
		Stack<Integer> stack = new Stack<>();
		visited[num]=true;
		stack.push(num);
		System.out.print(num + " ");
		while(!stack.isEmpty()) {
			int now = stack.peek();
			boolean hasNearNode = false; //방문하지 않는 인접 노드가 있는지
			for(int i : graph[now]) {
				if(visited[i]==false) {
					hasNearNode = true;
					stack.push(i);
					visited[i] = true;
					System.out.print(i + " ");
					break;
				}
			}
			if(hasNearNode==false) stack.pop();
		}
	}

}

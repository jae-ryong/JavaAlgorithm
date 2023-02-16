package dfs_bfs;

import java.util.LinkedList;
import java.util.Queue;

public class Bfs {
	
	static int[][] graph = {{},{2,3,8},
			{1,7},{1,4,5},
			{3,5},{3,4},
			{7},{2,6,8},
			{1,7}};
	static boolean visited[]= {false,false,false,false,false,false,false,false,false};
	
	public static void main(String[] args) {
		int start = 1;
		bfs(start);
	}
	
	public static void bfs(int num) {
		Queue<Integer>queue = new LinkedList<>();
		visited[num] = true;
		System.out.print(num + " ");
		queue.offer(num);
		
		while(!queue.isEmpty()) {
			int out = queue.poll();
			for(int i : graph[out]) {
				if(!visited[i]) {
					queue.offer(i);
					visited[i]=true;
					System.out.print(i + " ");
				}
			}
		}
	}

}

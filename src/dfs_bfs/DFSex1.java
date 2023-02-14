package dfs_bfs;
/*
 * 재귀함수 호출을 이용해서 구현한 것이다.
 */
public class DFSex1 {
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
		System.out.print(num + " ");
		visited[num] = true;
		for(int i : graph[num]) {
			if(visited[i]==false) {
				dfs(i);
			}
		}
	}
}

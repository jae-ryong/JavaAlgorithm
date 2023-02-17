package dfs_bfs;
/*
 * https://school.programmers.co.kr/learn/courses/30/lessons/43162
 * 프로그래머스 네트워크 문제이다.
 */
public class Pro_network {
		static boolean[] check;
		public static void main(String[] args) {
			System.out.println(solution(3,new int[][] {{1,1,0},{1,1,0},{0,0,1}}));
			System.out.println(solution(3,new int[][] {{1,1,0},{1,1,1},{0,1,1}}));
		}
	    public static int solution(int n, int[][] computers) {
	        int answer = 0;
	        check = new boolean[n];
	        
	        for(int j=0;j<n;j++){
	            if(check[j]==false){
	                dfs(j,computers,n);
	                answer++;
	            }
	        }
	        
	        return answer;
	    }
	
	public static void dfs(int index,int[][]computers,int n){
        for(int i=0;i<n;i++){
            if(computers[index][i]==1 && check[i]==false){
                check[i]=true;
                dfs(i,computers,n);
            }
        }
    }
}

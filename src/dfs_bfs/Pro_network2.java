package dfs_bfs;
/*
 * https://school.programmers.co.kr/learn/courses/30/lessons/43162
 * 프로그래머스 네트워크 문제이다.
 * 이건 전 문제와 달리 bfs로 푼것이다.
 */
import java.util.*;
public class Pro_network2 {
		static boolean[] check;
		static Queue<Integer> queue = new LinkedList<>();
		public static void main(String[] args) {
			System.out.println(solution(3,new int[][] {{1,1,0},{1,1,0},{0,0,1}}));
			System.out.println(solution(3,new int[][] {{1,1,0},{1,1,1},{0,1,1}}));
		}
	    public static int solution(int n, int[][] computers) {
	        int answer = 0;
	        check = new boolean[n];
	        
	        for(int j=0;j<n;j++){
	            if(check[j]==false){
	                bfs(j,computers,n);
	                answer++;
	            }
	        }
	        
	        return answer;
	    }
	
	public static void bfs(int index,int[][]computers,int n){
		queue.offer(index);
        check[index]=true;
        while(!queue.isEmpty()){
            int val = queue.poll();
            for(int i=0;i<n;i++){
                if(computers[val][i]==1&&check[i]==false){
                    check[i]=true;
                    queue.offer(i);
                }
            }
        }
    }
}

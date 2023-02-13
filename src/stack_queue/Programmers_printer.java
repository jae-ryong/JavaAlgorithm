package stack_queue;
import java.util.*;

public class Programmers_printer {

	public static void main(String[] args) {
		System.out.println(solution(new int []{2,1,3,2},2));
		System.out.println(solution(new int []{1,1,9,1,1,1},0));
	}
	
	    public static int solution(int[] priorities, int location) {
	        int answer = 0;
	        int count=0;
	        PriorityQueue<Integer> arr = new PriorityQueue<>(Collections.reverseOrder());
	        for(int i=0; i<priorities.length;i++){
	            arr.add(priorities[i]);
	        }
	        
	        while(!arr.isEmpty()){
	            for(int i=0; i<priorities.length;i++){
	                if(priorities[i]==arr.peek()){
	                    if(i==location){
	                        answer+=1;
	                        return answer;
	                    }
	                    arr.poll();
	                    answer+=1;   
	                }
	            }
	        }       
	        return -1;
	  }
}

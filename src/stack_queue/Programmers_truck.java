package stack_queue;
import java.util.Queue;
import java.util.LinkedList;
/*
 * https://school.programmers.co.kr/learn/courses/30/lessons/42583
 * 다리를 지나는 트럭이라는 프로그래머스 문제이다.
 */
public class Programmers_truck {
	public static void main(String[] args) {
		
		System.out.println(solution(2,10 ,new int [] {7,4,5,6}));
		System.out.println(solution(100,100 ,new int [] {10}));
		System.out.println(solution(100,100 ,new int [] {10,10,10,10,10,10,10,10,10,10}));
	}
	public static int solution(int bridge_length, int weight, int[] truck_weights) {
        int answer = 0;
        int sum = 0;
        Queue<Integer> queue = new LinkedList<>();
        for(int i=0;i<truck_weights.length;i++){
            int num = truck_weights[i];
            
            while(true){
                if(queue.isEmpty()){
                queue.add(num);
                sum += num;
                answer++;
                break;
            }else if(queue.size()!=bridge_length){
                if(num+sum>weight){
                    queue.add(0);
                    answer+=1;
                }else{
                    sum+=num;
                    queue.add(num);
                    answer+=1;
                    break;
                }
            }else{
                sum -= queue.poll();
                }
            
            }
            
        }
        return answer + bridge_length;
    }
}

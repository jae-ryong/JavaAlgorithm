package stack_queue;
import java.util.Stack;
/*
 * https://school.programmers.co.kr/learn/courses/30/lessons/42584
 * 문제 사이트이다.
 */
public class Programmers_stock {
	public static void main(String[] args) {
		solution(new int []{1 ,2, 3, 2, 3});
		//하면 출력 값 [4, 3, 1, 1, 0]
		solution(new int []{5, 4, 3, 2, 5});
		//하면 출력 값 [1, 1, 1, 1, 0]
		solution(new int []{1, 2, 3, 2, 1});
		//하면 출력 값 	[4, 3, 1, 1, 0]
		//배열로 받기 때문에 따로 빼서 출력하면 위의 값이 나온다.
	}
	
	public static int[] solution(int[] prices) {
        int[] answer = new int[prices.length];
        
        Stack<Integer> stack = new Stack<>();
        for(int i=0;i<prices.length;i++){
            int count = 0;
            if(i==prices.length-1) {
                stack.add(0);
                break;
            }
            for(int j=i+1;j<prices.length;j++){
                if(prices[i]<=prices[j]) {
                    count++;
                }
                else {
                    if(count==0) count=1;
                    else count+=1;
                    break;
                }
            }
            stack.add(count);
        }
        for(int i=0;i<answer.length;i++){
            answer[i] = stack.get(i);
        }
        return answer;
    }
}

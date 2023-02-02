package algorithm;

/*
 * 문제 사이트
 * https://school.programmers.co.kr/learn/courses/30/lessons/12977
 * 소수 만들기
 */
import java.util.*;
public class Programmers1 {

	public static void main(String[] args) {
		int[] arr1 = new int []{1,2,3,4};
		int[] arr2 = new int[] {1,2,7,6,4};
		
		System.out.println(solution(arr1));
		System.out.println(solution(arr2));
	}
	 
	public static int solution(int[] nums) {
	        int answer = 0;
	        int sum=0;
	        List<Integer> a = new ArrayList<>();
	        for(int i=0;i<nums.length;i++){
	            for(int j=i+1;j<nums.length;j++){
	                for(int k=j+1;k<nums.length;k++){
	                    sum=0;
	                    sum=nums[i]+nums[j]+nums[k];
	                    for(int m=2;m<sum;m++){
	                        if(sum%m==0) break;
	                        if(m==sum-1) a.add(sum);
	                }
	            }
	        }
	    }
	        answer=a.size();
	        return answer;
	    }

}

package algorithm;
//백준 1065번

import java.util.Scanner;

public class BaekJoon1065 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		System.out.println(hansu(num));
	}

	public static int hansu(int num) {
		int count =0;
		int first = 0;
		int second = 0;
		int third = 0;
		int cha1 = 0;
		int cha2 = 0;
		for(int i=1;i<num+1;i++) {
			if(i<100) {
				count++;
			}else if(i<1000){
					first = i /100;
					second = (i/10)%10;
					third = i %10;
					cha1 = first-second;
					cha2 = second - third;
					if(cha1==cha2) {
						count++;
					}
			}else if(i==1000) count+=0;
		}
		return count;
	}
}

package algorithm;

/*
 * https://school.programmers.co.kr/learn/courses/30/lessons/72410
 * 신규아이디 추천 문제이다.
 */
public class Kakao1 {
	public static void main(String[] args) {
		System.out.println(solution("...!@BaT#*..y.abcdefghijklm"));
		System.out.println(solution("z-+.^."));
		System.out.println(solution("=.="));
		System.out.println(solution("123_.def"));
		System.out.println(solution("abcdefghijklmn.p"));
	}
	
	 public static String solution(String new_id) {
	        String answer = "";
	        //step1
	        String step1 = new_id.toLowerCase();
	        
	        //step2
	        String step2="";
	        char[] array = step1.toCharArray();
	        StringBuilder sb = new StringBuilder();
	        for(char c : array){
	            if((c>='a'&&c<='z') || (c>='0'&&c<='9') || (c=='-' || c=='_' || c=='.'))
	                sb.append(c);
	        }
	        
	        //step3
	        String step3 = sb.toString().replace("..",".");
	        while(step3.contains("..")){
	            step3=step3.replace("..",".");
	        }
	        
	        //step4
	        String step4 = step3;
	        if(step4.length()>0){
	            if(step4.charAt(0)=='.'){
	                step4=step4.substring(1,step4.length());
	            }
	        }
	        
	        if(step4.length()>0){
	            if(step4.charAt(step4.length()-1)=='.'){
	                step4=step4.substring(0,step4.length()-1);
	            }
	        }
	        
	        //step5
	        String step5 = step4;
	        if(step5.length()==0) step5="a";
	        
	        //step6
	        String step6 = step5;
	        if(step6.length()>=16){
	            step6 = step6.substring(0,15);
	            if(step6.charAt(step6.length()-1)=='.') step6 = step6.substring(0,14);
	        }
	        
	        //step7
	        StringBuilder step7 = new StringBuilder(step6);
	        while(step7.length()<3){
	            step7.append(step7.charAt(step7.length()-1));
	        }
	        
	        return step7.toString();  
	    }
}

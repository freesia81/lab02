package Atype;

public class Q04_LongPalindrome {

	public int solution(String s) {
		int answer = 0;
		
		int len = 0;
		int max = 0;
		
		//System.out.println("length: " + s.length());
	
		/* 방법 1: String.equals() 활용
		for(int i=0; i<s.length()-1; i++) {
			for(int j=i+1; j<=s.length(); j++) {
			
				String org = s.substring(i, j);				// 주의: j-1까지만 복사됨
				StringBuffer tmp = new StringBuffer(org);
				String rev = tmp.reverse().toString();
				
				// equals는 반드시 String 객체로 비교해야 함
				if (org.equals(rev)) {
					len = org.length();
					if (len > max)
						max = len;
				}
			}
		}
		*/
		
		// 방법 2: for문 실행하면서 각 원소 비교
		char[] str = s.toCharArray();
		for(int i=0; i<s.length()-1; i++) {
			for(int j=i; j<s.length(); j++) {
				
				int b, t;
				boolean same = true;
				len = j-i+1;
				for(b=i, t=j; b<=t; b++, t--) {
					if (str[b] != str[t]) {
						same = false;
						break;
					}
				}
				
				if (same == true && len > max) {
					max = len;
				}
			}
		}		
		
		answer = max;
		return answer;
	}
	
	
	public static void main(String[] args) {
		Q04_LongPalindrome longPalindrome = new Q04_LongPalindrome();
		System.out.println(longPalindrome.solution("abcdcba"));
		System.out.println(longPalindrome.solution("abacde"));
		System.out.println(longPalindrome.solution("abcedfg"));
	}

}

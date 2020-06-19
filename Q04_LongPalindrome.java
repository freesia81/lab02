package Atype;

public class Q04_LongPalindrome {

	public int solution(String s) {
		int answer = 0;
		
		int len = 0;
		int max = 0;
		
		//System.out.println("length: " + s.length());
	
		/* ��� 1: String.equals() Ȱ��
		for(int i=0; i<s.length()-1; i++) {
			for(int j=i+1; j<=s.length(); j++) {
			
				String org = s.substring(i, j);				// ����: j-1������ �����
				StringBuffer tmp = new StringBuffer(org);
				String rev = tmp.reverse().toString();
				
				// equals�� �ݵ�� String ��ü�� ���ؾ� ��
				if (org.equals(rev)) {
					len = org.length();
					if (len > max)
						max = len;
				}
			}
		}
		*/
		
		// ��� 2: for�� �����ϸ鼭 �� ���� ��
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

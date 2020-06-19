package Atype;

//정답을 구현한 내부클래스
class Solution {
	public int solution(int n, int m) {
		int answer = 0;

		for(int i=n; i<=m; i++)
		{
			String org = String.valueOf(i);
			StringBuffer temp = new StringBuffer(org);
			String rev = temp.reverse().toString();
         
			// Key: 문자열 비교 - 반드시 equals() 사용해야 함
			//      대소문자 구별않고 비교 - equalsIgnoreCase() 사용
			if (org.equals(rev))
				answer++;
		}      
		return answer;
	}
}

public class Q01_Palindrome {

	public static void main(String[] args) {
		Solution sol = new Solution();
		System.out.println(sol.solution(1, 100));
		System.out.println(sol.solution(100, 300));
	}
	
}

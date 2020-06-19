package Atype;

//������ ������ ����Ŭ����
class Solution {
	public int solution(int n, int m) {
		int answer = 0;

		for(int i=n; i<=m; i++)
		{
			String org = String.valueOf(i);
			StringBuffer temp = new StringBuffer(org);
			String rev = temp.reverse().toString();
         
			// Key: ���ڿ� �� - �ݵ�� equals() ����ؾ� ��
			//      ��ҹ��� �����ʰ� �� - equalsIgnoreCase() ���
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

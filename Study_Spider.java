package Atype;


class Solution_SpiderArray2 {
	
	public String solution(int n, int m) {
		String result = "";
		
		int[][] arr = new int[n][m];
		
		int num = 1;
		int r = 0, c = 0;


		for(int t=0; t<=n/2; t++){
			r = t;
				
			// ���������� �̵� (c ����)
			for(c = t; c < (n-1-t); c++)
				arr[r][c] = num++;		
			
			// Ȧ���� ��, ��������
			if (n%2 == 1 && r == c)
				arr[r][r] = num++;
			
			// �Ʒ��� �̵� (r ����)
			for(r = t; r < (n-1-t); r++)
				arr[r][c] = num++;		
				
			// �������� �̵� (c ����)
			for(c = n-1-t; c > t; c--)
				arr[r][c] = num++;
			
			// �������� �̵� (r ����)
			for (r = n-1-t; r > t; r--)
				arr[r][c] = num++;
		}

				
		System.out.println(n + "*" + m + " �迭");
		for(int i=0; i<n; i++) {
			for(int j=0; j<m; j++) 
				System.out.print(arr[i][j] + "\t");
			System.out.println("");
		}
		System.out.println("");
		
		return result;
	}
}

public class Study_Spider {

	public static void main(String[] args) {
		
		Solution_SpiderArray2 sol = new Solution_SpiderArray2();
		sol.solution(5, 5);
		
		sol.solution(4, 4);
		
		sol.solution(10, 10);
	}

}

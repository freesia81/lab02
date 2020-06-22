package Atype;


public class Study_Spider2 {

	
	public void solution(int n) {
		
		int[][] arr = new int[n][n];
		
		int i;
		int x = 0;
		int y = -1;
		int d = 1;
		int cnt = 1;
		int size;
		
		size = n;
		while(size >= 0) {
			for(i=0; i<size; i++) {	// 행 표현
				y = y + d;
				arr[x][y] = cnt++;
			}
			
			size--;
			for(i=0; i<size; i++) {	// 열 표현
				x = x + d;
				arr[x][y] = cnt++;
			}
			
			d = d * (-1);
		}
		
		// 화면 출력
		for(x=0; x<n; x++) {
			for(y=0; y<n; y++)
				System.out.print(arr[x][y] + "\t");
			System.out.println();
		}
	}
	
	public static void main(String[] args) {

		Study_Spider2 s = new Study_Spider2();
		s.solution(5);
		
		System.out.println();
		s.solution(4);

	}

}

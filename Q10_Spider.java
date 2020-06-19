package Atype;

public class Q10_Spider {

	public String solution(int n, int jump) {
		String result = "";
		
		int[][] arr = new int[n][n];

		int r = 0, c = 0;

		int num = 1;
		int cnt = 0;
		while(true) {
			for(int t=0; t<=n/2; t++){
				r = t;
					
				// 오른쪽으로 이동 (c 증가)
				for(c = t; c < (n-1-t); c++) {	
					//System.out.println(r + ", " + c + " : " + cnt);					
					if (arr[r][c] == 0) {
						if (cnt % jump == 0)
							arr[r][c] = num++;
						cnt++;
					}
					
					if (num > n*n) {
						printArray(n, arr);
						return result + r + "," + c;
					}
				}
				
				// 홀수일 때, 종료조건
				if (n%2 == 1 && r == c) {
					//System.out.println(r + ", " + c + " : " + cnt);
					if (arr[r][c] == 0) {
						if (cnt % jump == 0)
							arr[r][c] = num++;
						cnt++;
					}
					
					if (num > n*n) {
						printArray(n, arr);
						return result + r + "," + c;
					}
				}
				
				// 아래로 이동 (r 증가)
				for(r = t; r < (n-1-t); r++) {
					//System.out.println(r + ", " + c + " : " + cnt);
					if (arr[r][c] == 0) {
						if (cnt % jump == 0)
							arr[r][c] = num++;
						cnt++;
					}
					
					if (num > n*n) {
						printArray(n, arr);
						return result + r + "," + c;
					}
				}
					
				// 왼쪽으로 이동 (c 감소)
				for(c = n-1-t; c > t; c--) {
					//System.out.println(r + ", " + c + " : " + cnt);
					if (arr[r][c] == 0) {
						if (cnt % jump == 0)
							arr[r][c] = num++;
						cnt++;
					}
					
					if (num > n*n) {
						printArray(n, arr);
						return result + r + "," + c;
					}
				}
				
				// 위쪽으로 이동 (r 감소)
				for (r = n-1-t; r > t; r--) {
					//System.out.println(r + ", " + c + " : " + cnt);
					if (arr[r][c] == 0) {
						if (cnt % jump == 0)
							arr[r][c] = num++;
						cnt++;
					}
					
					if (num > n*n) {
						printArray(n, arr);
						return result + r + "," + c;
					}
				}
			}
		}		
		
		//return result;
	}
	
	public void printArray(int n, int[][] arr) {
		System.out.println("[" + n + "*" + n + "] 배열");
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) 
				System.out.print(arr[i][j] + "\t");
			System.out.println("");
		}
	}
	
	public static void main(String[] args) {
		Q10_Spider s = new Q10_Spider();
		System.out.println("최종위치: " + s.solution(5, 4));
		System.out.println("최종위치: " + s.solution(4, 1));
		System.out.println("최종위치: " + s.solution(4, 5));
	}

}

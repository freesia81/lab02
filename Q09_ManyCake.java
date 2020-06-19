package Atype;

import java.util.Arrays;
import java.util.TreeSet;

class Solution_ManyCake {
	public int solution(String cake[], int row_cut[], int col_cut[]) {
		
		int result = 0;
		
		// 1. String배열 -> 2차원 char배열로 변환
		int n = cake.length;
		char [][]buf = new char[n][n];
		for(int i=0; i<n; i++)
			buf[i] = cake[i].toCharArray();
		

		// 디버깅 출력용. 2차원 배열의 인덱스 사용하여 각 원소 출력
		for(int i=0; i < buf.length; i++) {
			for(int j=0; j < buf[i].length; j++)
				System.out.print(buf[i][j]);
			System.out.println();
		}
		
		// 디버깅 출력용. deepToString 활용하여 출력
		System.out.println(Arrays.deepToString(buf));

		
		// 2. row_cut, col_cut 재구성 (n값 추가)
		int[] row = new int[row_cut.length + 1];
		System.arraycopy(row_cut, 0, row, 0, row_cut.length);
		row[row.length-1] = n;
		System.out.println(Arrays.toString(row));
		
		int[] col = new int[col_cut.length + 1];
		System.arraycopy(col_cut, 0, col, 0, col_cut.length);
		col[col.length-1] = n;
		System.out.println(Arrays.toString(col));
		
		// TreeSet 콜렉션 특징
		// - 이진 검색 트리 (두 개의 자식노드 보유)
		// - 정렬하면서 저장
		// - 중복 허용 안함
		TreeSet<String> set = new TreeSet<String>();
		
		// 3. 조각 케익의 경계값 구하기 
		int rl = 0, rh = 0;				// row low, row high
		int cl = 0, ch = 0;				// col low, col high
		for(int i=0; i<row.length; i++) {
		
			// 3-1. 행의 경계값 구하기
			if (i == 0) {
				rl = 0;	
				rh = row[i] - 1;
			}
			else { 
				rl = row[i-1];
				rh = row[i] - 1;
			}			
			System.out.println("rl: " + rl + ", rh: " + rh);
			
			// 3-2. 열의 경계값 구하기
			for(int j=0; j<col.length; j++) {
				if (j == 0) {
					cl = 0;
					ch = col[j] - 1;
				} 
				else {
					cl = col[j-1];
					ch = col[j] - 1;
				}				
				System.out.println("\t\t cl: " + cl + ", ch: " + ch);	
				
				// 3-3. 조각케익의 맛 종류를 모아서 1개의 문자열로 만들기
				String str = "";
				for(int k = rl; k <= rh; k++) {
					for(int t = cl; t <= ch; t++) {
						if ( str.length() == 0 || !str.contains(String.valueOf(buf[k][t])) )	// 단, 중복되지 않는 문자만 추가
							str += (buf[k][t] + "");
					}
				}
				System.out.println(str);
				
				// 3-4. 맛 종류 문자열을 TreeSet에 추가. 
				// 신규 데이터 추가하면 true 리턴, 이미 데이터가 있는 경우 false 리턴
				set.add(str);	
			}
		}
		
		// 4. TreeSet -> String 배열로 변환
		String[] taste = new String[set.size()];
		set.toArray(taste);
		
		for(int i=0; i<taste.length; i++)
			System.out.println("맛종류: " + taste[i]);
		
		// 5. 가장 긴 문자열 검색
		int maxLen = 0;
		for(String str : taste) {
			if (str.length() > maxLen)
				maxLen = str.length();
		}

		result = maxLen;
		return result;
	}
}

public class Q09_ManyCake {
	public static void main(String[] args) {
		Solution_ManyCake sol = new Solution_ManyCake();
		
		String cake[] = {"AAABB", "BCCAA", "DDDDD", "ZXYAA", "ACBAA"};
		int row_cut[] = {1, 3};
		int col_cut[] = {2, 3, 4};
		System.out.println(sol.solution(cake, row_cut, col_cut));
		
		String cake2[] = {"AAAB", "BCCA", "DDDD", "ZXYA"};
		int row_cut2[] = {1, 3};
		int col_cut2[] = {2, 3};
		System.out.println(sol.solution(cake2, row_cut2, col_cut2));
	}
}

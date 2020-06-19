package Atype;

import java.util.Arrays;
import java.util.TreeSet;

class Solution_ManyCake {
	public int solution(String cake[], int row_cut[], int col_cut[]) {
		
		int result = 0;
		
		// 1. String�迭 -> 2���� char�迭�� ��ȯ
		int n = cake.length;
		char [][]buf = new char[n][n];
		for(int i=0; i<n; i++)
			buf[i] = cake[i].toCharArray();
		

		// ����� ��¿�. 2���� �迭�� �ε��� ����Ͽ� �� ���� ���
		for(int i=0; i < buf.length; i++) {
			for(int j=0; j < buf[i].length; j++)
				System.out.print(buf[i][j]);
			System.out.println();
		}
		
		// ����� ��¿�. deepToString Ȱ���Ͽ� ���
		System.out.println(Arrays.deepToString(buf));

		
		// 2. row_cut, col_cut �籸�� (n�� �߰�)
		int[] row = new int[row_cut.length + 1];
		System.arraycopy(row_cut, 0, row, 0, row_cut.length);
		row[row.length-1] = n;
		System.out.println(Arrays.toString(row));
		
		int[] col = new int[col_cut.length + 1];
		System.arraycopy(col_cut, 0, col, 0, col_cut.length);
		col[col.length-1] = n;
		System.out.println(Arrays.toString(col));
		
		// TreeSet �ݷ��� Ư¡
		// - ���� �˻� Ʈ�� (�� ���� �ڽĳ�� ����)
		// - �����ϸ鼭 ����
		// - �ߺ� ��� ����
		TreeSet<String> set = new TreeSet<String>();
		
		// 3. ���� ������ ��谪 ���ϱ� 
		int rl = 0, rh = 0;				// row low, row high
		int cl = 0, ch = 0;				// col low, col high
		for(int i=0; i<row.length; i++) {
		
			// 3-1. ���� ��谪 ���ϱ�
			if (i == 0) {
				rl = 0;	
				rh = row[i] - 1;
			}
			else { 
				rl = row[i-1];
				rh = row[i] - 1;
			}			
			System.out.println("rl: " + rl + ", rh: " + rh);
			
			// 3-2. ���� ��谪 ���ϱ�
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
				
				// 3-3. ���������� �� ������ ��Ƽ� 1���� ���ڿ��� �����
				String str = "";
				for(int k = rl; k <= rh; k++) {
					for(int t = cl; t <= ch; t++) {
						if ( str.length() == 0 || !str.contains(String.valueOf(buf[k][t])) )	// ��, �ߺ����� �ʴ� ���ڸ� �߰�
							str += (buf[k][t] + "");
					}
				}
				System.out.println(str);
				
				// 3-4. �� ���� ���ڿ��� TreeSet�� �߰�. 
				// �ű� ������ �߰��ϸ� true ����, �̹� �����Ͱ� �ִ� ��� false ����
				set.add(str);	
			}
		}
		
		// 4. TreeSet -> String �迭�� ��ȯ
		String[] taste = new String[set.size()];
		set.toArray(taste);
		
		for(int i=0; i<taste.length; i++)
			System.out.println("������: " + taste[i]);
		
		// 5. ���� �� ���ڿ� �˻�
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

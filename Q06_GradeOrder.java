package Atype;

import java.util.Arrays;

public class Q06_GradeOrder {

	public int[] solution(String[] names, int[][]homes, double[] grades) {
		int[] answer = {};
		answer = new int[names.length];
		
		int[] idx = {0, 0, 0, 0, 0};
		
		// 1. grades ����
		for(int i=0; i<grades.length; i++) {
			
		}
		
		
		// 2. ������ �Ÿ��� �� ���� 
		
		// 3. �̸� ���ĺ� ����
		
		return answer;
	}
	
	
	public static void main(String[] args) {
		Q06_GradeOrder gradeorder = new Q06_GradeOrder();
		
		String[] names = {"ab", "ac", "ee", "ww", "yy"};
		int[][] homes = {{3, 4}, {-1, 5}, {3, 4}, {6, 7}, {5, 2}};
		double[] grades = {4.36, 4.56, 3.67, 3.92, 3.33};
		
		Arrays.toString(gradeorder.solution(names, homes, grades));
	}

}

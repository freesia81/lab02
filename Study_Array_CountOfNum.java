package Atype;

import java.util.Arrays;

public class Study_Array_CountOfNum {

	// ����: �־��� ���ڿ��� ����� �� ���ڰ� �� �� �ݺ��ؼ� ��Ÿ������ ��� ����
	public int[] solution(String input) {
		int[] result = {};
		
		result = new int[10];
		char[] chArr = input.toCharArray();
		
		for(char ch: chArr) {
			result[ch-'0']++;
		}
		
		return result;
	}
	
	public static void main(String[] args) {
		Study_Array_CountOfNum s = new Study_Array_CountOfNum();
		System.out.println( Arrays.toString(s.solution("4446579753")) );

	}

}

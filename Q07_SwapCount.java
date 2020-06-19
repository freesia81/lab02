package Atype;

import java.util.Arrays;

public class Q07_SwapCount {	
	
	public int[] solution(int n, int[] input) {
		int[] answer = {};
		
		answer = new int[n];
		int minIdx = 0;
		
		for(int i=0; i<input.length; i++) {
			minIdx = getIdxOfMinValue(i+1, input);
			if (input[i] > input[minIdx]) {
				swap(input, i, minIdx);
				answer[i] = 1;
			}
			else {
				answer[i] = 0;
			}
		}
		
		int cnt = 0;
		for(int i=0; i<answer.length-1; i++) {
			if (answer[i] == 1)
				cnt++;
		}
		answer[answer.length-1] = cnt;
		
		return answer;
	}
	
	// 최소값의 인덱스 리턴
	public int getIdxOfMinValue(int startIdx, int[] input) {
		int minVal = 999;
		int minIdx = 0;
		
		for(int i = startIdx; i < input.length; i++) {
			if (input[i] < minVal) {
				minVal = input[i];
				minIdx = i;
			}
		}
		
		return minIdx;
	}
	
	// swap
	public void swap(int[] input, int aIdx, int bIdx) {
		int temp = 0;
		temp = input[aIdx];
		input[aIdx] = input[bIdx];
		input[bIdx] = temp;
	}
	
	public static void main(String[] args) {
		int n = 5;
		int[] input = {5, 1, 3, 2, 4};
		
		Q07_SwapCount sc = new Q07_SwapCount();
		System.out.println( Arrays.toString(sc.solution(n, input)) );
	}

}

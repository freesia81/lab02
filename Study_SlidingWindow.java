package Atype;

import java.util.Arrays;

public class Study_SlidingWindow {

	// 문제: 주어진 배열 arr의 윈도우 크기가 k일 때, 각 슬라이딩 윈도우의 최대값을 구하시오. 
	// [1, 3, -1] -3  5  3 6 7
	//  1 [3, -1  -3] 5  3 6 7
	// ...
	//  1  3  -1  -3  5 [3 6 7]
	public int[] solution(int slid_size, int[] arr) {
		int[] max = {};
		max = new int[arr.length - slid_size + 1];
		
		for(int i=0; i < (arr.length - slid_size + 1); i++) {
			for(int j=i; j < (i+slid_size); j++) {
				if (arr[j] > max[i])
					max[i] = arr[j];
			}
		}
		
		return max;		
	}
	
	public static void main(String[] args) {
		Study_SlidingWindow s = new Study_SlidingWindow();
		
		int[] input = {1, 3, -1, -3, 5, 3, 6, 7};
		System.out.println(Arrays.toString(s.solution(3, input)));

	}

}

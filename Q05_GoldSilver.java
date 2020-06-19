package Atype;

import java.util.Arrays;

public class Q05_GoldSilver {

	public int[] solution(int gold, int silver, int[] value) {
		// 배열 선언 - 참조변수 선언
		int[] answer = {};		// 길이가 0인 배열, new int[]가 생략됨
		
		// 배열 생성 - 실제 메모리 공간 생성, 기본값 0으로 자동 초기화
		answer = new int[value.length];
		
		for(int i=0; i<value.length; i++) {
			
			if ( value[i] % gold == 0 ) {
				answer[i] = 1;
			}
			else if ( value[i] % silver == 0 ) {
				answer[i] = 1;
			}
			else if ( (value[i] % gold)%silver == 0 ) {
				answer[i] = 1;
			}
			else {
				answer[i] = 0;
			}
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		Q05_GoldSilver goldSilver = new Q05_GoldSilver();
		
		int gold = 5;
		int silver = 3;	
		int[] value = new int[]{20, 8, 11};	// 배열 생성 및 초기화 동시 수행
		//int[] value = {20, 15, 60};		// new int[] 생략 가능
		
		// 배열 출력 - Arrays.toString(배열참조변수) 사용
		System.out.println( Arrays.toString(goldSilver.solution(gold, silver, value)) );

	}

}

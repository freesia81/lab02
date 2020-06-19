package Atype;

import java.util.Arrays;

public class Q05_GoldSilver {

	public int[] solution(int gold, int silver, int[] value) {
		// �迭 ���� - �������� ����
		int[] answer = {};		// ���̰� 0�� �迭, new int[]�� ������
		
		// �迭 ���� - ���� �޸� ���� ����, �⺻�� 0���� �ڵ� �ʱ�ȭ
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
		int[] value = new int[]{20, 8, 11};	// �迭 ���� �� �ʱ�ȭ ���� ����
		//int[] value = {20, 15, 60};		// new int[] ���� ����
		
		// �迭 ��� - Arrays.toString(�迭��������) ���
		System.out.println( Arrays.toString(goldSilver.solution(gold, silver, value)) );

	}

}

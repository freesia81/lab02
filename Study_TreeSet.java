package Atype;

import java.util.TreeSet;

public class Study_TreeSet {

	public static void main(String[] args) {
		TreeSet<Integer> set = new TreeSet<Integer>();
		int[] score = {80, 95, 50, 35, 45, 65, 10, 100};
		
		// 1. TreeSet �÷��ǿ� ��ü �߰�
		for(int n : score) {
			set.add(n);
		}
		
		// 2. ������ ��ü���� �̸� ���� ��ü���� ��ȯ
		System.out.println("50 �̸��� ��: " + set.headSet(50, false));
		System.out.println("50 ������ ��: " + set.headSet(50, true));	
		
		// 3. ������ ��ü���� ũ�ų� ���� ���� ��ü���� ��ȯ
		System.out.println("50 �̻��� ��: " + set.tailSet(50, true));
		System.out.println("50 �ʰ��� ��: " + set.tailSet(50, false));

	}

}

package Atype;

import java.util.TreeSet;

public class Study_TreeSet {

	public static void main(String[] args) {
		TreeSet<Integer> set = new TreeSet<Integer>();
		int[] score = {80, 95, 50, 35, 45, 65, 10, 100};
		
		// 1. TreeSet 컬렉션에 객체 추가
		for(int n : score) {
			set.add(n);
		}
		
		// 2. 지정된 객체보다 미만 값의 객체들을 반환
		System.out.println("50 미만인 값: " + set.headSet(50, false));
		System.out.println("50 이하인 값: " + set.headSet(50, true));	
		
		// 3. 지정된 객체보다 크거나 같은 값의 객체들을 반환
		System.out.println("50 이상인 값: " + set.tailSet(50, true));
		System.out.println("50 초과인 값: " + set.tailSet(50, false));

	}

}

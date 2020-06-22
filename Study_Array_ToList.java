package Atype;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Study_Array_ToList {

	public static void main(String[] args) {
		int[] arr = {3, 2, 0, 1, 4};
		
		// 반드시 배열이 정렬된 상태에서 검색해야 함.
		Arrays.sort(arr);
		int idx = Arrays.binarySearch(arr, 2);
		System.out.println(Arrays.toString(arr));
		System.out.println("idx: " + idx);
		
		//ArrayList -> Integer로 변환
		ArrayList<Integer> list = new ArrayList<>();
		list.add(30);
		list.add(10);
		list.add(20);
		
		int[] newArr = new int[list.size()];
		
		// Integer를 int로 변환
		//Integer[] integer = list.toArray(new Integer[0]);
		//for(int i=0; i<integer.length; i++)
		//	newArr[i] = integer[i];		
		
		for(int i=0; i<list.size(); i++)
			newArr[i] = list.get(i);		// 오토 언박싱
		
		System.out.println(Arrays.toString(newArr));
	}

}

package Atype;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Study_Array_ToList {

	public static void main(String[] args) {
		int[] arr = {3, 2, 0, 1, 4};
		
		// �ݵ�� �迭�� ���ĵ� ���¿��� �˻��ؾ� ��.
		Arrays.sort(arr);
		int idx = Arrays.binarySearch(arr, 2);
		System.out.println(Arrays.toString(arr));
		System.out.println("idx: " + idx);
		
		//ArrayList -> Integer�� ��ȯ
		ArrayList<Integer> list = new ArrayList<>();
		list.add(30);
		list.add(10);
		list.add(20);
		
		int[] newArr = new int[list.size()];
		
		// Integer�� int�� ��ȯ
		//Integer[] integer = list.toArray(new Integer[0]);
		//for(int i=0; i<integer.length; i++)
		//	newArr[i] = integer[i];		
		
		for(int i=0; i<list.size(); i++)
			newArr[i] = list.get(i);		// ���� ��ڽ�
		
		System.out.println(Arrays.toString(newArr));
	}

}

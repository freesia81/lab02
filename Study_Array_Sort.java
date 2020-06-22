package Atype;

import java.util.Arrays;

public class Study_Array_Sort {
	
	public void solution(String[] input) {
		Arrays.sort(input);
		
		System.out.println(Arrays.toString(input));
	}
	
	
	public static void main(String[] args) {
		Study_Array_Sort s = new Study_Array_Sort();
		
		String[] name = new String[3];	// String[] name = {"Park", "Yi", "Kim"};
		name[0] = new String("Park");
		name[1] = new String("Yi");
		name[2] = new String("Kim");
		
		s.solution(name);
	}
}

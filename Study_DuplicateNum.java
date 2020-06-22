package Atype;

public class Study_DuplicateNum {

	//문제: 0~9까지 숫자 중 한번씩만 사용되었는지 검사
	public boolean solution(String input) {
		boolean result = true;
		
		char[] chArr = input.toCharArray();
		for(int i=0; i<chArr.length; i++) {
			if (input.substring(i+1).indexOf(chArr[i]) != -1) {		// 중복데이터 존재
				result = false;
				break;
			}
		}
		
		return result;
	}
	
	public static void main(String[] args) {
		Study_DuplicateNum s = new Study_DuplicateNum();
		System.out.println(s.solution("0123456789"));
		System.out.println(s.solution("01234"));
		System.out.println(s.solution("01234567890"));
		System.out.println(s.solution("6789012345"));
		System.out.println(s.solution("012322456789"));
		System.out.println(s.solution("12587985630"));

	}

}

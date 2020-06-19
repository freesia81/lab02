package Atype;

import java.util.Arrays;

class Solution2 {
    public boolean solution(int[] arr) {
        boolean answer = true;

        // 배열 정렬
        Arrays.sort(arr);
    
        // 순차적인지 비교
        for(int i=0; i<arr.length; i++) {
            if ( arr[i] != i+1) {
                answer = false;
                break;
            }
        }
        return answer;
    }
}

public class Q02_NoDuplicateNum {
	public static void main(String[] args) {
		Solution2 sol = new Solution2();
		
		int[] arr = {4, 1, 3, 2};
		System.out.println(sol.solution(arr));
		
		arr = new int[] {4, 1, 3}; 
		System.out.println(sol.solution(arr));
		
	}

}

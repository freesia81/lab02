package Atype;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

public class Q08_Stack {

	public int[] solution(int n, int[][] arr) {
		int[] answer = {};
		
		// POP한 데이터를 list에 저장
		ArrayList<Integer> list = new ArrayList<Integer>();
		int data = -1;
		
		// 0번 스택은 중앙값 관리
		Stack<Integer>[] stack = new Stack[n+1];
		for(int i=0; i<n+1; i++) {
			stack[i] = new Stack<Integer>();
		}
		
		int stackIdx = 0;
		int value = 0;
		for(int i=0; i < arr.length; i++) {
			stackIdx = arr[i][0];
			value = arr[i][1];
			
			System.out.println("(" + stackIdx + "," + value + ")");
			
			if (value >= 0) {
				// PUSH 수행
				if (stack[0].isEmpty()) {
					stack[0].push(value);
					//System.out.println("중앙값: " + value);
				}
				else {
					stack[stackIdx].push(value);
					//System.out.println(stackIdx + "스택 : PUSH(" + value + ")");
				}
			}
			else {
				// POP 수행
				if ( stack[stackIdx].isEmpty() ) {
					// 스택이 비어 중앙값밖에 없으면 중앙값을 POP
					data = stack[0].pop();
					System.out.println("중앙값 : POP(" + data + ")");
					list.add(data);

					// 다른 스택에서 중앙값 채우기
					for(int rot=1; rot <= n-1; rot++) {
						
						int targetIdx = (stackIdx + rot) % (n+1);
						if ( !stack[targetIdx].isEmpty() ) {
							data = stack[targetIdx].pop();
							//System.out.println(targetIdx + "스택 : POP(" + data + ")");
							
							stack[0].push(data);
							System.out.println("중앙값 변경: " + data);
							break;
						}
					}
				}
				else {
					// 스택에 데이터가 있으면
					data = stack[stackIdx].pop();
					System.out.println(stackIdx + "스택 : POP(" + data + ")");
					list.add(data);
				}
			}	
			
		}
		
		// ArrayList를 int배열로 변경		
		answer = new int[list.size()];
		for(int i=0; i<list.size(); i++)
			answer[i] = list.get(i).intValue();

		return answer;
	}
	
	public static void main(String[] args) {
		int n = 3;	// Stack 개수
		int[][] arr = {{1, 4}, {2, 2}, {3, 5}, {3, 6}, {1, -1}, {3, -1}, {2, -1}};

		Q08_Stack s = new Q08_Stack();
		System.out.println(Arrays.toString(s.solution(n, arr)));
	}

}

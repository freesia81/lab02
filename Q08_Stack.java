package Atype;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

public class Q08_Stack {

	public int[] solution(int n, int[][] arr) {
		int[] answer = {};
		
		// POP�� �����͸� list�� ����
		ArrayList<Integer> list = new ArrayList<Integer>();
		int data = -1;
		
		// 0�� ������ �߾Ӱ� ����
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
				// PUSH ����
				if (stack[0].isEmpty()) {
					stack[0].push(value);
					//System.out.println("�߾Ӱ�: " + value);
				}
				else {
					stack[stackIdx].push(value);
					//System.out.println(stackIdx + "���� : PUSH(" + value + ")");
				}
			}
			else {
				// POP ����
				if ( stack[stackIdx].isEmpty() ) {
					// ������ ��� �߾Ӱ��ۿ� ������ �߾Ӱ��� POP
					data = stack[0].pop();
					System.out.println("�߾Ӱ� : POP(" + data + ")");
					list.add(data);

					// �ٸ� ���ÿ��� �߾Ӱ� ä���
					for(int rot=1; rot <= n-1; rot++) {
						
						int targetIdx = (stackIdx + rot) % (n+1);
						if ( !stack[targetIdx].isEmpty() ) {
							data = stack[targetIdx].pop();
							//System.out.println(targetIdx + "���� : POP(" + data + ")");
							
							stack[0].push(data);
							System.out.println("�߾Ӱ� ����: " + data);
							break;
						}
					}
				}
				else {
					// ���ÿ� �����Ͱ� ������
					data = stack[stackIdx].pop();
					System.out.println(stackIdx + "���� : POP(" + data + ")");
					list.add(data);
				}
			}	
			
		}
		
		// ArrayList�� int�迭�� ����		
		answer = new int[list.size()];
		for(int i=0; i<list.size(); i++)
			answer[i] = list.get(i).intValue();

		return answer;
	}
	
	public static void main(String[] args) {
		int n = 3;	// Stack ����
		int[][] arr = {{1, 4}, {2, 2}, {3, 5}, {3, 6}, {1, -1}, {3, -1}, {2, -1}};

		Q08_Stack s = new Q08_Stack();
		System.out.println(Arrays.toString(s.solution(n, arr)));
	}

}

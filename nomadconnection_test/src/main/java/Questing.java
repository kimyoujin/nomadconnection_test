package main.java;

import java.util.Stack;

/**
 * 테스트 코드를 보고, 아래 두 method 를 작성해주세요.
 */
public class Questing {
	public static int quest1(double d)  {
		// FIXME
		int num = ((int) d) /2;
		return num;
	}

	public static boolean quest2(String s) {
		// FIXME
		Stack<Character> stack = new Stack<>();
		char[] input = s.toCharArray(); //5		
		String opened = "({[";
		String closed = ")}]";
		
		// 입력된 괄호를 길이만큼 돌려서 오픈괄호이면 스택에 저장
		for(int i=0; i<input.length; i++){
			if(opened.indexOf(input[i])!=-1){
				stack.push(input[i]);
			}else{
				if(closed.indexOf(input[i])!=opened.indexOf(stack.peek())){
					return false; // } 이게 들어왔는데 이거의 1, 스택에서도 1
				}else{
					stack.pop(); // 같으면 { 빼기
				}
			}
		}
		
		if(stack.empty()){
			return true;
		}else{
			return false;
		}
	}
}

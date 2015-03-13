/*Michael Womack
 * CS 3401-01
 * Assignment 3
 * 1/31/15     
 */
package hw;

import java.util.Stack;

public class InfixToPostfix {

	public static void main(String[] args) {
		
		System.out.println(infixToPostfix("(1+2)*3"));

	}
	public static String infixToPostfix(String s){
		if (s == null)
			throw new IllegalArgumentException();
		
		Stack<Character> operator = new Stack<>();
		String result = "";
		
		for(int i = 0; i < s.length(); i++){
		
			if (isOperator(s.charAt(i))){
				if((s.charAt(i) == '+' || s.charAt(i) == '-')){
					if(operator.isEmpty()){
						operator.push(s.charAt(i));
					}
					else if(operator.peek() == '*'|| operator.peek() == '/'){
						while(!operator.isEmpty())
							result += operator.pop();
						operator.push(s.charAt(i));
					}
					else
						operator.push(s.charAt(i));	
				}
				else if(s.charAt(i) == '*' || s.charAt(i) == '/'){
					operator.push(s.charAt(i));
				}
				else if(s.charAt(i) == '('){
					operator.push(s.charAt(i));
				}
					
				else if(s.charAt(i) == ')'){
					while(!operator.isEmpty()){
						result += operator.pop();
						if(operator.pop() == '(')
							break;
					}
				}
			}
			else if(isOperand(s.charAt(i))){
				result += s.charAt(i);
			}
				
		 			
		}//for loop	
		while(!operator.isEmpty())
			result += operator.pop(); 
		
		return result;
	}

	private static boolean isOperator(char s) {
		switch (s){
			case '+': 
			case '-': 
			case '*': 
			case '/':
			case '(':
			case ')':return true;
			default: return false;
		}	
	}

	private static boolean isOperand(char s) {
	
		if(Character.isDigit(s))
			return true;
		else
		return false;
	}

}

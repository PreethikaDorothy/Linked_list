package Problems;

import java.util.HashMap;
import java.util.NoSuchElementException;

import LinkedList.LinkedListHelper;

/**
 * @author SESA366037
 * 
 * @param <T>
 *            Generic type
 */
public class Parenthesis {

	/**
	 * @param stack
	 *            - To add and remove elements from the stack
	 * @param symbol
	 *            - String to be checked for balanced Parenthesis
	 * @return
	 */
	public boolean checkParenthesis(Stack<Character> stack, String symbol) {
		HashMap<Character, Character> hm = new HashMap<Character, Character>();
		hm.put('}', '{');
		hm.put(')', '(');
		hm.put(']', '[');
		char[] symbol_char = symbol.toCharArray();
		for (int count = 0; count < symbol.length(); count++) {
			// check if Stack is empty
			if (stack.stackEmpty())
				stack.push(symbol_char[count]);
			// Check if the pair is present
			else if (hm.containsKey(symbol_char[count])
					&& stack.stackTop() == hm.get(symbol_char[count]))
				stack.pop();
			else
				stack.push(symbol_char[count]);

		}
		// check if stack is empty
		if (stack.stackEmpty()) {
			return true;
		} else {
			return false;
		}
	}
}
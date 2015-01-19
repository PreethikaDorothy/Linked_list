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
	 * @param l
	 *            List object to traverse the list elements
	 * @return
	 */
	public boolean checkParenthesis(LinkedListHelper<Character> l,
			Stack<Character> stack, String symbol) {
		HashMap<Character,Character> hm = new HashMap<Character,Character>();
		hm.put('}', '{');
		hm.put(')', '(');
		hm.put(']', '[');
		char[] symbol_char = symbol.toCharArray();
		for (int count = 0; count < symbol.length(); count++) {

			if (l.IsEmpty())
				stack.push(l, symbol_char[count]);
			else if (hm.containsKey(symbol_char[count])
					&& stack.stackTop(l) == hm.get(symbol_char[count]))
				stack.pop(l);
			else
				stack.push(l, symbol_char[count]);

		}
		if (l.getSize() == 0) {
			return true;
		} else {
			return false;
		}
	}
}
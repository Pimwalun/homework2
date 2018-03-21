package homework2;

import java.util.ArrayList;
import java.util.List;

/**
 * Solution to problem 3 and 4.
 * @author Pimwalun Witchawanitchanun
 *
 */
public class Recursion {

	/**
	 * Remove duplicate consecutive items from a list, changing the list parameter.
	 * For example, if list = { a, b, b, b, c, b, c, c} then after calling unique
	 * the list will contain {a, b, c, b, c}. Only consecutive duplicates are
	 * removed. Objects are compared using their own equals method.
	 * @param list of any kind of object. The elements are not null.
	 * @return reference to the list parameter with consecutive duplicates removed.
	 */
	public static List<?> unique(List<?> list) {
		List<?> subList = list.subList(1, list.size());
		if (list.size() <= 1) return list;
		if (list.get(0).equals(list.get(1))) {
			subList.remove(0);
			unique(list);
		} else unique(subList);
		return list;
	}

	/**
	 * Print list
	 * @param unique of any kind of object. The elements are not null.
	 */
	public static void printList(List<?> unique) {
		for (Object list : unique) {
			System.out.print(list + ", ");
		}

	}
	
	/**
	 * Return value from method helperFibonacci() is fibonacci number.
	 * @param n is position where we want to know.
	 * @return value from method helperFibonacci() is fibonacci number.
	 */
	public static long fibonacci(int n) {
		long[] num = new long[n+1];
		return helperFibonacci(n, num);
	}
	
	/**
	 * Return fibonacci number.
	 * @param n is position where we want to know.
	 * @param num use to keep value of n.
	 * @return fibonacci number.
	 */
	public static long helperFibonacci(int n, long[] num) {
		if(n <= 1)
			return num[n] = n;
		num[n] = helperFibonacci(n-1, num) + num[n-2];
		return num[n];
	}
	
//	public static void main(String[] args) {
//		List<String> list = new ArrayList<String>();
//		list.add("a");
//		list.add("b");
//		list.add("b");
//		list.add("b");
//		list.add("c");
//		list.add("b");
//		list.add("c");
//		list.add("c");
//		printList(unique(list));
//		System.out.println(fibonacci(49));
//	}
}
package question;

import java.util.Deque;
import java.util.LinkedList;

public class Q9_2 {

	public static void main(String[] args) {

		MyStack<Integer> stack= new MyStack<>();
		stack.push(1);
		stack.push(2);
		System.out.println(stack.pop());
		stack.push(3);
		stack.push(4);
		System.out.println(stack.pop());
		stack.push(5);
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
	}
}

class MyStack<T> {
	private Deque<T> que1 = new LinkedList<T>();
	private Deque<T> que2 = new LinkedList<T>();

	public void push(T ele) {
		if (que2.isEmpty()) {
			que1.offer(ele);
		} else {
			que2.offer(ele);
		}
	}

	public T pop() {
		if (!que1.isEmpty()) {
			while (que1.size() > 1) {
				T poll = que1.poll();
				que2.offer(poll);
			}
			return que1.poll();
		}
		
		if (!que2.isEmpty()) {
			while (que2.size() > 1) {
				T poll = que2.poll();
				que1.offer(poll);
			}
			return que2.poll();
		}
		
		System.out.println("no ele");
		return null;
	}

}
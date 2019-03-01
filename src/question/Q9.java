package question;

import java.util.Deque;
import java.util.LinkedList;

public class Q9 {

	public static void main(String[] args) throws Exception {
		MyQueue que = new MyQueue();
		que.appendTail(1);
		que.appendTail(2);
		System.out.println(que.deleteHead());
		que.appendTail(3);
		que.appendTail(4);
		System.out.println(que.deleteHead());
		que.appendTail(5);
		System.out.println(que.deleteHead());
		System.out.println(que.deleteHead());
		System.out.println(que.deleteHead());
		System.out.println(que.deleteHead());
		System.out.println(que.deleteHead());
		System.out.println(que.deleteHead());
	}

}

class MyQueue<T> {

	private Deque<T> stack1 = new LinkedList<>();
	private Deque<T> stack2 = new LinkedList<>();

	public void appendTail(T ele) {
		stack1.push(ele);
	}

	public Object deleteHead() throws Exception {
		if (stack2.isEmpty()) {
			while (!stack1.isEmpty()) {
				stack2.push(stack1.pop());
			}
		}
		if(stack2.isEmpty()) {
			System.out.println("The Queue is empty");
			return null;
		}
		
		return stack2.pop();
	}

}
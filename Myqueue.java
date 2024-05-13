package question3;
import java.util.Stack;

public class Myqueue {

	public class QueueUsingTwoStacks {
		
		    Stack<Integer> inbox;
		    Stack<Integer> outbox;

		    public QueueUsingTwoStacks() {
		        inbox = new Stack<>();
		        outbox = new Stack<>();
		    }

		    public void enqueue(int value) {
		        inbox.push(value);
		    }

		    public int dequeue() {
		        if (outbox.isEmpty()) {
		            while (!inbox.isEmpty()) {
		                outbox.push(inbox.pop());
		            }
		        }
		        return outbox.isEmpty() ? -1 : outbox.pop();
		    }

		    public int peek() {
		        if (outbox.isEmpty()) {
		            while (!inbox.isEmpty()) {
		                outbox.push(inbox.pop());
		            }
		        }
		        return outbox.isEmpty() ? -1 : outbox.peek();
		    }

		    public boolean isEmpty() {
		        return inbox.isEmpty() && outbox.isEmpty();
		    }

		    public static void main(String[] args) {
		        QueueUsingTwoStacks queue = new QueueUsingTwoStacks();
		        queue.enqueue(2);
		        queue.enqueue(4);
		        queue.enqueue(9);

		        System.out.println("Dequeue: " + queue.dequeue()); 
		        System.out.println("Peek: " + queue.peek()); 
		        System.out.println("Dequeue: " + queue.dequeue()); 
		        System.out.println("Is queue empty" + queue.isEmpty()); 
		    }
	}
}



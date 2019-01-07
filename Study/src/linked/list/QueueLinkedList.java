package linked.list;

import node.Node;
import structures.Queue;

public class QueueLinkedList implements Queue
{
	public Node queue;
	
	public QueueLinkedList()
	{
		queue = null;
	}
	
	public QueueLinkedList(Object value)
	{
		queue = new Node(value);
	}
	

	public boolean enqueue(Object value) {
		boolean success = false;
		
		Node node = new Node(value);
		
		// empty case
		if(queue == null)
		{
			queue = node;
			return true;
		}
		
		else
		{
			Node current = queue;			
			while(current.getNext() != null)
			{
				current = current.getNext();
			}
			
			current.setNext(node);
			success = true;
		}

		return success;
	}

	// Removes object at front of the list
	public Object dequeue() {
		
		// empty list case
		if (queue == null)
		{
			return null;
		}
		
		else
		{
			Node popped = queue;
			queue = queue.getNext();
			return popped;
		}
	}
	
	protected Object getFirstValue()
	{
		return queue.getValue();
	}
	
	protected Object getLastValue()
	{
		if(queue == null)
			return null;
		
		Node current = queue;			
		while(current.getNext() != null)
		{
			current = current.getNext();
		}
		
		return current.getValue();
	}
}

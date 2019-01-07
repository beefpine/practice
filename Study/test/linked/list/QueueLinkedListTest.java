package linked.list;

import static org.junit.Assert.assertTrue;
import node.Node;

import org.junit.Before;
import org.junit.Test;

public class QueueLinkedListTest 
{
	
	private QueueLinkedList queue;

	
	public final static int VALUE_1 = 1;
	public final static int VALUE_2 = 2;
	
	@Before
	public void before()
	{
		queue = new QueueLinkedList();
	}
	
	
	
	@Test
	// Test enqueue empty list
	public void testEnqueueEmptyList()
	{
		boolean result = false;
		
		result = queue.enqueue(VALUE_1);
		assertTrue(result);
		assertTrue(queue != null);
		assertTrue(queue.getFirstValue().equals(VALUE_1));
		assertTrue(queue.getLastValue().equals(VALUE_1));	
	}
	
	@Test
	// Test enqueue non-empty list
	public void testEnqueue()
	{
		boolean result = false;
		
		result = queue.enqueue(VALUE_1);
		assertTrue(result);
		assertTrue(queue != null);
		assertTrue(queue.getFirstValue().equals(VALUE_1));
		assertTrue(queue.getLastValue().equals(VALUE_1));	
		
		result = queue.enqueue(VALUE_2);
		assertTrue(result);
		assertTrue(queue != null);
		assertTrue(queue.getFirstValue().equals(VALUE_1));
		assertTrue(queue.getLastValue().equals(VALUE_2));	
	}
	
	@Test
	// Test dequeue empty list
	public void testDequeueEmptyList()
	{
		assertTrue(queue.dequeue() == null);
	}
	
	@Test
	// Test dequeue
	public void testDequeue()
	{
		Node popped = null;
		
		queue.enqueue(VALUE_1);		
		queue.enqueue(VALUE_2);

		popped = (Node)queue.dequeue();
		assertTrue(popped.getValue().equals(VALUE_1));		
		assertTrue(queue.getFirstValue().equals(VALUE_2));
		assertTrue(queue.getLastValue().equals(VALUE_2));	
		
	}


	
}

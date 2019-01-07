package node;


public class Node 
{
	private Object value;
	private Node next;
	
	public Node(Object value) 
	{
		this.value = value;
		this.next = null;
	}
	public Object getValue()
	{
		return this.value;
	}
	public void setValue(Object obj)
	{
		this.value = obj;
	}
	public Node getNext()
	{
		return this.next;
	}
	public void setNext(Node node)
	{
		this.next = node;
	}
	
}

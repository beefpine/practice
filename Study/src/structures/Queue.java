package structures;

// First In, First Out
public interface Queue 
{
	/**
	 * Adds new object to end of the list
	 * 
	 * @param  value to be inserted at the end of the queue
	 * @return boolean indicating whether the enqueue was successful
	 * */
	public boolean enqueue (Object value);

	/**
	 * Removes object at the front of the list
	 * 
	 * @return Object at the front of the list
	 * */
	public Object dequeue ();
}

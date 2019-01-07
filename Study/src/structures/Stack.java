package structures;

// First In, Last Out
public interface Stack 
{
	// Add object to top of stack
	public boolean push(Object obj); 
		
	// Remove object from top of stack
	public Object pop();
}

/**
 * 
 */
package structures;

/**
 * @author nocho
 *
 */
public interface Tree 
{
	public boolean add(Object node);
		
	public Object remove(Object value);
	
	public Object get(Object value);
		
	public int getHeight();
}

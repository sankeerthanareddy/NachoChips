
public class NachoChipsIterator implements NachoIterator {
	
String flavors[];
	
	int numberofnachochips;
	public NachoChipsIterator(String [] flavors)
	{
		this.flavors=flavors;
		
	}
	public boolean hasNext()
	{
		if(numberofnachochips<flavors.length)
		{
			return true;
		}
		return false;
	}
	
	public Object next()
	{
		if(this.hasNext())
		{
			return flavors[numberofnachochips++];
		}
		return null;
	}

}

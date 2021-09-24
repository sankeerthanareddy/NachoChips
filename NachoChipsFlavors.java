
public class NachoChipsFlavors implements NachoFlavors {
	
public String flavors[] = {"Spicy Sweet Chilli" , "Salty" ,"Cheese" , "Black Pepper", "Cool Ranch"};
	
	
	public NachoIterator createNachoIterator()
	{
		return new NachoChipsIterator(flavors);
	}

}

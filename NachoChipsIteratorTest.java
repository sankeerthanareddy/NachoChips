
public class NachoChipsIteratorTest {
	
	
	public static void main(String[] args) 
	{
	      NachoChipsFlavors nacho = new NachoChipsFlavors();
	      NachoChipsDetails nachodetail = new NachoChipsDetails();

	      for(NachoIterator nachoiter = nacho.createNachoIterator(); nachoiter.hasNext();){
	         String flavor = (String)nachoiter.next();
	         System.out.println(" Details of Nacho Chip Flavor are as follows \n Flavor ======> " + flavor);
	         System.out.println("Price Destails =====>  "+ nachodetail.getPrice()); 
	         System.out.println("Manufacturing Date =====> " + nachodetail.mfgDate());
	         System.out.println("Expiry Date =======> " + nachodetail.expiryDate());
	         System.out.println("\n\n\n");
	         
	      } 	
	   }

}

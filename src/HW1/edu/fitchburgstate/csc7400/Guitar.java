/**
 * Class: Object-Oriented Design and Analysis
 * Professor: Orlando Montalvo
 * Assignment: HW 1
 * Student: Navya Inampudi
 * 
 * Date: 2018-09-03
 */

package HW1.edu.fitchburgstate.csc7400;

/**
 * Guitar contains the information needed to keep track of a type of guitar from
 * Rick's music store
 * 
 * @author HeadFirstOODA
 *
 */
public class Guitar {

	private String serialNumber;
	private String model;
	private GuitarSpec guitarSpec;
	
	/**
	 * Constructor to instantiate the Guitar Object
	 * 
	 * @param serialNumber manufacturer serial number
	 * @param price store price
	 * @param guitarSpec contains guitar specs such as topWood, backWood, manufacturer
	 */
	public Guitar(String serialNumber, double price,
			GuitarSpec guitarSpec) {
		this.serialNumber = serialNumber;
		this.price = price;
		this.guitarSpec = guitarSpec;
	}
	
	/**
	 * returns guitarSpec Object, contains information about below 
	 * 		- Manufacturer the guitar's manufacturer
	 * 		- Model the manufacturers model
	 * 		- Type guitar type (electric/accoustic)
	 * 		- Backwood the wood used for the guitar body
	 * 		- TopWood the wood used for the guitar's face
	 */
	public GuitarSpec getGuitarSpec() {
		return guitarSpec;
	}

	/**
	 * Set GuitarSpec Object
	 */
	public void setGuitarspec(GuitarSpec guitarspec) {
		this.guitarSpec = guitarspec;
	}
	
	/**
	 * Retrieve Serial Number for the specified Guitar
	 */
	public void setSerialNumber(String serialNumber) {
		this.serialNumber = serialNumber;
	}

	/**
	 * Set the model of the Guitar
	 */
	public void setModel(String model) {
		this.model = model;
	}

	/**
	 * Default Constructor
	 */
	public Guitar() {
		
	}

	/**
	 * Returns the manufacturer serial number
	 * 
	 * NB: Gets and sets do not need @params or @returns because they do one thing which
	 * is already in the comment
	 */
	public String getSerialNumber() {
		return serialNumber;
	}

	/**
	 * Returns store price of guitar
	 */
	public double getPrice() {
		return price;
	}

	/**
	 * Sets the store price of the guitar
	 */
	public void setPrice(double newPrice) {
		this.price = newPrice;
	}

	
	/**
	 * Returns the manufacturer model
	 */
	public String getModel() {
		return model;
	}

	
	/**
	 * Rick's price for the guitar
	 */
	private double price;
	
	/**
	 * Compares the Guitar Spec Object, if everything matches, returns true, else returns false
	 * 
	 * @param g pass GuitarSpec object
	 * @return true if a match found, else false
	 */
	public boolean match(GuitarSpec g) {
		boolean returnValue = false;
		
		if ( g == null )
			return returnValue;
		
		if ( g.getManufacturer() == this.guitarSpec.getManufacturer() && 
			 g.getModel() == this.guitarSpec.getModel() &&
			 g.getTopWood() == this.guitarSpec.getTopWood() &&
			 g.getBackWood() == this.guitarSpec.getBackWood() ) {
			returnValue = true;
		} 
		
		return returnValue;
	}
}

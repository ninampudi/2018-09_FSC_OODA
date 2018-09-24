/**
 * Class: Object-Oriented Design and Analysis
 * Professor: Orlando Montalvo
 * Assignment: HW 1
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

	private manufacturer manufacturer;
	private type type;
	private backWood backWood;
	private topWood topWood;
	private GuitarSpec guitarspec;
	
	public GuitarSpec getGuitarspec() {
		return guitarspec;
	}


	public void setGuitarspec(GuitarSpec guitarspec) {
		this.guitarspec = guitarspec;
	}


	/**
	 * Full constructor
	 * 
	 * @param serialNumber manufacturer serial number
	 * @param price store price
	 * @param manufacturer the guitar's manufacturer
	 * @param model the manufacturers model
	 * @param type guitar type (electric/accoustic)
	 * @param backWood the wood used for the guitar body
	 * @param topWood the wood used for the guitar's face
	 */
	public Guitar(String serialNumber, double price, 
			manufacturer manufacturer, String model, 
			type type, backWood backWood,
			topWood topWood) {
		this.serialNumber = serialNumber;
		this.price = price;
		this.manufacturer = manufacturer;
		this.model = model;
		this.type = type;
		this.backWood = backWood;
		this.topWood = topWood;
	}
	
	
	public void setSerialNumber(String serialNumber) {
		this.serialNumber = serialNumber;
	}


	public void setModel(String model) {
		this.model = model;
	}


	public Guitar() {
		// TODO Auto-generated constructor stub
	}


	public manufacturer getManufacturer() {
		return manufacturer;
	}


	public void setManufacturer(manufacturer manufacturer) {
		this.manufacturer = manufacturer;
	}


	public type getType() {
		return type;
	}


	public void setType(type type) {
		this.type = type;
	}


	public backWood getBackWood() {
		return backWood;
	}


	public void setBackWood(backWood backWood) {
		this.backWood = backWood;
	}


	public topWood getTopWood() {
		return topWood;
	}


	public void setTopWood(topWood topWood) {
		this.topWood = topWood;
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
	 * The guitars manufacturer serial number
	 */
	private String serialNumber;

	/**
	 * The name of the manufacturer
	 */
	public enum manufacturer{
		Fender,
		Martin,
		Gibson,
		Collings,
		Olson,
		Ryan,
		PRS
	}

	/**
	 * The manufacturer model number
	 */
	private String model;

	/**
	 * The guitar type (electric/acoustic)
	 */
	public enum type{
		Electric,
		Acoustic
	};

	/**
	 * The wood used for the back of the guitar
	 */
	public enum backWood{
		IndianRosewood,
		BrazilianRosewood,
		Mahogany,
		Maple,
		Cocobolo,
		Cedar,
		Adirondack,
		Alder,
		Sitka
	};

	/**
	 * The wood used for the face of the guitar
	 */
	public enum topWood{
		IndianRosewood,
		BrazilianRosewood,
		Mahogany,
		Maple,
		Cocobolo,
		Cedar,
		Adirondack,
		Alder,
		Sitka
	};

	/**
	 * Rick's price for the guitar
	 */
	private double price;
	
	public boolean match(GuitarSpec g) {
		if ((g.getManufacturer().equals(this.guitarspec.getManufacturer())) 
			&& 	(g.getModel().equals(this.guitarspec.getModel()))
			&& 	(g.getTopWood().equals(this.guitarspec.getTopWood()))
			&& 	(g.getBackWood().equals(this.guitarspec.getBackWood()))
				) {
			return true;
		} else {
			return false;
		}
		
	}
}

/**
 * Class: Object-Oriented Design and Analysis
 * Professor: Orlando Montalvo
 * Assignment: HW 1
 * Student: Navya Inampudi
 * 
 * Date: 2018-10-20
 */

package HW1.edu.fitchburgstate.csc7400;


/**
 * This class is a pojo class for GuitarSpec
 * @author Navya Inampudi
 *
 */
public class GuitarSpec {

	private manufacturer manufacturer;
	private type type;
	private backWood backWood;
	private topWood topWood;
	private String model;
	
	/**
	 * Default constructor
	 */
	public GuitarSpec() {
		super();
	}

	/**
	 * Constructor, to instantiate GuitarSpec with below paramaters of Guitar
	 * @param manufacturer the guitar's manufacturer
	 * @param type guitar type (electric/accoustic)
	 * @param backWood the wood used for the guitar body
	 * @param topWood the wood used for the guitar's face
	 * @param model the manufacturers model
	 */
	public GuitarSpec(manufacturer manufacturer,
			type type,
			backWood backWood,
			topWood topWood, 
			String model) {
		super();
		this.manufacturer = manufacturer;
		this.type = type;
		this.backWood = backWood;
		this.topWood = topWood;
		this.model = model;
	}


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
	 * Return the Manufacturer of the Guitar
	 */
	public manufacturer getManufacturer() {
		return manufacturer;
	}
	
	
	/**
	 * Set the Manufacturer of the Guitar
	 */
	public void setManufacturer(manufacturer manufacturer) {
		this.manufacturer = manufacturer;
	}
	
	
	/**
	 * Return type of the Guitar i.e., Acoustic Or Electric
	 */
	public type getType() {
		return type;
	}
	
	
	/**
	 *  Set type of the Guitar.
	 */
	public void setType(type type) {
		this.type = type;
	}
	
	
	/**
	 * Return the wood used on the back of the Guitar
	 * 
	 */
	public backWood getBackWood() {
		return backWood;
	}
	
	
	/**
	 * Set the wood used on the back of the Guitar
	 */
	public void setBackWood(backWood backWood) {
		this.backWood = backWood;
	}
	
	
	/**
	 * Return the wood used on the face of the Guitar
	 */
	public topWood getTopWood() {
		return topWood;
	}
	
	
	/**
	 * Set the wood used on the face of the Guitar
	 */
	public void setTopWood(topWood topWood) {
		this.topWood = topWood;
	}
	
	
	/**
	 * Return the Manufacturer model of the Guitar
	 */
	public String getModel() {
		return model;
	}
	
	
	/**
	 * Set the Manufacturer model of the Guitar
	 */
	public void setModel(String model) {
		this.model = model;
	}
	
}

package HW1.edu.fitchburgstate.csc7400;

import HW1.edu.fitchburgstate.csc7400.Guitar.backWood;
import HW1.edu.fitchburgstate.csc7400.Guitar.manufacturer;
import HW1.edu.fitchburgstate.csc7400.Guitar.topWood;
import HW1.edu.fitchburgstate.csc7400.Guitar.type;

/**
 * @author Navya Inampudi
 * This class is a pojo class for GuitarSpec
 *
 */
/**
 * @author Virat Samarth
 *
 */
public class GuitarSpec {

	private manufacturer manufacturer;
	private type type;
	private backWood backWood;
	private topWood topWood;
	private String model;
	
	/**
	 * Get method for Manufacturer
	 * @return
	 */
	public manufacturer getManufacturer() {
		return manufacturer;
	}
	
	
	/**
	 * Set method for Manufacturer
	 * @param manufacturer
	 */
	public void setManufacturer(manufacturer manufacturer) {
		this.manufacturer = manufacturer;
	}
	
	
	/**
	 * Get type for Type
	 * @return
	 */
	public type getType() {
		return type;
	}
	
	
	/**
	 * Set method for type
	 * @param type
	 */
	public void setType(type type) {
		this.type = type;
	}
	
	
	/**
	 * Get method for BackWood
	 * @return
	 */
	public backWood getBackWood() {
		return backWood;
	}
	
	
	/**
	 * Set method for Backwood
	 * @param backWood
	 */
	public void setBackWood(backWood backWood) {
		this.backWood = backWood;
	}
	
	
	/**
	 * Get method for TopWood
	 * @return
	 */
	public topWood getTopWood() {
		return topWood;
	}
	
	
	/**
	 * Set method for TopWood
	 * @param topWood
	 */
	public void setTopWood(topWood topWood) {
		this.topWood = topWood;
	}
	
	
	/**
	 * Get method for Model
	 * @return
	 */
	public String getModel() {
		return model;
	}
	
	
	/**
	 * Set method for Model
	 * @param model
	 */
	public void setModel(String model) {
		this.model = model;
	}
	
}

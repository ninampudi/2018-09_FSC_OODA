/**
 * Class: Object-Oriented Design and Analysis
 * Professor: Orlando Montalvo
 * Assignment: HW 1
 * Student: Navya Inampudi
 * 
 * Date: 2018-10-20
 */
package HW1.edu.fitchburgstate.csc7400;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import HW1.edu.fitchburgstate.csc7400.GuitarSpec.backWood;
import HW1.edu.fitchburgstate.csc7400.GuitarSpec.manufacturer;
import HW1.edu.fitchburgstate.csc7400.GuitarSpec.topWood;
import HW1.edu.fitchburgstate.csc7400.GuitarSpec.type;

/**
 * Inventory keeps a searchable collection of Guitars. It is meant to be use
 * to find matching guitars for customers. 
 * 
 * @author orlando
 * @author Navya Inampudi
 * @version 2.0
 */
public class Inventory {
  public List<Guitar> guitars = new LinkedList<Guitar>();
  
  public GuitarSpec testGuitarSpec, testGuitarSpec2;
  
  /**
   * 
   * @param serialNumber mention the serial number for the Guitar
   * @param price mention the price of the Guitar
   * @param guitarSpec provide specs for the Guitar, which may include
   * 		 - Manufacturer
   * 		 - Model
   * 		 - Topwood
   * 		 - BackWood
   * 	
   */
  public void addGuitar(String serialNumber, double price,
                        GuitarSpec guitarSpec) {
    
	  Guitar guitar = new Guitar(serialNumber, price, guitarSpec);
	  guitars.add(guitar);
  }
  
  /**
   * Retrieves the Guitar from the inventory based on the serialNumber of the Guitar
   */
  public Guitar getGuitar(String serialNumber) {
	  for (Iterator i = guitars.iterator(); i.hasNext(); ) {
		  Guitar guitar = (Guitar)i.next();
		  if (guitar.getSerialNumber().equals(serialNumber)) 
			  return guitar;
	  }
	  return null;
  }
  
  /**
   * This will search the inventory for the Guitar based on any combination of Guitar Specs
   * If a match found, returns the Guitar, Else Null
   * @param searchGuitar provide Guitar specs to search the inventory
   * 
   */
  public Guitar search(GuitarSpec searchGuitarSpec) {
	  
	  if (searchGuitarSpec == null)
		  return null;
	  
	  for (Iterator<Guitar> i = guitars.iterator(); i.hasNext(); ) {
		  Guitar guitar = (Guitar)i.next();
		  GuitarSpec guitarSpec = guitar.getGuitarSpec();
		  
	      // Ignore serial number since that's unique
	      // Ignore price since that's unique
		  // Remove empty string check for enums
		  
	      manufacturer builder = searchGuitarSpec.getManufacturer();
	      if ( builder != null && !(builder == guitarSpec.getManufacturer()) )
	        continue;
	      
	      String model = searchGuitarSpec.getModel();
	      if ( model != null && !model.equals("") && !model.equals(guitarSpec.getModel()) )
	        continue;
	      
	      type type = searchGuitarSpec.getType();
	      if ( type != null && !(type == guitarSpec.getType()) )
	        continue;
	      
	      backWood backWood = searchGuitarSpec.getBackWood();
	      if ( backWood != null && !(backWood == guitarSpec.getBackWood()) )
	        continue;
	      
	      topWood topWood = searchGuitarSpec.getTopWood();
	      if ( topWood != null && !(topWood == guitarSpec.getTopWood()) )
	        continue;
	      
	      return guitar;
	  }
	  return null;
  }
  
}

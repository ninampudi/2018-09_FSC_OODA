/**
 * Class: Object-Oriented Design and Analysis
 * Professor: Orlando Montalvo
 * Assignment: HW 1
 * 
 * Student: Navya Inampudi
 * Date: 2018-09-03
 */

package HW1;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 * Inventory keeps a searchable collection of Guitars. It is meant to be use
 * to find matching guitars for customers. 
 * 
 * @author orlando
 * @author Navya Inampudi
 * @version 2.0
 */
public class Inventory {
  private List<Guitar> guitars = new LinkedList<Guitar>();
  
  /**
   * This is used to add the list of Guitars to the Inventory Class.
   * @param serialNumber serialNumber of the guitar in the store
   * @param price price of the guitar
   * @param builder manufacturer of the guitar
   * @param model manufacturer's model of the guitar
   * @param type type of the Guitar (i.e., Electric or Acoustic)
   * @param backWood Type of the wood used on the back of the Guitar.
   * @param topWood Type of the wood used on the face of the Guitar.
   */
  public void addGuitar(String serialNumber, double price,
                        String builder, String model,
                        String type, String backWood, String topWood) {
    Guitar guitar = new Guitar(serialNumber, price, builder,
                               model, type, backWood, topWood);
    guitars.add(guitar);
  }
  
  /**
   * Retrieves the Guitar from the inventory based on the serialNumber of the Guitar
   * 
   * @param serialNumber Retrieve the Guitar object based on the serialNumber from Inventory
   * @return return Guitar object if a match found
   */
  public Guitar getGuitar(String serialNumber) {
    for (Iterator i = guitars.iterator(); i.hasNext(); ) {
      Guitar guitar = (Guitar)i.next();
      if (guitar.getSerialNumber().equals(serialNumber)) {
        return guitar;
      }
    }
    return null;
  }
  
  /**
   * This will search the inventory for the Guitar based on any combination of Guitar Specs
   * If a match found, returns the Guitar, Else Null
   * @param searchGuitar provide Guitar specs to search the inventory
   * @return return Guitar object if a search found
   */
  public Guitar search(Guitar searchGuitar) {
    for (Iterator i = guitars.iterator(); i.hasNext(); ) {
      Guitar guitar = (Guitar)i.next();
      // Ignore serial number since that's unique
      // Ignore price since that's unique
      String builder = searchGuitar.getManufacturer();
      if ((builder != null) && (!builder.equals("")) &&
          (!builder.equals(guitar.getManufacturer())))
        continue;
      String model = searchGuitar.getModel();
      if ((model != null) && (!model.equals("")) &&
          (!model.equals(guitar.getModel())))
        continue;
      String type = searchGuitar.getType();
      if ((type != null) && (!searchGuitar.equals("")) &&
          (!type.equals(guitar.getType())))
        continue;
      String backWood = searchGuitar.getBackWood();
      if ((backWood != null) && (!backWood.equals("")) &&
          (!backWood.equals(guitar.getBackWood())))
        continue;
      String topWood = searchGuitar.getTopWood();
      if ((topWood != null) && (!topWood.equals("")) &&
          (!topWood.equals(guitar.getTopWood())))
        continue;
      return guitar;
    }
    return null;
  }
}

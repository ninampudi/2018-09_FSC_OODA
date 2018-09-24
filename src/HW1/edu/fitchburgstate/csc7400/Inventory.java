
package HW1.edu.fitchburgstate.csc7400;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import HW1.edu.fitchburgstate.csc7400.Guitar.backWood;
import HW1.edu.fitchburgstate.csc7400.Guitar.manufacturer;
import HW1.edu.fitchburgstate.csc7400.Guitar.topWood;
import HW1.edu.fitchburgstate.csc7400.Guitar.type;
/**
 * Inventory keeps a searchable collection of Guitars. It is meant to be use
 * to find matching guitars for customers. 
 * 
 * @author orlando
 * @version 2.0
 */
public class Inventory {
  public List<Guitar> guitars = new LinkedList<Guitar>();

  public void addGuitar(String serialNumber, double price,
                        manufacturer builder, String model,
                        type type, backWood backWood, topWood topWood) {
    Guitar guitar = new Guitar(serialNumber, price, builder,
                               model, type, backWood, topWood);
    guitars.add(guitar);
  }
  
  public void addGuitarUsingSpecs(String serialNumber, double price, GuitarSpec guitarspec) {
  		Guitar guitar = new Guitar();
  		guitar.setSerialNumber(serialNumber);
  		guitar.setPrice(100.00);
  		guitar.setGuitarspec(guitarspec);
  		guitars.add(guitar);
  }
  
  public Guitar getGuitar(String serialNumber) {
    for (Iterator i = guitars.iterator(); i.hasNext(); ) {
      Guitar guitar = (Guitar)i.next();
      if (guitar.getSerialNumber().equals(serialNumber)) {
        return guitar;
      }
    }
    return null;
  }
  public Guitar search(Guitar searchGuitar) {
    for (Iterator i = guitars.iterator(); i.hasNext(); ) {
      Guitar guitar = (Guitar)i.next();
      // Ignore serial number since that's unique
      // Ignore price since that's unique
      manufacturer builder = searchGuitar.getManufacturer();
      if ((builder != null) && (!builder.equals("")) &&
          (!builder.equals(guitar.getManufacturer())))
        continue;
      String model = searchGuitar.getModel();
      if ((model != null) && (!model.equals("")) &&
          (!model.equals(guitar.getModel())))
        continue;
      type type = searchGuitar.getType();
      if ((type != null) && (!searchGuitar.equals("")) &&
          (!type.equals(guitar.getType())))
        continue;
      backWood backWood = searchGuitar.getBackWood();
      if ((backWood != null) && (!backWood.equals("")) &&
          (!backWood.equals(guitar.getBackWood())))
        continue;
      topWood topWood = searchGuitar.getTopWood();
      if ((topWood != null) && (!topWood.equals("")) &&
          (!topWood.equals(guitar.getTopWood())))
        continue;
      return guitar;
    }
    return null;
  }
  
  public Guitar searchUsingSpecs(Guitar searchGuitar) {
	  
	    for (Iterator i = guitars.iterator(); i.hasNext(); ) {
	    	
	      Guitar guitar = (Guitar)i.next();
	      
	      if (
	    		  guitar.getGuitarspec().getBackWood().equals(searchGuitar.getGuitarspec().getBackWood())
	    		  && guitar.getGuitarspec().getManufacturer().equals(searchGuitar.getGuitarspec().getManufacturer())
	    		  && guitar.getGuitarspec().getTopWood().equals(searchGuitar.getGuitarspec().getTopWood())
	    		  && guitar.getGuitarspec().getModel().equals(searchGuitar.getGuitarspec().getModel())
	    		  ) {
	    	  

		      return guitar;
	      }
	    		  
	    		  
	     
	    }
	    return null;
	  }
}

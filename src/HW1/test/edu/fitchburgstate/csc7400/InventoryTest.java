/**
 * Class: Object-Oriented Design and Analysis
 * Professor: Orlando Montalvo
 * Assignment: HW 1
 * Student: Navya Inampudi
 * 
 * Date: 2018-10-20
 */

package HW1.test.edu.fitchburgstate.csc7400;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import HW1.edu.fitchburgstate.csc7400.GuitarSpec;
import HW1.edu.fitchburgstate.csc7400.Guitar;
import HW1.edu.fitchburgstate.csc7400.Inventory;
import HW1.edu.fitchburgstate.csc7400.GuitarSpec.manufacturer;
import HW1.edu.fitchburgstate.csc7400.GuitarSpec.type;
import HW1.edu.fitchburgstate.csc7400.GuitarSpec.topWood;
import HW1.edu.fitchburgstate.csc7400.GuitarSpec.backWood;

/**
 * JUnit Test for Inventory Class
 * @author Navya Inampudi
 * 
 */
class InventoryTest {
	
	Guitar testGuitar;
	
	GuitarSpec testGuitarSpec, addGuitarSpec, addGuitarSpec2;
	
	/**
	 * Instantiate testGuitar Object, to be used for Validating in below scenarios
	 * @throws Exception
	 */
	@BeforeEach
	void setUp() throws Exception {
		
		this.testGuitarSpec = new GuitarSpec(manufacturer.Martin, 
				type.Electric, 
				backWood.Maple, 
				topWood.Maple, 
				"Stratocaster");
		
		this.testGuitar = new Guitar("1700-400", 699.00, testGuitarSpec);
		
	}

	
	/**
	 * This method is to Test Add Guitar using JUnit Test
	 */
	@Test
	void testaddGuitar() {
		
		Guitar expected = this.testGuitar;
		Inventory TestObj = new Inventory();
		
		this.addGuitarSpec = new GuitarSpec(manufacturer.Martin, 
				type.Electric, 
				backWood.Maple, 
				topWood.Maple, 
				"Stratocaster");
		
		TestObj.addGuitar("1700-400", 699.00, addGuitarSpec);
		
		Guitar returned = TestObj.getGuitar("1700-400");
		assertSame(expected.getSerialNumber(), returned.getSerialNumber());
		assertEquals(1, TestObj.guitars.size());	
		
	}
	
	/**
	 * This method is to Test Add Multiple Guitar using JUnit Test
	 */
	@Test
	void testaddGuitarsMultiple() {
		Guitar expected = this.testGuitar;
		Inventory TestObj = new Inventory();
		
		this.addGuitarSpec = new GuitarSpec(manufacturer.Martin, 
				type.Electric, 
				backWood.Maple, 
				topWood.Maple, 
				"Stratocaster");
		this.addGuitarSpec2 = new GuitarSpec(manufacturer.Martin, 
				type.Electric, 
				backWood.Maple, 
				topWood.Maple, 
				"Stratocaster");
		
		TestObj.addGuitar("1700-400", 699.00, addGuitarSpec);
		
		Guitar returned = TestObj.getGuitar("1700-400");
		assertSame(expected.getSerialNumber(), returned.getSerialNumber());
		assertEquals(1, TestObj.guitars.size());	
		
		TestObj.addGuitar("1700-402", 699.00, addGuitarSpec2);
		
		assertEquals(2, TestObj.guitars.size());	
		
	}
	
	
	/**
	 * This method is to Test Get Guitar using JUnit Test
	 */
	@Test
	void testGetGuitars() {
		Guitar expected = this.testGuitar;
		Inventory TestObj = new Inventory();
		
		this.addGuitarSpec = new GuitarSpec(manufacturer.Martin, 
				type.Electric, 
				backWood.Maple, 
				topWood.Maple, 
				"Stratocaster");
		this.addGuitarSpec2 = new GuitarSpec(manufacturer.Martin, 
				type.Acoustic, 
				backWood.Maple, 
				topWood.Maple, 
				"Stratocaster");
		
		TestObj.addGuitar("1700-400", 699.00, addGuitarSpec);
		TestObj.addGuitar("1700-403", 699.00, addGuitarSpec2);
		
		Guitar returned = TestObj.getGuitar("1700-400");
		assertSame(expected.getSerialNumber(), returned.getSerialNumber());
		assertEquals(2, TestObj.guitars.size());	
		
	}
	
	
	/**
	 * This method is to Test the Search Guitar passing manufacturer using JUnit Test
	 */
	@Test
	void testSearchGuitars_manufacturer() {
		
		Inventory TestObj = new Inventory();
		GuitarSpec testGuitarSpec = new GuitarSpec();
		
		this.addGuitarSpec = new GuitarSpec(manufacturer.Martin, 
				type.Electric, 
				backWood.Maple, 
				topWood.Maple, 
				"Stratocaster");
		this.addGuitarSpec2 = new GuitarSpec(manufacturer.Gibson, 
				type.Acoustic, 
				backWood.Maple, 
				topWood.Maple, 
				"Stratocaster");
		
		TestObj.addGuitar("1700-400", 699.00, addGuitarSpec);
		TestObj.addGuitar("1700-401", 699.00, addGuitarSpec2);
		
		testGuitarSpec.setManufacturer(manufacturer.Gibson);
		Guitar returned = TestObj.search(testGuitarSpec);
		assertSame("1700-401", returned.getSerialNumber());
		
	}
	
	/**
	 * This method is to Test the Search Guitar passing manufacturer 
	 * for multuple Guitar objects using JUnit Test
	 */
	@Test
	void testSearchGuitars_manufacturer2() {
		
		Inventory TestObj = new Inventory();
		GuitarSpec testGuitarSpec = new GuitarSpec();
		
		this.addGuitarSpec = new GuitarSpec(manufacturer.Martin, 
				type.Electric, 
				backWood.Maple, 
				topWood.Maple, 
				"Stratocaster");
		this.addGuitarSpec2 = new GuitarSpec(manufacturer.Fender, 
				type.Acoustic, 
				backWood.Maple, 
				topWood.Maple, 
				"Stratocaster");
		
		TestObj.addGuitar("1700-400", 699.00, addGuitarSpec);
		TestObj.addGuitar("1700-401", 699.00, addGuitarSpec2);
		
		testGuitarSpec.setManufacturer(manufacturer.Fender);
		Guitar returned = TestObj.search(testGuitarSpec);
		
		assertSame("1700-401", returned.getSerialNumber());
			
	}
	
	/**
	 * This method is to Test the Search Guitar passing type using JUnit Test
	 */
	@Test
	void testSearchGuitars_type() {
		
		Inventory TestObj = new Inventory();
		GuitarSpec testGuitarSpec = new GuitarSpec();
		
		this.addGuitarSpec = new GuitarSpec(manufacturer.Martin, 
				type.Electric, 
				backWood.Maple, 
				topWood.Maple, 
				"Stratocaster");
		this.addGuitarSpec2 = new GuitarSpec(manufacturer.Fender, 
				type.Acoustic, 
				backWood.Maple, 
				topWood.Maple, 
				"Stratocaster");
		
		TestObj.addGuitar("1700-400", 699.00, addGuitarSpec);
		TestObj.addGuitar("1700-401", 699.00, addGuitarSpec2);
		
		testGuitarSpec.setType(type.Electric);
		
		Guitar returned = TestObj.search(testGuitarSpec);
		assertSame("1700-400", returned.getSerialNumber());
		
	}
	
	/**
	 * This method is to Test the Search Guitar passing all enum parameters using JUnit Test
	 */
	@Test
	void testSearchGuitars_custom() {
		
		Inventory TestObj = new Inventory();
		GuitarSpec testGuitarSpec = new GuitarSpec();
		
		this.addGuitarSpec = new GuitarSpec(manufacturer.Fender, 
				type.Electric, 
				backWood.Alder, 
				topWood.Alder, 
				"Stratocaster");
		this.addGuitarSpec2 = new GuitarSpec(manufacturer.Fender, 
				type.Electric, 
				backWood.Maple, 
				topWood.Maple, 
				"Stratocaster");
		
		TestObj.addGuitar("1700-400", 699.00, addGuitarSpec);
		TestObj.addGuitar("1700-401", 699.00, addGuitarSpec2);
	
		testGuitarSpec.setType(type.Electric);
		testGuitarSpec.setManufacturer(manufacturer.Fender);
		testGuitarSpec.setTopWood(topWood.Alder);
		testGuitarSpec.setBackWood(backWood.Alder);
		testGuitarSpec.setModel("Stratocaster");
		
		Guitar returned = TestObj.search(testGuitarSpec);
		assertSame("1700-400", returned.getSerialNumber());
		
	}
	
}

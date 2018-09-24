package HW1.test.edu.fitchburgstate.csc7400;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import HW1.edu.fitchburgstate.csc7400.Guitar.manufacturer;
import HW1.edu.fitchburgstate.csc7400.Guitar.type;
import HW1.edu.fitchburgstate.csc7400.GuitarSpec;
import HW1.edu.fitchburgstate.csc7400.Guitar.topWood;
import HW1.edu.fitchburgstate.csc7400.Guitar.backWood;
import HW1.edu.fitchburgstate.csc7400.Guitar;
import HW1.edu.fitchburgstate.csc7400.Inventory;

/**
 * @author Navya Inampudi
 * This class is to JUnit Test for Inventory Class
 */
class InventoryTest {
	
	Guitar testGuitar;
	
	/**
	 * This method is to set the Guitar Object for JUnit Test
	 * @throws Exception
	 */
	@BeforeEach
	void setUp() throws Exception {
		this.testGuitar = new Guitar(
				"Test", // serial number
				100.00, // store price
				//"ABCD", // Manufacturer
				manufacturer.Martin, // Manufacturer
				"XYZ", // Manufacturer model
				type.Electric, // Type of Guitar
				backWood.Maple, // Face wood);, // Back wood
				topWood.Maple
				);
	}

	
	/**
	 * This method is to Test Add Guitar using JUnit Test
	 */
	@Test
	void testaddGuitar() {
		Guitar expected = this.testGuitar;
		Inventory TestObj = new Inventory();
		TestObj.addGuitar(
						"Test", // serial number
						100.00, // store price
						//"ABCD", // Manufacturer
						manufacturer.Martin, // Manufacturer
						"XYZ", // Manufacturer model
						type.Electric, // Type of Guitar
						backWood.Maple, // Face wood);, // Back wood
						topWood.Maple
				);
		Guitar returned = TestObj.getGuitar("Test");
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
		TestObj.addGuitar(
						"Test", // serial number
						100.00, // store price
						//"ABCD", // Manufacturer
						manufacturer.Martin, // Manufacturer
						"XYZ", // Manufacturer model
						type.Electric, // Type of Guitar
						backWood.Maple, // Face wood);, // Back wood
						topWood.Maple
				);
		Guitar returned = TestObj.getGuitar("Test");
		assertSame(expected.getSerialNumber(), returned.getSerialNumber());
		assertEquals(1, TestObj.guitars.size());	
		
		TestObj.addGuitar(
				"Test11", // serial number
				100.00, // store price
				//"ABCD", // Manufacturer
				manufacturer.Martin, // Manufacturer
				"XYZ", // Manufacturer model
				type.Electric, // Type of Guitar
				backWood.Maple, // Face wood);, // Back wood
				topWood.Maple
		);
		
		assertEquals(2, TestObj.guitars.size());	
		
	}
	
	
	/**
	 * This method is to Test Get Guitar using JUnit Test
	 */
	@Test
	void testGetGuitars() {
		Guitar expected = this.testGuitar;
		Inventory TestObj = new Inventory();
		TestObj.addGuitar(
						"Test", // serial number
						100.00, // store price
						//"ABCD", // Manufacturer
						manufacturer.Martin, // Manufacturer
						"XYZ", // Manufacturer model
						type.Electric, // Type of Guitar
						backWood.Maple, // Face wood);, // Back wood
						topWood.Maple
				);
		TestObj.addGuitar(
				"TestGetGuitar1", // serial number
				100.00, // store price
				//"ABCD", // Manufacturer
				manufacturer.Martin, // Manufacturer
				"XYZ", // Manufacturer model
				type.Electric, // Type of Guitar
				backWood.Maple, // Face wood);, // Back wood
				topWood.Maple
		);
		Guitar returned = TestObj.getGuitar("Test");
		assertSame(expected.getSerialNumber(), returned.getSerialNumber());
		assertEquals(2, TestObj.guitars.size());	
		
	}
	
	
	/**
	 * This method is to Test the Search Guitar passing manufacturer using JUnit Test
	 */
	@Test
	void testSearchGuitars1() {
		
		Inventory TestObj = new Inventory();
		TestObj.addGuitar(
						"Test", // serial number
						100.00, // store price
						//"ABCD", // Manufacturer
						manufacturer.Martin, // Manufacturer
						"XYZ", // Manufacturer model
						type.Electric, // Type of Guitar
						backWood.Maple, // Face wood);, // Back wood
						topWood.Maple
				);
		TestObj.addGuitar(
				"Test11", // serial number
				100.00, // store price
				//"ABCD", // Manufacturer
				manufacturer.Gibson, // Manufacturer
				"XYZ", // Manufacturer model
				type.Electric, // Type of Guitar
				backWood.Maple, // Face wood);, // Back wood
				topWood.Maple
		);
		
		Guitar testItem = new Guitar();
		testItem.setManufacturer(manufacturer.Gibson);
		Guitar returned = TestObj.search(testItem);
		
		assertSame("Test11", returned.getSerialNumber());
		
		
	}
	
	/**
	 * This method is to Test the Search Guitar passing manufacturer 
	 * for multuple Guitar objects using JUnit Test
	 */
	@Test
	void testSearchGuitars2() {
		
		Inventory TestObj = new Inventory();
		TestObj.addGuitar(
						"Test", // serial number
						100.00, // store price
						//"ABCD", // Manufacturer
						manufacturer.Martin, // Manufacturer
						"XYZ", // Manufacturer model
						type.Electric, // Type of Guitar
						backWood.Maple, // Face wood);, // Back wood
						topWood.Maple
				);
		TestObj.addGuitar(
				"Test112", // serial number
				100.00, // store price
				//"ABCD", // Manufacturer
				manufacturer.Fender, // Manufacturer
				"XYZ", // Manufacturer model
				type.Electric, // Type of Guitar
				backWood.Maple, // Face wood);, // Back wood
				topWood.Maple
		);
		
		Guitar testItem = new Guitar();
		testItem.setManufacturer(manufacturer.Fender);
		Guitar returned = TestObj.search(testItem);
		
		assertSame("Test112", returned.getSerialNumber());
		
		
	}
	
	/**
	 * This method is to Test the Search Guitar passing type using JUnit Test
	 */
	@Test
	void testSearchGuitars3() {
		
		Inventory TestObj = new Inventory();
		TestObj.addGuitar(
						"Test", // serial number
						100.00, // store price
						//"ABCD", // Manufacturer
						manufacturer.Martin, // Manufacturer
						"XYZ", // Manufacturer model
						type.Electric, // Type of Guitar
						backWood.Maple, // Face wood);, // Back wood
						topWood.Maple
				);
		TestObj.addGuitar(
				"Test1123", // serial number
				100.00, // store price
				//"ABCD", // Manufacturer
				manufacturer.Fender, // Manufacturer
				"XYZ", // Manufacturer model
				type.Electric, // Type of Guitar
				backWood.Maple, // Face wood);, // Back wood
				topWood.Maple
		);
		
		Guitar testItem = new Guitar();
		testItem.setType(type.Electric);;
		Guitar returned = TestObj.search(testItem);
		
		assertSame("Test", returned.getSerialNumber());
		
		
	}
	
	/**
	 * This method is to Test the Search Guitar passing all enum parameters using JUnit Test
	 */
	@Test
	void testSearchGuitars4() {
		
		Inventory TestObj = new Inventory();
		TestObj.addGuitar(
						"Test", // serial number
						100.00, // store price
						//"ABCD", // Manufacturer
						manufacturer.Fender, // Manufacturer
						"XYZ", // Manufacturer model
						type.Electric, // Type of Guitar
						backWood.Alder, // Face wood);, // Back wood
						topWood.Alder
				);
		TestObj.addGuitar(
				"Test1123", // serial number
				100.00, // store price
				//"ABCD", // Manufacturer
				manufacturer.Fender, // Manufacturer
				"Stratocastor", // Manufacturer model
				type.Electric, // Type of Guitar
				backWood.Maple, // Face wood);, // Back wood
				topWood.Maple
		);
		
		Guitar testItem = new Guitar();
		testItem.setType(type.Electric);;
		testItem.setManufacturer(manufacturer.Fender);
		testItem.setTopWood(topWood.Alder);
		testItem.setBackWood(backWood.Alder);
		testItem.setModel("XYZ");
		Guitar returned = TestObj.search(testItem);
		
		assertSame("Test", returned.getSerialNumber());
		
		
	}
	
	
	/**
	 * This method is to Test the Search Guitar passing Guitar Specs using JUnit Test
	 */
	@Test
	void testSearchGuitarSpecs() {
		
		Inventory TestObj = new Inventory();
		GuitarSpec spec = new GuitarSpec();
		spec.setManufacturer(manufacturer.Fender);
		spec.setModel("Test");
		spec.setTopWood(topWood.Alder);
		spec.setBackWood(backWood.Cocobolo);
		TestObj.addGuitarUsingSpecs(
						"Testing", // serial number
						100.00, // store price
						spec //Guitar Spec
				);
		
		
		Guitar testItem = new Guitar();
		testItem.setGuitarspec(spec);
		
		Guitar returned = TestObj.searchUsingSpecs(testItem);
		
		assertSame("Testing", returned.getSerialNumber());
		
		
	}
}

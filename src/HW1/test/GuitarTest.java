/**
 * Class: Object-Oriented Design and Analysis
 * Professor: Orlando Montalvo
 * Assignment: HW 1
 * Student: Navya Inampudi
 * 
 * Date: 2018-10-20
 */

package HW1.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import HW1.Guitar;

/**
 * JUnit Test for GuitarTest Class
 * @author Navya Inampudi
 */
class GuitarTest {
	
	Guitar testGuitar;

	/**
	 *  Instantiate testGuitar Object, to be used for Validating for the below scenarios
	 * @throws Exception
	 */
	@BeforeEach
	void setUp() throws Exception {
		this.testGuitar = new Guitar(
				"AB123", // serial number
				203.35, // store price
				"Gibson", // Manufacturer
				"EasyLearn", // Manufacturer model
				"electric", // Type of Guitar
				"Maple", // Back wood
				"Adirondack" // Face wood
				);
	}

	/**
	 * this is to validate if SerialNumber can be retrieved from TestGuitar object
	 */
	@Test
	void testGetSerialNumber() {
		String expected = "AB123";
		String returned = this.testGuitar.getSerialNumber();
		assertEquals(expected, returned, String.format("Serial number %s != %s", expected, returned));
	}

	/**
	 * this is to validate if Price can be retrieved from TestGuitar object
	 */
	@Test
	void testGetPrice() {
		double expected = 203.35;
		double returned = this.testGuitar.getPrice();
		assertEquals(expected, returned, 0.01, String.format("Price %f != %f", expected, returned));
	}

	/**
	 * this is to validate if Price can be set to TestGuitar object
	 */
	@Test
	void testSetPrice() {
		double expected = 225.10;
		this.testGuitar.setPrice(expected);
		double returned = this.testGuitar.getPrice();
		assertEquals(expected, returned, String.format("Price %f != %f", expected, returned));
	}

	/**
	 * this is to validate if Manufacturer can be retrieved from TestGuitar object
	 */
	@Test
	void testGetManufacturer() {
		String expected = "Gibson";
		String returned = this.testGuitar.getManufacturer();
		assertEquals(expected, returned, String.format("Manufacturer %s != %s", expected, returned));
	}

	/**
	 * this is to validate if Model can be retrieved from TestGuitar object
	 */
	@Test
	void testGetModel() {
		String expected = "EasyLearn";
		String returned = this.testGuitar.getModel();
		assertEquals(expected, returned, String.format("Model %s != %s", expected, returned));
	}

	/**
	 * this is to validate if Type can be retrieved from TestGuitar object
	 */
	@Test
	void testGetType() {
		String expected = "electric";
		String returned = this.testGuitar.getType();
		assertEquals(expected, returned, String.format("Type %s != %s", expected, returned));
	}

	/**
	 * this is to validate if Backwood can be retrieved from TestGuitar object
	 */
	@Test
	void testGetBackWood() {
		String expected = "Maple";
		String returned = this.testGuitar.getBackWood();
		assertEquals(expected, returned, String.format("Back wood %s != %s", expected, returned));
	}

	/**
	 * this is to validate if TopWood can be retrieved from TestGuitar object
	 */
	@Test
	void testGetTopWood() {
		String expected = "Adirondack";
		String returned = this.testGuitar.getTopWood();
		assertEquals(expected, returned, String.format("Top wood %s != %s", expected, returned));
	}
}

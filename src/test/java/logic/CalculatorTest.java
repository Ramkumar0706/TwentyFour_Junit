package logic;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CalculatorTest {

	Calculator cal;
	
	
	@BeforeAll
	 static void beforeAll() {
		System.out.println("Before All is Invoked");
	}
	
	@BeforeEach
	void init() {
		cal=new Calculator();
		System.out.println("Bafore Each method invoke");
	}
	@Test
	void add() {
		assertEquals(20, cal.add(10, 10),()->"The output is Wrong");
	}
	
	
	@AfterEach
	void afterEach() {
		System.out.println("After Each method is Invoked");
	}
	
}
 
package logic;

import static org.junit.jupiter.api.Assertions.*;

import java.time.Duration;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;

@TestInstance(Lifecycle.PER_CLASS)
class BasicProgramTest {
	
	BasicProgram basicProgram;
	
	
	@BeforeAll
	void beforeAll() {
		System.out.println("Before All Method invoked");
	}
	@BeforeEach
	void init() {
		basicProgram=new BasicProgram();
	}

	@Test
	void testReverseString() {
		assertEquals("maR", basicProgram.ReverseString("Ram"));
		
	}

}

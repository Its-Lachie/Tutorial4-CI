package CIdemo;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

//Testing Calc.java

public class TestCalc {
	public void testAdd() {
		int result = Calc.add(3,6);
		assertEquals(result,9);
	}
	
	public void testSub() {
		int result = Calc.subtract(6,2);
		assertEquals(result,4);
	}
}
    
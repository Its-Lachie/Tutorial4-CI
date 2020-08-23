package CIdemo;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

//Testing Calc.java

public class TestCalc {
	public void testAdd() {
		int result = Calc.add(3,6);
		assertEquals(result,9);
	}
}
    
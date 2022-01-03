package Excercise;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(value=Parameterized.class)
public class TestEX3_9 {

	
	private String x;
	private String y; 

	@Parameters
	public static Collection<String[]> getTestParameters() {
		return Arrays.asList(new String[][] {
			{"013601267", "0136012671"},
			{"013031997", "013031997X"},
		});
	}
	
	public TestEX3_9(String x,String y) {
		this.x = x;
		this.y = y;
	}
	@Test
	public void test() {
		assertEquals(y,Ex3_9.ISBNTEN(x));
	}

}

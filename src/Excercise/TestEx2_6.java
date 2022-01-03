package Excercise;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(value=Parameterized.class)
public class TestEx2_6 {

	private int x;
	private int y; 

	@Parameters
	public static Collection<Integer[]> getTestParameters() {
		return Arrays.asList(new Integer[][] {
			{932, 54},
			{23, 6},
			{735, 105}
		});
	}

	public TestEx2_6(int x,int y) {
		this.x = x;
		this.y = y;
	}


	@Test
	public void test() {

		//int output = test.countMuti(23);
		assertEquals(y,Ex2_6.countMuti(x));
	}

}

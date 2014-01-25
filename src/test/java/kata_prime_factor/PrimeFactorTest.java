package kata_prime_factor;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class PrimeFactorTest {

	PrimeFactor primeFactor;

	@Before
	public void setUp() {
		primeFactor = new PrimeFactor();
	}

	@Test
	public void testOne() throws Exception {
		assertEquals(list(), primeFactor.generate(1));
	}

	@Test
	public void testTwo() throws Exception {
		assertEquals(list(2), primeFactor.generate(2));
	}
	
	@Test
	public void testTree() throws Exception {
		assertEquals(list(3), primeFactor.generate(3));
	}

	private List<Integer> list(int... integers) {
		List<Integer> list = new ArrayList<Integer>();
		for (int integer : integers) {
			list.add(integer);
		}
		return list;
	}
}

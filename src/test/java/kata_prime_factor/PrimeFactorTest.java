package kata_prime_factor;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class PrimeFactorTest {
	@Test
	public void testOne() throws Exception {
		PrimeFactor primeFactor = new PrimeFactor();
		assertEquals(list(), primeFactor.generate(1));
	}
	
	@Test
	public void testTwo() throws Exception {
		PrimeFactor primeFactor = new PrimeFactor();
		assertEquals(list(2), primeFactor.generate(2));
	}
	
	private List<Integer> list(int... integers) {
		List<Integer> list = new ArrayList<Integer>();
		for (int integer : integers) {
			list.add(integer);
		}
		return list;
	}
}

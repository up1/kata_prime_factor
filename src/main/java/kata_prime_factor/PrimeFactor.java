package kata_prime_factor;

import java.util.ArrayList;
import java.util.List;

public class PrimeFactor {

	public List<Integer> generate(int integer) {
		List<Integer> primes = new ArrayList<Integer>();
		for (int candidate = 2; integer > 1; candidate++)
			for (; integer % candidate == 0; integer = integer / candidate)
				primes.add(candidate);
		return primes;
	}

}

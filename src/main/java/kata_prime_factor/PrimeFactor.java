package kata_prime_factor;

import java.util.ArrayList;
import java.util.List;

public class PrimeFactor {

	public List<Integer> generate(int integer) {
		List<Integer> primes = new ArrayList<Integer>();
		int candidate = 2;
		while (integer > 1) {
			while (integer % candidate == 0) {
				primes.add(candidate);
				integer = integer / candidate;
			}
			candidate++;
		}
		if (integer > 1) {
			primes.add(integer);
		}
		return primes;
	}

}

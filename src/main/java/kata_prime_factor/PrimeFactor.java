package kata_prime_factor;

import java.util.ArrayList;
import java.util.List;

public class PrimeFactor {

	public List<Integer> generate(int integer) {
		List<Integer> primes = new ArrayList<Integer>();
		if(integer>1) {
			primes.add(integer);
		}
		return primes;
	}

}

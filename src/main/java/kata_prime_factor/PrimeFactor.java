package kata_prime_factor;

import java.util.ArrayList;
import java.util.List;

public class PrimeFactor {

	public List<Integer> generate(int i) {
		List<Integer> primes = new ArrayList<Integer>();
		if(i>1) {
			primes.add(i);
		}
		return primes;
	}

}

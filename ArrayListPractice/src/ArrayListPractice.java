import java.util.ArrayList;

public class ArrayListPractice {

	public static void main(String[] args) {
		int num = 158;
		
		ArrayList <Integer> primes = new ArrayList<Integer>();
		primes.add(2);
		for(int i = 3; i <= num/2; i+=2) {
			for(Integer prime : primes) {
				if(i%prime!=0) {
					primes.add(i);
				}
				break;
			}
		}
		
		ArrayList <Integer> primeFactors = new ArrayList<Integer>();
		
		for(int i = 0; i < primes.size(); i++) {
			if(num%primes.get(i)==0) {
				primeFactors.add(primes.get(i));
				num/=primes.get(i);
				i--;
			}
		}
		
		System.out.println(primeFactors);

		
	}

}

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class PrimeNumberTest {
	@Test
	public void primeNumberPrint() {
    int primeCount = 0;
    // PrimeNumber primeNumber = new PrimeNumber();
  	for (int i = 2; i < 500; i++) {

  		if (PrimeNumber.isPrime(i)){
  			System.out.println(i);
  			++primeCount;
  		}
  		else {
  			continue;
  		}
  	}

  	System.out.println("primeCount is " + primeCount);
	  assertEquals(25, primeCount);
  }
}
package Assignment;

public class SumofPrimes_P008 {
	public static void main(String[] args) {
		
		int count=0;
		int sum=0;
		int number=2;
		
		while (count<100) {
			if (isPrime(number)) {
				sum += number;
				count++;
				
				
			}
			number++;
			
		}
		System.out.println("Sum of the first 100 Prime numbers is " +sum);
	}
public static boolean isPrime(int num) {
	if (num <= 1)return false;
    for (int i = 2; i <= Math.sqrt(num); i++) {
        if (num % i == 0) return false;
    }
    return true;

	
	
}
}

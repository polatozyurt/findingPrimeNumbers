
public class primeNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("The prime numbers between 1-100 are: ");
		int i, j, k ;
		for(i=1 ; i<100; i++) {
			if(isPrime(i)) {
				System.out.print(i+" ");
			}
			
		}
	}
		
		static boolean isPrime(int num) {
		 for(int i=2;i<=num/2;i++)
	       {
	           if((num%i)==0)
	               return  false;
	       }
	       return true;
		
	

		}
}

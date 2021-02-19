

// ------------------------   EXERCISE 1 --------------------
// for a given point, calculating its distance from origin
//------------------------------------------------------------

public class Test { 
	
	
	
	public static void main(String[] args) {
		
		
		double x = 2;
		double y = 2;
		
		System.out.printf("Distance from origin for point (%s, %s) : %s.", x, y, Math.sqrt(Math.pow(x, 2)+ Math.pow(x,2)));

		
		
	}

}



// ------------------------   EXERCISE 2 --------------------
// for a given number, tell the user if it"s prime or not
//------------------------------------------------------------

public class Test { 
	
	
	
	public static void main(String[] args) {
		
		// get the time in ms just for fun execution time calculation
		long begin = System.currentTimeMillis();
		

		long n = 1055623553;
		boolean isPrime = true;
		

		// a prime number is higher than 1 and can be divided only by itself or 1
		if(n < 2) {
			isPrime = false;
		}else {
			for(int i = 2 ; i < n ; i++) {
				if (n%i == 0) {
					isPrime = false;
				}
			}
		}
		
		


		if (isPrime) {
			System.out.printf("%s is prime.", n);
		}else {
			System.out.printf("%s is not prime.", n);
		}
		



		// get the time in ms just for fun execution time calculation
		long end = System.currentTimeMillis();
		System.out.printf("\nExecution time : %s !", (end-begin));
		
	}

}



// ------------------------   EXERCISE 3 --------------------
// 				Simple array merger and sorter
//------------------------------------------------------------


public class Test { 
	
	
	
	public static void main(String[] args) {
		
		

		double[] arr1 = {1,2,3,4,5};
		double[] arr2 = {1.2, 2.5, 3.2, 4.8, 4.9};
		double[] arr3 = new double[10];



		Arrays.sort(arr1);
		Arrays.sort(arr2);

		

		// copying arr1 and arr2 content in arr3 to simulate the merging
		System.arraycopy(arr1, 0, arr3, 0, 5);
		System.arraycopy(arr2, 0, arr3, 5, 5);



		// sorting arr3
		Arrays.sort(arr3);



		// printing arr3
		for(double item : arr3) {
			System.out.println(item);
		}
		
		
		

	}
}
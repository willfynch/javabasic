public class Point {
	
	private double x;
	private double y;
	

	// --------------------------------constructor
	public Point(double x, double y) {
		this.x = x;
		this.y = y;
	}
	// -------------------------------


	
	// -----------------------------x getter and setter
	
	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	// -------------------------------



	
	//----------------------------- y setter and getter

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}
	// -------------------------------




	
	
	// -------------------------------get position
	public String position() {
		return String.format("(%s,%s)",this.x, this.y);
	}

	// -------------------------------



	
	//--------------------------- calculate distance from origin
	public double distance() {
		return Math.sqrt(Math.pow(this.x, 2) + Math.pow(this.y,  2));
	}	
	// -------------------------------


}


public class Test { 
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		// --------------------------------------------------------INITIALIZATION

		// menu choice variable declaration and initialization 
		int choice = 0;

		// creating the object point with standard coordinates
		Point p = new Point(1.0,1.0);

		// preparing the boolean for entering inApp loop
		boolean inApp = true;

		// creating the scanner that will be used along the program
		Scanner scanner = new Scanner(System.in);



		System.out.println("We create a p point at (1.0, 1.0).\n");
		




		// --------------------------------------------------------THE POINT APP

		// entering the while inApp loop
		while(inApp) {
			

			// -------------------------------------------------------- get user's choice 

			// boolean for a prompt loop to get right choice from the user
			boolean bError = true;
			System.out.println("What do you want to do ?"
					+ "\n1: Change X"
					+ "\n2: Change Y"
					+ "\n3: Print distance from origin"
					+ "\n4: Print coordinates"
					+ "\n5: Quit");
			while(bError) {
				System.out.println("Enter a int number from 1 to 5.");

				// checking if the prompted value is a integer 
				if(scanner.hasNextInt()) {

					// storing the prompted value in choice
					choice = scanner.nextInt();

					// if choice is an int but not a possible choice, go back to beginning of the loop
					if (choice < 1 || choice > 5 ) {
						continue;
					}
					
				}else {

					// if prompted value is not an int we scan another prompted value then go back to begenning of the loop
					scanner.next();
					continue;
				}

				// breaking the loop when a correct value is prompted
				System.out.println(String.format("You entered %s", choice));
				bError = false;
			}
			
			


			

			// --------------------------------------------------------do things depending on user's choice

			// here we use the same kind of loop for prompts 
			switch (choice) {
				



				// ------------------------  ENTER X
				case 1: 
					double x;
					bError = true;
					while(bError) {
					System.out.println("Enter a double for x value : ");
					if(scanner.hasNextDouble()) {
						x = scanner.nextDouble();
					}else {
						scanner.next();
						continue;
					}	
						// using the x setter 
						p.setX(x);
						System.out.println(String.format("New x value : %s", x));
						bError = false;
					}
					break;
				// -----------------------------------------------------------------------------------	





				//  ------------------------  ENTER Y	
				case 2: 
					double y;
					bError = true;
					while(bError) {
					System.out.println("Enter a double for y value : ");
					if(scanner.hasNextDouble()) {
						y = scanner.nextDouble();
					}else {
						scanner.next();
						continue;
					}	
						// using the y setter 
						p.setY(y);
						System.out.println(String.format("New y value : %s", y));
						bError = false;
					}
					break;
				// -----------------------------------------------------------------------------------	




					
				//  ------------------------  DISTANCE FROM ORIGIN	
				case 3:
					System.out.println(String.format("Distance from origin : %s", p.distance()));
					break;
				// -----------------------------------------------------------------------------------	




				
				//  ------------------------  COORDINATES
				case 4:
					// using x and y getters to get position
					System.out.println(String.format("Coordinates : (%s, %s)", p.getX(), p.getY()));
					break;
				// -----------------------------------------------------------------------------------	





				//  ------------------------  QUITTING	
				case 5:
					System.out.println("Quitting app...");
					// inApp is now false so the loop is broken
					inApp = false;
					break;
				// -----------------------------------------------------------------------------------	
			}



			// return at the beginning of the inApp while loop and check if inApp is still true
			continue;
		}
	}
}
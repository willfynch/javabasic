public class Cercle {
	
	//---------------------------------------------
	// STATIC VARIABLES
	static double taille_max = 1.0;
	//---------------------------------------------
	
	
	
	//---------------------------------------------
	// INSTANCE VARIABLES
	private double x;
	private double y;
	private double r;
	private String color;
	//---------------------------------------------
	
	
	
	//---------------------------------------------
	// CONSTRUCTOR
	public Cercle(double x, double y, double r, String color) {
		this.x = x;
		this.y = y;
		this.r = r;
		this.color = color;
	}
	//---------------------------------------------
	
	
	
	//---------------------------------------------
	// INSTANCE METHODS
	
	
	// GETTERS AND SETTERS -------------------------------

	
	// -------------------------------------------------- taille_max
	public static double getTaille_max() {
		return taille_max;
	}

	public static void setTaille_max(double taille_max) {
		Cercle.taille_max = taille_max;
	}
	//-------------------------------------------------------------
	
	
	
	
	
	// -------------------------------------------------------- x
	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}
	//-------------------------------------------------------------
	
	
	
	
	
	
	// ------------------------------------------------------- y
	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}
	//-------------------------------------------------------------
	
	
	
	
	
	
	// ------------------------------------------------------- r
	public double getR() {
		return r;
	}

	public void setR(double r) {
		this.r = r;
	}
	//-------------------------------------------------------------
	
	
	
	
	
	
	// ------------------------------------------------------ color
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	//-------------------------------------------------------------
	
	
}



import java.util.Scanner;


public class Test { 
	
	
	
	public static void main(String[] args) {
		
		
		// --------------------------------------------------------INITIALIZATION

				// menu choice variable declaration and initialization 
				int choice = 0;

				// ccreating the object point with standard coordinates
				Cercle c = new Cercle(1,1,1,"blue");

				// preparing the boolean for entering inApp loop
				boolean inApp = true;

				// creating the scanner that will be used along the program
				Scanner scanner = new Scanner(System.in);

				System.out.println("We create a circle.\n");
				



				// --------------------------------------------------------THE POINT APP

				// entering the while inApp loop
				while(inApp) {
					

					// -------------------------------------------------------- get user's choice 

					// boolean for a prompt loop to get right choice from the user
					boolean bError = true;
					System.out.println("\nWhat do you want to do ?"
							+ "\n1: Check state"
							+ "\n2: Change center X coordinate"
							+ "\n3: Change center Y coordinate"
							+ "\n4: Change radius"
							+ "\n5: Set max radius"
							+ "\n6: Calculate surface"
							+ "\n7: Quit");
					while(bError) {
						System.out.println("Enter a int number from 1 to 7.");
						// checking if the prompted value is a integer 
						if(scanner.hasNextInt()) {
							// storing the prompted value in choice
							choice = scanner.nextInt();
							// if choice is an int but not a possible choice, go back to beginning of the loop
							if (choice < 1 || choice > 7 ) {
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
						
						// CHECK STATE -----------------------------------------
						case 1: 
							System.out.println(String.format("Circle.\n"
									+ "x : %s\n"
									+ "y : %s\n"
									+ "radius : %s\n"
									+ "Color : %s\n"
									+ "Max-radius: %s\n", c.getX(), c.getY(), c.getR(), c.getColor(), Cercle.getTaille_max()));
							break;		
						// ---------------------------------------------------
							
							
							
							
							
						// CHANGE X  -----------------------------------------
						case 2:
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
								c.setX(x);
								System.out.println(String.format("New x value : %s", c.getX()));
								bError = false;
							}
							break;
						// ---------------------------------------------------
							
							
							
							
							
						// CHANGE Y  -----------------------------------------
						case 3:
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
								c.setY(y);
								System.out.println(String.format("New y value : %s", c.getY()));
								bError = false;
							}
							break;
						// ---------------------------------------------------
							
							
							
							
						
						// CHANGE R  -----------------------------------------
						case 4:
							double r;
							bError = true;
							while(bError) {
							System.out.println("Enter a double for radius value : ");
							if(scanner.hasNextDouble()) {
								r = scanner.nextDouble();
								if (r > Cercle.taille_max) {
									System.out.println(String.format("Your radius is %s but the max-radius is %s. Sorry dude.", r, Cercle.taille_max));
									continue;
								}
								
							}else {
								scanner.next();
								continue;
							}	
								// using the y setter 
								c.setR(r);
								System.out.println(String.format("New radius value : %s", c.getR()));
								bError = false;
							}
							break;
						// ---------------------------------------------------
							
							
							
							
							 
						// SET MAX RADIUS   -----------------------------------------
						case 5:
							double maxRadius;
							bError = true;
							while(bError) {
							System.out.println("Enter a double for max-radius value : ");
							if(scanner.hasNextDouble()) {
								maxRadius = scanner.nextDouble();
							}else {
								scanner.next();
								continue;
							}	
								// using the y setter 
								Cercle.setTaille_max(maxRadius);
								System.out.println(String.format("New max-radius value : %s", Cercle.getTaille_max()));
								bError = false;
							}
							break;
						// ---------------------------------------------------
						
						
							
						
						// CALCULATE SURFACE  -----------------------------------------
						case 6:
							double surface = Math.PI*Math.pow(c.getR(),2);
							System.out.println(String.format("Surface : %s", surface));
							break;
						// ---------------------------------------------------
							
							
							
							
						// QUIT  -----------------------------------------
						case 7:
							System.out.println("Quitting app...");
							scanner.close();
							// inApp is now false so the loop is broken
							inApp = false;
							break;
						// ---------------------------------------------------
					}



					// ----------------------------------return at the beginning of the inApp while loop and check if inApp is still true
					continue;
				}		
	}

}

/*
	*  Create a Bouteille class to instantiate 
	*  50cl and 75cl bottles only. Throw exception
	*  if volume is not right
	*/


public class VolExc extends Exception{	

	
	// ---- CONSTRUCTOR -------------
	public VolExc(int volume) {
		super();
		this.volume = volume;
	}
	//-------------------------------
	
	
	
	// ---- FIELDS -------------
	private int volume;
	//-------------------------------
		
		
	
	// ---- GETTER -------------
	public int getVolume() {
		return volume;
	}
	//-------------------------------
	
	
}



// ---------------------------------------------------
// ---------------------------------------------------
// ---------------------------------------------------


public class Bouteille {
	
	
	// ---- FIELDS -------------
	private int volume;
	//-------------------------------
	
	
	// ---- CONSTRUCTOR -------------
	public Bouteille(int volume) throws VolExc{
		super();
		if(volume != 50 && volume !=75) {
			throw new VolExc(volume);
		}
		
		this.volume = volume;
	}
	//-------------------------------
	
	
	
	// ---- GETTER -------------
	public int getVolume() {
		return volume;
	}
	//-------------------------------
	
	
	
	// ---- SETTER -------------
	public void setVolume(int volume) throws VolExc {
		if(volume != 50 && volume !=75) {
			throw new VolExc(volume);
		}
		this.volume = volume;
	}
	//-------------------------------
	
}



// ---------------------------------------------------
// ---------------------------------------------------
// ---------------------------------------------------



public class Test { 
	
	
	
	public static void main(String[] args) {
		
		
		try {
			Bouteille evian = new Bouteille(50);
			System.out.println("Volume : " + evian.getVolume());
			evian.setVolume(85);
			System.out.println("Volume : " + evian.getVolume());
			
		}
		catch(VolExc e){
			System.out.println(e.getVolume() + " is not the required volume !");
		}
	}
}
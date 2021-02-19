

// --------------------------------------------- ELEVE CLASS
class Eleve implements Comparable<Eleve> {
	


	// ---------------------------------------- INSTANCE VARIABLES
	int moyenne;
	String name;
	

	// ---------------------------------------- CONSTRUCTOR
	public Eleve(String name, int moyenne) {
		this.moyenne = moyenne;
		this.name = name;
	}
	


	// ---------------------------------------- OVERRIDING compareTo(T o) METHOD
	public int compareTo(Eleve e){
		return moyenne > e.moyenne ? 1 : -1;
	}



	// ---------------------------------------- OVERRIDING toString() METHOD IN ORDER TO PRINT VALUES WHEN PRINTING OBJECT
	@Override
	public String toString() {
		return "Eleve [moyenne=" + moyenne + ", name=" + name + "]";
	}
	
	
	
}



// ----------------------------------------------------------------------------
// ----------------------------------------------------------------------------
// ----------------------------------------------------------------------------




// --------------------------------------------- MAIN CLASS
public class Test { 
	
	
	
	public static void main(String[] args) {
		
		
		

		// ---------------------------------------- LIST OF ELEVE OBJECTS
		List<Eleve> eleves = new ArrayList<>();
		eleves.add(new Eleve("momo", 15));
		eleves.add(new Eleve("jojo", 12));
		eleves.add(new Eleve("lili", 10));
		eleves.add(new Eleve("mumu", 18));
		eleves.add(new Eleve("toto", 4));
		


		// ---------------------------------------- SORTING WITH BEST MARKS COMING FIRST
		Collections.sort(eleves, Collections.reverseOrder());
		


		// ---------------------------------------- PRINTING ELEVE OBJECTS
		for(Eleve e : eleves) {
			System.out.println(e);
		}
		
	}

}
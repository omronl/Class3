import java.util.ArrayList;
import java.util.Collections;

public class EXERCISES11 {
	
	public static void main(String[] args) {
		
		
	//	*
	//	 * 
	//	 * Create a method 2 arraylist as a paramaater first one is containg the second one or not 
	//	 * 
	//	 * Create one MYSTATES arraylist 10 values in it 
	//	 * 
	//	 * All States arraylist containing your list 
	//	 * 
	//	 * create other arraylist COUNTRIES  and verify  Allstates arraylist is not containng COUNTRIES  arraylist 
	//	 * 
	//	 * 
	//	 */
		
		
		
		
		
		
		
		String[] s1 = new String[] {"Alabama"
				,"Alaska",
				"Arizona",
				"Arkansas",
				"California",
				"Colorado",
				"Connecticut",
				"Delaware",
				"Florida",
				"Georgia",
				"Hawaii",
				"Idaho",
				"Illinois",
				"Indiana",
				"Iowa",
				"Kansas",
				"Kentucky",
				"Louisiana",
				"Maine",
				"Maryland",
				"Massachusetts",
				"Michigan",
				"Minnesota",
				"Mississippi",
				"Missouri",
				"Montana",
				"Nebraska",
				"Nevada",
				"New Hampshire",
				"New Jersey",
				"New Mexico",
				"New York",
				"North Carolina",
				"North Dakota",
				"Ohio",
				"Oklahoma",
				"Oregon",
				"Pennsylvania",
				"Rhode Island",
				"South Carolina",
				"South Dakota",
				"Tennessee",
				"Texas",
				"Utah",
				"Vermont",
				"Virginia",
				"Washington",
				"West Virginia",
				"Wisconsin",
				"Wyoming"};
		
		ArrayList<String> AllStates = new ArrayList<>();
	 
		Collections.addAll(AllStates, s1);
		
	ArrayList<String>Mystates= new ArrayList<String>();
	
		Mystates.add("New York");
		Mystates.add("Virginia");
		Mystates.add("Ohio");
		Mystates.add("New Jersey");
		Mystates.add("Wisconsin");
		Mystates.add("Utah");
		Mystates.add("Texas");
		Mystates.add("California");
		Mystates.add("Oregon");
		Mystates.add("Vermont");
		
		ArrayList<String> Contries = new ArrayList<>();
		
		Contries.add("Turkey");
		Contries.add("Usa");
		Contries.add("Georgia");
		Contries.add("Canada");
		Contries.add("Brazil");
		Contries.add("Germany");
		Contries.add("Polland");
		Contries.add("China");
		Contries.add("Japan");
		Contries.add("India");
		
		
		
		
		
		
	}
	
	
	
	
	public static String mystate(ArrayList<String> usastates, ArrayList<String> secondArray) {
		for (int i = 0; i < usastates.size() ; i++) {
			
			
			if(secondArray.get(i).contains(usastates.get(i))) {
				
				
			}
			
		}
		
		
		
	
		
	
	
	
	
	
	
	
	
	
	return "ss";
	
	
	}
}

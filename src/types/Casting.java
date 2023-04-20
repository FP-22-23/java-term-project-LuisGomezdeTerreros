package types;

import java.util.List;

//import java.util.ArrayList;

public record Casting(String star1,String star2,String star3,String star4 ) {
	
	public class CastingFactory {
	    public static Casting createCastingFromCsv(List<String> csvData) {
	        String star1 = csvData.get(0);
	        String star2 = csvData.get(1);
	        String star3 = csvData.get(2);
	        String star4 = csvData.get(3);
	        return new Casting(star1, star2, star3, star4);
	    }
	}
	
	
	


}
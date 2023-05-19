

package tests;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import types.Casting;
import types.Certificate;
import types.Movie;

public class TestMovie 


{
	public static void main ( String [] args ){
		
	LocalDate t = LocalDate.of(2001,12,12) ;
	ArrayList<String> genes =  new ArrayList<String>();
	genes.add("Terror");
	genes.add("Sci-fi");
	Casting casting = new Casting ("Tim Robbins","Morgan Freeman","Bob Gunton","William Sadler" );
	
	Movie a1 = new Movie ("The Shawshank Redemption",  1994, Certificate.ADULT,90,genes, 80,90, 
			"Tim Robbins",casting,  835937, 78, LocalDate.of(2001,12,12));
	
	ArrayList<String> gens =  new ArrayList<String>();
	gens.add("Drama");
	
	Movie a2 = new Movie ("The Shawshank Redemption",  1994, Certificate.ALLPUBLICS,90, gens ,5,9,
			"Tim Robbins",casting, 835937,78, LocalDate.of(2001,12,12));
	Movie a3 = new Movie ("The Shawshank Redemption",  1994, 90, 5, 835937,78);
	Boolean b1 = a1.equals(a2);
	a1.setImbd_rating(50);
	System.out.println ( a3);
	System.out.println ( b1);
	System.out.println ( a1);
	System.out.println ( a3.toString());
	System.out.println ( a1.getGenres());
	System.out.println ( a1.averageScore());

	

	
	}
	
}




package tests;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class TestMovie 


{
	public static void main ( String [] args )
	
	
	{
	//LocalDate t = LocalDate.of(2001,12,12) ;
	//Genres gen =  new Genres ("kklsdjfmkl", "hjkadsd", "hhisbibijk");
	
	
	ArrayList<String> genes =  new ArrayList<String>();
	;
	genes.add("Terror");
	genes.add("Sci-fi");
	
	Casting casting = new Casting ("Tim Robbins","Morgan Freeman","Bob Gunton","William Sadler" );
	Movie a1 = new Movie ("The Shawshank Redemption",  1994, Certificate.ADULT,90,genes, 80,90, 
			"Tim Robbins",casting,  835937, 78, LocalDate.of(2001,12,12));
	//Movie a2 = new Movie ("The Shawshank Redemption",  1994, Certificate.ALLPUBLICS,90, null ,5,9, "Tim Robbins", 835937,7.8, LocalDate.of(2001,12,12),c1);
	Movie a3 = new Movie ("The Shawshank Redemption",  1994, 90, 5, 835937,78);
	//a1.addlist( "yuga", "yuga","gyusag","uygasv");
	//Boolean b1 = a1.equals(a2);
	//a1.setImbd_rating(998);
	//System.out.println ( a3);
	//System.out.println ( b1);
	System.out.println ( a1);
	System.out.println ( a3);

	
	}
	
}


package types;

import java.time.LocalDate;
import java.util.ArrayList;

public class TestMovie {
	public static void main ( String [] args ) {
	//LocalDate t = LocalDate.of(2001,12,12) ;
	ArrayList<String> t = new ArrayList<String>();
	Casting c1 = new Casting ("easdada","hbbhh","ubhys", "ubhasb" );
	Movie a1 = new Movie ("The Shawshank Redemption",  1994, Certificate.A,90,t, 5,9, "Tim Robbins", 835937, 7.8, LocalDate.of(2001,12,12),c1);
	//Movie a2 = new Movie ("The Shawshank Redemption",  1994, Certificate.A,90, null , 5,9, "Tim Robbins", 835937,7.8, LocalDate.of(2001,12,12),c1);
	Movie a3 = new Movie ("The Shawshank Redemption",  1994, 90, 5, 835937,7.8);
	a1.addlist( "yuga", "yuga","gyusag","uygasv");
	//Boolean b1 = a1.equals(a2);
	a1.setImbd_rating(998);
	System.out.println ( a3);
	//System.out.println ( b1);
	System.out.println ( a1);

	
	}
}

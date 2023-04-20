package tests;

import types.MovieFactory;
import types.Movies;

public class TestMovieFactory {
	
	
	public static void main ( String [] args ) {
		
		Movies movies = MovieFactory.readMovies("data/ll.csv");
		
		
		System.out.println(movies.toString());
		
		
		testGetNumberMovies( movies);
		testExistsMovie( movies,"Inception");
		testMoreGrossThan( movies,  100000000);
		testAverageMetascore(movies);
		testMapAboveYearGross( movies, 2000);
		testMapImbdratingmoviesnames( movies);
		
	}
	
	private static void testGetNumberMovies(Movies movies) {
		System.out.println( "There are " + movies.getNumberMovies() + " movies");
	}
	private static void testExistsMovie(Movies movies, String title) {
		System.out.println( "The movie " + movies.existsMovie(title) + " movies");
	}
	private static void testMoreGrossThan(Movies movies, Integer gross) {
		System.out.println( "This movies have made more gross than  " + movies.moreGrossThan(gross));
	}
	
	private static void testAverageMetascore(Movies movies) {
		System.out.println( "The average Meta Score is   " + movies.averageMetascore());
	}
	private static void testMapAboveYearGross(Movies movies, Integer year) {
		System.out.println( "The gross per year from the year   " + year  + " is " + movies.mapAboveYearGross(year));
	}
	private static void testMapImbdratingmoviesnames(Movies movies) {
		System.out.println( "A map of the  title of the movies with a certan rating   " + movies.mapImbdratingmoviesnames());
	}
	
	
	
	
	
	
	

}

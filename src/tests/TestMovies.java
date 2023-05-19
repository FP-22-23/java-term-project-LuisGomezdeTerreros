package tests;

import java.time.LocalDate;

import types.MovieFactory;
import types.Movies;

public class TestMovies {
	
	
	public static void main ( String [] args ) {
		
		Movies movies = MovieFactory.readMovies("data/ll.csv");
		
		
		System.out.println(movies.toString());
		
		
		testGetNumberMovies( movies);
		testExistsMovie( movies,"Inception");
		testMoreGrossThan( movies,  100000);
		testAverageMetascore(movies);
		testMapAboveYearGross( movies, 2000);
		testMapImbdratingmoviesnames( movies);
		testexistMovieStreams(movies,"Inception");
		testAverageMetascoreStream(movies);
		testMoreGrossThanStream( movies,  100000);
		testMaxRuntimeAfterDate( movies,  LocalDate.of(2000, 07, 07));
		testMoviesContainGenreSortbyRuntime( movies,  "Crime");
		testMapYearGrossAboveYearStream( movies, 2000);
		testSetYearsaboveImbdrating ( movies, 90);
		testMapImbdratingmoviesnamesStream(movies);
		testMapCertificateTiltewithMaxNo_Votes( movies);
		testMapCertificateDirectorSortByImbdrating(movies);
		testDirectorHighestImbd(movies);
	}
	

	private static void testGetNumberMovies(Movies movies) {
		System.out.println( "There are " + movies.getNumberMovies() + " movies");
	}
	private static void testExistsMovie(Movies movies, String title) {
		System.out.println( "Is " + movies.existsMovie(title) +" that the movie " + title + " is in movies" );
	}
	private static void testMoreGrossThan(Movies movies, Integer gross) {
		System.out.println( "This movies have made more gross than  " + gross + movies.moreGrossThan(gross));
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
	private static void testexistMovieStreams(Movies movies, String title) {
		System.out.println( "The movie  " + title  + " exists " + movies.existMovieStreams(title) + " movies ");
	}
	private static void testAverageMetascoreStream(Movies movies) {
		System.out.println( "The average Meta Score is   " + movies.averageMetascoreStream());
	}
	
	private static void testMoreGrossThanStream(Movies movies, Integer gross) {
		System.out.println(  "This movies have made more gross than  " + gross + movies.moreGrossThanStream(gross));
	}
	private static void testMaxRuntimeAfterDate(Movies movies, LocalDate date) {
		System.out.println( "The film with the max runtime after " + date + " is " + movies.maxRuntimeAfterDate(date));
	}
	private static void testMoviesContainGenreSortbyRuntime(Movies movies, String genre) {
		System.out.println( "List of movies which contains the genre " + genre +" sorted by runtime   " + movies.moviesContainGenreSortbyRuntime(genre));
	}
	
	private static void testMapYearGrossAboveYearStream(Movies movies, Integer year) {
		System.out.println( "The gross per year from the year   " + year  + " is " + movies.mapYearGrossAboveYearStream(year));
	}
	private static void testSetYearsaboveImbdrating(Movies movies, Integer ImbdR) {
		System.out.println( "List of years which have films above a IMBD rating    " + ImbdR  + movies.setYearsaboveImbdrating(ImbdR));
	}
	private static void testMapImbdratingmoviesnamesStream(Movies movies) {
		System.out.println( "A map of the  title of the movies with a certan rating   " + movies.mapImbdratingmoviesnamesStream());
	}
	
	private static void testMapCertificateTiltewithMaxNo_Votes(Movies movies) {
		System.out.println( "Map in which the keys are certificates and values are the title of the movies "
				+ "which that certificate that the highest number of votes   "    + movies.mapCertificateTiltewithMaxNo_Votes());
	}
	
	private static void 	testMapCertificateDirectorSortByImbdrating(Movies movies) {
		System.out.println( "Map in which the keys are certificates and values is director a list of directors sorted by their IMBD rating "
				+  movies.	mapCertificateDirectorSortByImbdrating());
	}
	
	private static void 	testDirectorHighestImbd(Movies movies) {
		System.out.println( "The director and Imbdrating of the highest rated imbd film extracted from a map "
				+  movies.	directorHighestImbd());
	}
	
	
	

}

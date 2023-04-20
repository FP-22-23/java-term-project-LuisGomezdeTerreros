package types;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Vector;
import java.util.stream.Stream;

import utils.Checkers;

public class MovieFactory {
	
	public static Movies readMovies(String fileName) {
		Movies res = null;
		
		try {
			Stream<Movie> movie = Files.lines(Paths.get(fileName)).skip(1).map(MovieFactory::parseLine);
			
			res = new Movies(movie);
		}catch(IOException e) {
			System.out.println("*******ERROR WITH THE FILE " + fileName + " ********");
		}
		return res;
}
	
	public static Movie parseLine(String s) {
	    String[] parts = s.split(";");
	    String series_title = parts[0];
	    Integer released_year = Integer.valueOf(parts[1]);
	    Certificate certificate = parseCertificate(parts[2]);
	    Integer runtime = parseRuntime(parts[3]);
	    ArrayList<String> genres = parsegenres(parts[4]);
	    Integer imbd_rating = Integer.valueOf(parts[5]);

	    
	    
	    
	    	
	    
	    String director = parts[7];
	    String star1 = parts[8];
	    String star2 = parts[9];
	    String star3 = parts[10];
	    String star4 = parts[11];
	    Casting casting = createCasting(star1, star2, star3, star4);
	    
	    Integer no_of_Votes = Integer.valueOf(parts[12]);
	    Integer gross = Integer.valueOf(parts[13]);
	    LocalDate released_Date = LocalDate.parse(parts[14], DateTimeFormatter.ofPattern("dd/MM/yyyy"));
	    if(parts[6] == "") {
	    	Random rand = new Random();
	    	Integer meta_random = rand.nextInt(40) + 60; 
	    	return new Movie(series_title, released_year, certificate, runtime, genres, imbd_rating,
		            meta_random, director, casting, no_of_Votes, gross, released_Date);}
	    Integer meta_score = Integer.valueOf(parts[6]);
	    return new Movie(series_title, released_year, certificate, runtime, genres, imbd_rating,
	            meta_score, director, casting, no_of_Votes, gross, released_Date);
	    
	    
	}

	private static ArrayList<String> parsegenres(String gen){
		String[] res = gen.split(",");
		ArrayList<String> genres = new ArrayList<>();
		for(String s:res) {
			genres.add((s));
		}
		return genres;
	}
	/*
	private static String parsegenre(String gen) {
	    String[] res = gen.split(",");
	    String genre1 = res[0].trim();
	    Genres resa;
	    if (res.length >= 2) {
	        String genre2 = res[1].trim();
	        resa = new Genres(genre1, genre2);
	        if (res.length >= 3) {
	            String genre3 = res[2].trim();
	            resa = new Genres(genre1, genre2, genre3);
	        }
	    } else {
	        resa = new Genres(genre1);
	    }
	    return resa;
	}
	*/
	private static Integer parseRuntime(String runtime){
		String[] parts = runtime.split(" ");
		Integer number = Integer.parseInt(parts[0]);
		return number;
		
	}
	
	public static Casting createCasting(String star1, String star2, String star3, String star4) {
        return new Casting(star1, star2, star3, star4);
    }
	
	
	
	private static Certificate parseCertificate ( String certificate) {
		//Certificate ti = new Certificate;
		
		if ( certificate == "PG-13" || certificate == "UA" ||certificate == "PG" ||certificate == "TV-14" ||certificate == "TV-16" ) {
			Certificate t =  Certificate.InbetweenRating;
			return t; }
		if ( certificate == "U"|| certificate == "TV-MA") {
			Certificate g =  Certificate.ADULT;
			return g; }
		if ( certificate == "A"||certificate == "R") {
			Certificate h =  Certificate.ALLPUBLICS;
			return h; }
		
		else {
			Certificate f =  Certificate.OTHER;
			
			return f;
		
		}
	}
		
	
		
			
			
	
		
		

	
	

}
	
	
	



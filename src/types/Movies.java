package types;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;
import java.util.TreeMap;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Movies  {
	
	private List<Movie> Movies;
	
	public Movies(Stream<Movie> ad) {
		if ( ad != null) {
		Movies = ad.collect(Collectors.toList());}
	}
	
	public Movies(Collection<Movie> ad) {

		Movies =new ArrayList<Movie>(ad);
	}
	public List<Movie> getMovies(){
		return new ArrayList<Movie> (Movies);
		}
	
	public Movies() {

		Movies =new ArrayList<Movie>();
	}
	@Override
	public String toString() {
		return "Movies [Movies=" + Movies + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(Movies);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Movies other = (Movies) obj;
		return Objects.equals(Movies, other.Movies);
	}
	
	public Integer getNumberMovies( ) {
		return Movies.size();
	}
	
	public void addMovie(Movie movie) {
		Movies.add(movie);
	}
	
	public void addCollectiona(Collection<Movie> t) {
		Movies.addAll(t);
	}
	
	public void removeMovie(Movie m) {
		Movies.remove(m);
	}
	//a
	// Return a Boolean value True if exist the String title given to method, if it dosen't exist it returns false value. 

	public Boolean existsMovie ( String title) {
		Boolean k = false;
		for ( Movie r :Movies) {
			if(r.getSeries_title().contains(title)) {
				k = true;
				break;
			}
		}
		return k;
	}
	//b
	//Returns the average Metascore
		public Double averageMetascore ( ) {
			double average  = 0;
			for ( Movie r : Movies ) {
				average = average + r.getMeta_score();
			}
			
			return average/Movies.size();

		}
	//c
	// Returns a List<Movie> with the movies with a higher gross than the one that it's given to the method
	public ArrayList<Movie> moreGrossThan (Integer gross ) {
		ArrayList<Movie> listmovies = new ArrayList<Movie>();
		for ( Movie r : Movies ) {
			if ( r.getGross()> gross) {
				listmovies.add(r);
			}
		}
		return listmovies;
		}
	
	//d
	//Returns a map in which the keys are the Imbd rating and the keys and the values a list of titles of movies with that Imbd rating
	public Map<Integer, List<String>> mapImbdratingmoviesnames(){
		 Map<Integer, List<String>> mapa = new HashMap<Integer, List<String>>();
		 
		 for (Movie r : Movies) {
			 if (mapa.containsKey(r.getImbd_rating())) {
				 mapa.get(r.getImbd_rating()).add(r.getSeries_title());
			 }
			 
			 else {
				 List<String> list = new ArrayList<String>();
				 list.add(r.getSeries_title());
				 mapa.put(r.getImbd_rating(),list );
			 }
		 }
		return mapa;
	
		
	}
	//e
	// Returns a map in which the key are the years in which movies were released and the values are the total
			//gross of all the movies released that year. Filter by movies released after a given year.
	public Map<Integer , Integer> mapAboveYearGross(Integer year){
		Map<Integer,Integer> mapa = new TreeMap<Integer, Integer>();
		for (Movie r : Movies) {
			if (r.getReleased_year()> year ) {
			
				 if (mapa.containsKey(r.getReleased_year())) {
					 mapa.put(r.getReleased_year(), mapa.get(r.getReleased_year()) + r.getGross() );
				 }
				 
				 else {
					 //List<String> list = new ArrayList<String>();
					 //list.add(r.getSeries_title());
					 mapa.put(r.getReleased_year(),r.getGross() );
				 }
			}
		 }
		return mapa;
	}
	
	
	//DELIVERY 3 
	//BLOCK 1
	
	//1
	//Return a Boolean value True if exist the String title given to method, if it dosen't exist it returns false value. Done with streams.
	public Boolean existMovieStreams ( String title) {
		
		return getMovies().stream().anyMatch( x ->x.getSeries_title().equals(title));
	}

	// 2
	//Gives the average Metascore . Done with streams.

	public Double averageMetascoreStream() {
		
		return getMovies().stream().mapToInt(x -> x.getMeta_score()).average().getAsDouble();
	}
	//3
	// Gives a List<Movie> with the movies with a higher gross than the one that it's given to the method. Done with streams.
	public List<Movie> moreGrossThanStream (Integer gross ){
		return getMovies().stream().filter( x -> x.getGross()> gross ).collect(Collectors.toList());
	}
	//4
	// Returns the title of the movie with biggest runtime that has been released after a given date. 

	public String maxRuntimeAfterDate ( LocalDate date) {
		Movie mov =  getMovies().stream().filter( x -> x.getReleaded_Date().isAfter(date) )
				.max(Comparator.comparing(Movie::getRuntime)).get();
		return mov.getSeries_title();
	}
	//5
	//Return a List<Movie> sorted by runtime , which contain a given genre.
	public List<Movie> moviesContainGenreSortbyRuntime ( String genre ) {
		return getMovies().stream().filter( x -> x.getGenres().contains(genre))
				.sorted(Comparator.comparing(Movie::getRuntime)).collect(Collectors.toList()) ;
	}
	//BLOCK II
	// 6
	// Returns a map in which the key are the years in which movies were released and the values are the total
	//gross of all the movies released that year. Filter by movies released after a given year. Done with Streams.
	public Map<Integer , Integer> mapYearGrossAboveYearStream(Integer year){
		
		return getMovies().stream().filter(x->x.getReleased_year() > year)
				.collect(Collectors.groupingBy(Movie:: getReleased_year, Collectors.summingInt(Movie::getGross)));
		
		
	}
	//6
	// Returns a map in which the keys are the Imbd rating and the keys and the values a list of titles of movies with that Imbd rating. Done with streams
	public Map<Integer, List<String>> mapImbdratingmoviesnamesStream() {
	    return getMovies().stream()
	            .collect(Collectors.groupingBy(Movie::getImbd_rating, Collectors.mapping(Movie::getSeries_title, Collectors.toList())));
	}
	//7
	// Returns set of years with movies above a IMBD rating.
	public Set<Integer >  setYearsaboveImbdrating( Integer Imbd){
		return getMovies().stream().filter(x->x.getImbd_rating() > Imbd)
				.map(x -> x.getReleased_year()).collect(Collectors.toSet());
	}
	
	//8
	// Returns a Map<Certificate, String> in which the keys are of type enum Certificate and the values are the titles of
	//the movies with the highest grossing with that certificate.
	public Map<Certificate, String> mapCertificateTiltewithMaxNo_Votes(){
		
		Map<Certificate, List<Movie>> dic = getMovies().stream() 
				.collect(Collectors.groupingBy(Movie::getCertificate,  Collectors.toList()));
		return dic.entrySet().stream().collect(Collectors.toMap(x->x.getKey(), x-> maxTitleByNo_Votes( x.getValue())));
				
				
	}
	
	private String maxTitleByNo_Votes (List<Movie> movs) {
		return movs.stream().max(Comparator.comparing(Movie::getNo_of_Votes)).map(Movie::getSeries_title).orElse(null);
	}
	// 9
	//Returns a map in which the keys are certificates and values are a list of directors sorted by their IMBD rating

	public Map<Certificate, List<String>> mapCertificateDirectorSortByImbdrating (){
		Map<Certificate, List<Movie>> dic = getMovies().stream() 
				.collect(Collectors.groupingBy(Movie::getCertificate,  Collectors.toList()));
		return dic.entrySet().stream().collect(Collectors.toMap(x->x.getKey(), x-> directorSortByImbdrating( x.getValue())));
	}
	
	private List<String> directorSortByImbdrating (List<Movie> movs) {
		return movs.stream().sorted(Comparator.comparing(Movie::getImbd_rating)).map(Movie::getDirector).collect(Collectors.toList());
	}
	// 10
	// Makes a Map in which the keys are the titles of the movies and the values are the IMBD rating. Then returns the Entry<String, Integer> WIth the director and their movie with highest IMBD rating. 
	public Entry<String, Integer> directorHighestImbd () {
		Map<String, List<Movie>> dic = getMovies().stream() 
				.collect(Collectors.groupingBy(Movie::getDirector,  Collectors.toList()));
		Map<String, Integer> mapt = dic.entrySet().stream()
				.collect(Collectors.toMap(x->x.getKey(), x-> maxImbdrating( x.getValue())));
		return mapt.entrySet().stream().max(Comparator.comparing(x->x.getValue())).orElse(null);
	}
	private Integer maxImbdrating (List<Movie> movs) {
		return movs.stream().max(Comparator.comparing(Movie::getImbd_rating)).map(Movie::getImbd_rating).orElse(null);
	}
	
	
	
	
	
}	
	
	
	
	
	
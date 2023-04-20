package types;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.TreeMap;
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
	
	public ArrayList<Movie> moreGrossThan (Integer gross ) {
		ArrayList<Movie> listmovies = new ArrayList<Movie>();
		for ( Movie r : Movies ) {
			if ( r.getGross()> gross) {
				listmovies.add(r);
			}
		}
		return listmovies;
		}
	
	public Double averageMetascore ( ) {
		double average  = 0;
		for ( Movie r : Movies ) {
			average = average + r.getMeta_score();
		}
		
		return average/Movies.size();

	}
		
		
	
		
	
	
	
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
	
	
	

	

	
}

	
	
	
	
	
	
	
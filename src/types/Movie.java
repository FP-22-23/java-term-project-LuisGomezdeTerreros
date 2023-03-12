package types;

import java.time.LocalDate;
//import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Objects;

import utils.Checkers;

public class Movie {
	
	private String series_title;
	private Integer released_year;
	private Certificate certificate;
	private Integer runtime;
	private ArrayList<String> genres;
	private Integer imbd_rating;
	private Integer meta_score ;
	private String director;
	private Casting casting;
	
	private Integer no_of_Votes;
	private Double gross;
	private LocalDate releaded_Date;
	
	
	public Movie(String series_title, Integer released_year, Certificate certificate, Integer runtime, ArrayList<String> genres,
			 Integer imbd_rating, Integer meta_score, String director,
			 Integer no_of_Votes, Double gross, LocalDate releaded_Dat, Casting casting) {
		super();
		this.series_title = series_title;
		this.released_year = released_year;
		this.certificate = certificate;
		this.runtime = runtime;
		this.genres = genres; 
		this.meta_score = meta_score;
		this.director = director;
		
		this.no_of_Votes = no_of_Votes;
		this.gross = gross;
		
		this.releaded_Date = releaded_Date;
		this.casting = casting;
		if (imbd_rating < 10 ) {
			this.imbd_rating = imbd_rating * 10;}
		else {this.imbd_rating = imbd_rating;}
		Checkers.check("The rating has to be between 0 and a 100, ",0 <this.imbd_rating && this.imbd_rating < 100 );
		Checkers.check("The rating has to be between 0 and a 100, ",0 < this.meta_score && this.meta_score < 100 );

	}
	public Movie(String series_title, Integer runtime,
			 Integer imbd_rating, Integer meta_score, Integer no_of_Votes, Double gross) {
		this.series_title = series_title;
		this.released_year = null;
		this.certificate = null;
		this.runtime = runtime;
		this.genres = null; 

		this.meta_score = meta_score;
		this.director = null;
		
		this.no_of_Votes = no_of_Votes;
		this.gross = gross;
		this.casting = null;

		this.releaded_Date = null;
		if (imbd_rating < 10 ) {
			this.imbd_rating = imbd_rating * 10;}
		else {this.imbd_rating = imbd_rating;}
		Checkers.check("The rating has to be between 0 and a 100, ",0 <this.imbd_rating && this.imbd_rating < 100 );
		Checkers.check("The rating has to be between 0 and a 100, ",0 < this.meta_score && this.meta_score < 100 );

	}
	

	public String getSeries_title() {
		return series_title;
	}

	public void setSeries_title(String series_title) {
		this.series_title = series_title;
	}

	public Integer getReleased_year() {
		return released_year;
	}

	public void setReleased_year(Integer released_year) {
		this.released_year = released_year;
	}

	public Certificate getCertificate() {
		return certificate;
	}

	public void setCertificate(Certificate certificate) {
		this.certificate = certificate;
	}

	public Integer getRuntime() {
		return runtime;
	}

	public void setRuntime(Integer runtime) {
		this.runtime = runtime;
	}

	
	public Integer getImbd_rating() {
		return imbd_rating;
	}

	public void setImbd_rating(Integer imbd_rating) {
		Checkers.check("The rating has to be between 0 and a 100, ",0 <this.imbd_rating && this.imbd_rating < 100 );
		if (imbd_rating < 10 ) {
			this.imbd_rating = imbd_rating * 10;}
		else {this.imbd_rating = imbd_rating;}
	}



	public Integer getMeta_score() {
		return meta_score;
	}

	public void setMeta_score(Integer meta_score) {
		Checkers.check("The rating has to be between 0 and a 100, ",0 < this.meta_score && this.meta_score < 100 );

		this.meta_score = meta_score;
	}

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}


	public Integer getNo_of_Votes() {
		return no_of_Votes;
	}

	public void setNo_of_Votes(Integer no_of_Votes) {
		this.no_of_Votes = no_of_Votes;
	}

	public Double getGross() {
		return gross;
	}

	public void setGross(Double gross) {
		this.gross = gross;
	}

	public LocalDate getReleaded_Date() {
		return releaded_Date;
	}

	public void setReleaded_Date(LocalDate releaded_Date) {
		this.releaded_Date = releaded_Date;
	}
	
	
	
	
	public Integer averagescore ( ) {
		Integer t = (imbd_rating * meta_score)/2;
		return t ;
	}

	public Casting getCasting() {
		return casting;
	}
	public void setCasting(Casting casting) {
		this.casting = casting;
	}
	public ArrayList<String> getGenres() {
		return genres;
	}
	public void setGenres(ArrayList<String> genres) {
		this.genres = genres;
	}
	@Override
	public int hashCode() {
		return Objects.hash(director, released_year, series_title);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Movie other = (Movie) obj;
		return Objects.equals(director, other.director) && Objects.equals(released_year, other.released_year)
				&& Objects.equals(series_title, other.series_title);
	}

	@Override
	public String toString() {
		return "Movie [series_title=" + series_title + ", released_year=" + released_year + ", certificate="
				+ certificate + ", runtime=" + runtime + ", genres=" + genres + ", imbd_rating=" + imbd_rating
				+ ", meta_score=" + meta_score + ", director=" + director + ", casting=" + casting + ", no_of_Votes="
				+ no_of_Votes + ", gross=" + gross + ", releaded_Date=" + releaded_Date + "]";
	}
	

	public int compareTo(Movie another) {
        int compareValue = getImbd_rating().compareTo(another.getImbd_rating());
        if (compareValue == 0) {
        	compareValue = getMeta_score().compareTo(another.getMeta_score());
        	if (compareValue == 0) {
        		return compareValue = getNo_of_Votes().compareTo(another.getNo_of_Votes());
        	}
        }
        return compareValue;
        
    }
	public void  addlist(  String star1,String star2,String star3,String star4 ) {

		getGenres().add(  star1    );
		getGenres().add(  star2    );
		getGenres().add(  star3    );
		getGenres().add(  star4    );
		
		
	}

	
	
	
	
	

}





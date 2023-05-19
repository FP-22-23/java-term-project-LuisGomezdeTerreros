java-term-project-LuisGomezdeTerreros     
java-term-project-LuisGomezdeTerreros created by GitHub Classroom    
# Project of the Second Term Fundamentals of Programming  (Curso <22>/<23>)    


Autor: Luis Gómez de Terreros Oramas    uvus: pwj3044   

This is a dataset about the 1000 best rated IMBD movies.   

## Poyects Folder structure:

* **/src**    
      * **/types**: Package containing the types of the project.    
      * **/tests**: Package containing the test classes of the project.                
      * **/utils:** Package containing the utility classes.        
* **/data** :    
      * **ll.csv**: The data set of the movies                      
  
## *Dataset structure*
All columns:
* **<column 0>** of type String series_title. Is the title of the film.                  
* **<column 1>** of type Integer released_year. Year in which the film was realeased.                 
* **<column 2>** of type Certificate certificate . Is the age certification for the movie.                 
* **<column 3>** of type Integer runtime . The runtime of the movie in minutes.                           
* **<column 4>** of type ArrayList(String) genres . A list of the genres of the movie, it goes from 1 to 3 genres.                   
* **<column 5>** of type Integer, imbd_rating  . Is the rating that IMBD gave the movie, the dataset is sorted through this.               
* **<column 6>** of type Integer, meta_score  . Is an alternative score from the page Meta Critic,         
* **<column 7>** of type String, director   . The director of the movie.                
* **<column 8>** of type String ,star1 . The main actor.               
* **<column 9>** of type String, star2 . An actor.               
* **<column 10>** of type String, star3 . An actor.                       
* **<column 11>** of type String, star4 . An actor.                           
* **<column 12>** of type Integer, no_of_Votes . How many people vote in the IMBD rating.          
* **<column 13>** of type Integer, gross  . The gross made from the movie.                     
* **<column 14>** of type LocalDate, releaded_Date . Is the day/month/year of the release. The year is the same as in released_year and day/month are randomized          


## Implementet types

The types implemented in the project

### Base Type - Movie 

- _series_title_ , of type String, consultable y modifiable. Is the title of the film.                
- _released_year_ , of type Integer, consultable y modifiable. Year in which the film was realeased.       
- _certificate_ , of type Certificate, consultable y modifiable  .This enum type has 4 differents enums  InbetweenRating, ADULT, ALLPUBLICS, OTHER that will be assigned depending on the certificate that the movie has.                            
- _runtime_ , of type Integer, consultable y modifiable. The runtime of the movie in minutes.             
- _genres_ , of type ArrayList(String), consultable y modifiable. A list of the genres of the movie.      
- _imbd_rating_ , of type Integer, consultable y modifiable. Is the rating that IMBD gave the movie.      
- _meta_score_ , of type Integer, consultable y modifiable. Is an alternative score from the page Meta Critic.                         
- _director_ , of type String,  consultable y modifiable. The director of the movie.                      
- _no_of_Votes_ , of type Integer, consultable y modifiable. How many people vote in the IMBD rating.    
- _gross_ , of type Integer,  consultable y modifiable.  The gross made from the movie.           
- _releaded_Date_, of type LocalDate,  consultable y modifiable. Is the day/month/year of the release.     
- _casting_ , of type Casting, consultable y modifiable . Is a record formed by the 4 actors Casting(String star1,String star2,String star3,String star4 )  

**Constructors**

- C1: Gets all basic properties.   
- C2: Get the properties (String series_title, Integer runtime, Integer imbd_rating, Integer meta_score, Integer no_of_Votes, Double gross)    

**Restictions**:    

- R1" The meta_score has to be between 0 and a 100, "     
- R2 "The imbd_rating has to be between 0 and a 100, "     

**Equality criteria:**

- if the director, released_year, series_title are equal. They are equal.     

**Ordination criteria:**    
 
- Firts compares the imbd_rating, then the meta_score and then the no_of_votes.        

**Auxiliary type:**     

- **Certificate.java** - Is an Enum type of rating certificates of the movies.       
- **Casting.java** - Is a Record with the 4 more important actors.     

### Factory - MovieFactory   

- Factory class for building Movie objects:

-_readMovies (String filename )_ Creates an object of type Movies from the information collected in the csv file, whose path is given as a parameter.        
-_parseLine (String s)_ Receives a type String and does the parse returning a type Movie.       
-_parsegenres ( String gen)_ parses the genres, separaiting them by commas and adding them to a list returning a List<String>               
-_parseRuntime (String runtime)_ parses the runtime, taking out the " min" and converting it to a Intger.          
-_parseCertificate ( String certificate)_  parses the certificates, depending on the String it will assign one of the four different certificates that are.                     

### Type Container - Movies

**Properties:**   
- **List<Movie> Movies**,  consultable and modifiable.                    
  
**Constructors:**            
  - C1: Default constructor. Create a Movies object with no saved games.                      
  - C2: Constructor with a parameter of type Collection<Movie>. Creates an object of type Movies with the movies included in the collection given as a parameter.       
  - C3: Constructor with a parameter of type Stream<Movie>. Creates a Movies object with the movies included in the given Stream   
   
***Equality criteria**.            
-They are equal if they have the same movies.        
**Other operations**          
- _Integer getNumberMovies( )_ Gives the number of number of Movie in movies.     
- _void addMovie(Movie movie)_ Adds a movie to movies.        
- _addCollectiona(Collection<Movie> t) Adds a elemento of type Collection<Movie> to the container.        
- _void removeMovie(Movie m)_ Removes an element of type Movie from the container.      
- _Boolean existsMovie ( String title)_ Returns a Boolean value True if exist the String title given to method, if it dosen't exist it returns a false value.        
- _Double averageMetascore ( )_ Returns the average Metascore.       
- _ArrayList<Movie> moreGrossThan (Integer gross )_  Returns a List<Movie> with the movies with a higher gross than the one that it's given to the method.      
- _Map<Integer, List<String>> mapImbdratingmoviesnames()_ Returns a map in which the keys are the Imbd rating and the values and the values a list of titles of movies with that Imbd rating.      
- _Map<Integer , Integer> mapAboveYearGross(Integer year)_  Returns a map in which the key are the years in which movies were released and the values are the gross of all the movies released that year. Filter by movies released after a given year.      
- _Boolean existMovieStreams ( String title)_ Returns a Boolean value True if exist the String title given to method, if it dosen't exist it returns false value. Done with streams.      
- _Double averageMetascoreStream()_ Returns the average Metascore . Done with streams.     
- _List<Movie> moreGrossThanStream (Integer gross )_ Returns a List<Movie> with the movies with a higher gross than the one that it's given to the method. Done with streams.     
- _String maxRuntimeAfterDate ( LocalDate date)_  Returns the title of the movie with biggest runtime that has been released after a given date.      
- _List<Movie> moviesContainGenreSortbyRuntime ( String genre )_ Return a List<Movie> sorted by runtime , which contain a given genre.     
- _ Map<Integer , Integer> mapYearGrossAboveYearStream(Integer year)_  Returns a map in which the key are the years in which movies were released and the values are the total gross of all the movies released that year. Filter by movies released after a given year. Done with Streams.      
- _ Map<Integer, List<String>> mapImbdratingmoviesnamesStream()_ Returns a map in which the keys are the Imbd rating and the keys and the values a list of titles of movies with that Imbd rating. Done with streams.       
- _Set<Integer >  setYearsaboveImbdrating( Integer Imbd)_ Returns set of years with movies above a IMBD rating.   
- _Map<Certificate, String> mapCertificateTiltewithMaxNo_Votes()_  Returns a Map<Certificate, String> in which the keys are of type enum Certificate and the values are the titles of the movies with the highest grossing with that certificate.    
- _Map<Certificate, List<String>> mapCertificateDirectorSortByImbdrating ()_  Returns a map in which the keys are certificates and values are a list of directors sorted by their IMBD rating
- _Entry<String, Integer> directorHighestImbd_  Makes a Map in which the keys are the titles of the movies and the values are the IMBD rating. Then returns the Entry<String, Integer> WIth the director and their movie with highest IMBD rating.         

     
     
     
     
     

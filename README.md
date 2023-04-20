java-term-project-LuisGomezdeTerreros     
java-term-project-LuisGomezdeTerreros created by GitHub Classroom    
### Proyecto del Segundo Cuatrimestre Fundamentos de Programación (Curso <22>/<23>)    


Autor: Luis Gómez de Terreros Oramas      

This is a dataset about the 1000 best rated IMBD movies.   

## Poyects Folder structure      

/src    
      /types: Package containing the types of the project.    
      /tests: Package containing the test classes of the project.                
      /utils: Package containing the utility classes.        
/data : 
  ll.csv: The data set of the movies                      
  
# Dataset structure

<column 0> of type String series_title. Is the title of the film.                  
<column 1> of type Integer released_year. Year in which the film was realeased.                 
<column 2> of type Certificate certificate . Is the age certification for the movie.                         
<column 3> of type Integer runtime . The runtime of the movie in minutes.                               
<column 4> of type ArrayList(String) genres . A list of the genres of the movie, it goes from 1 to 3 genres.                   
<column 5> of type Integer imbd_rating  . Is the rating that IMBD gave the movie, the dataset is sorted through this.               
<column 6> of type Integer meta_score  . Is an alternative score from the page Meta Critic,                   
<column 7> of type String director   . The director of the movie.                
<column 8> of type String star1 . The main actor.               
<column 9> of type String star2 . An actor.               
<column 10> of type String star3 . An actor.                       
<column 11> of type String star4 . An actor.                           
<column 12> of type Integer> no_of_Votes . How many people vote in the IMBD rating          
<column 13> of type Integer gross  . The gross made from the movie                     
<column 14> of type LocalDate releaded_Date . Is the day/month/year of the release. The year is the same as in released_year and day/month are randomized          


# Implementet types

type

property 1 , of type String, series_title  consultabol y modifiable                
property 2 , of type Integer released_year   consultabol y modifiable              
property 3 , of type Certificate certificate. This enum type has 4 differents enums  InbetweenRating, ADULT, ALLPUBLICS, OTHER that will be assigned depending on the certificate that the movie has.  consultabol y modifiable                          
property 4 , of type Integer runtime  consultabol y modifiable                       
property 5 , of type ArrayList(String) genres  consultabol y modifiable                    
property 6 , of type Integer imbd_rating   consultabol y modificabol                  
property 7 , of type Integer meta_score  consultabol y modifiable                 
property 8 , of type String director  consultabol y modifiable                              
property 9 , of type Integer no_of_Votes  consultabol y modifiable                    
property 10 , of type Integer gross  consultabol y modifiable           
property 11, of type LocalDate releaded_Date  consultabol y modifiable                   
property 12 , of type Casting casting . Is a record formed by the 4 actors Casting(String star1,String star2,String star3,String star4 )  consultabol y modifiable  

## Constructors

C1: Gets all the properties     
C2: Get the properties (String series_title, Integer runtime, Integer imbd_rating, Integer meta_score, Integer no_of_Votes, Double gross)    

## Restictions    

R1" The meta_score has to be between 0 and a 100, "     
R2 "The imbd_rating has to be between 0 and a 100, "     

## Equality criteria:    

if the director, released_year, series_title are equal. They are equal.     

## Ordination criteria:      
 
Firts compares the imbd_rating, then the meta_score and then the no_of_votes.        

## Auxiliary type:     

Certificate.java - Is an Enum type of rating certificates of the movies.       
Casting.java - Is a Record with the 4 more important actors.     

## Factory - MovieFactory   

Factory class for building Movie objects.

readMovies (String filename ) Creates an object of type Movies from the information collected in the csv file, whose path is given as a parameter.    
parseLine (String s) does the parse of the line.    
parsegenres ( String gen) parses the genres.      
parseRuntime (String runtime) parses the runtime  .  
parseCertificate ( String certificate)  parses the certificates   

## Type Container - Movies

### Properties:   
List<Movie> Movies consultabol, . List of movies.
  
### Constructors:
  C1: Default constructor. Create a Movies object with no saved games.     
  C2: Constructor with a parameter of type Collection<Movie>. Creates an object of type Movies with the movies included in the collection given as a parameter.    
  C3: Constructor with a parameter of type Stream<Movie>. Creates a Movies object with the movies included in the given Stream       
### Equality criteria. They are equal if they have the same properties.
### Other operations



















  

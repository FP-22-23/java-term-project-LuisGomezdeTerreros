java-term-project-LuisGomezdeTerreros     
java-term-project-LuisGomezdeTerreros created by GitHub Classroom    
### Proyecto del Segundo Cuatrimestre Fundamentos de Programación (Curso <22>/<23>)    


Autor: Luis Gómez de Terreros Oramas      

This is a dataset about the 1000 best rated IMBD movies.   

## Poyects Folder structure      

/src    
  /types
      Movie.java
      Certificate.java
      TestMovie.java
      Casting.java
  /utils
    Checkers.java
/data
  IMBD_Dataset.csv
  
# Dataset structure

<column 1> of type <String> series_title     
<column 2> of type <Integer> released_year   
<column 3> of type <Certificate> certificate   
<column 4> of type <Integer> runtime   
<column 5> of type ArrayList<String> genres   
<column 6> of type <Integer> imbd_rating   
<column 7> of type <Integer> meta_score   
<column 8> of type <String> director   
<column 9> of type <Integer> no_of_Votes   
<column 10> of type <Double> gross   
<column 11> of type <LocalDate> releaded_Date   
<column 12> of type <String> casting   


# Implementet types

type

property 1 , of type <String>, series_title  consultabol y modificabol   
property 2 , of type <Integer> released_year   consultabol y modificabol   
property 3 , of type <Certificate> certificate  consultabol y modificabol   
property 4 , of type <Integer> runtime  consultabol y modificabol    
property 5 , of type ArrayList<String> genres  consultabol y modificabol   
property 6 , of type <Integer> imbd_rating   consultabol y modificabol   
property 7 , of type <Integer> meta_score  consultabol y modificabol    
property 8 , of type <String> director  consultabol y modificabol   
property 9 , of type <Integer> no_of_Votes  consultabol y modificabol    
property 10 , of type <Double> gross  consultabol y modificabol    
property 11, of type <LocalDate> releaded_Date  consultabol y modificabol    
property 12 , of type <String> casting  consultabol y modificabol 
property 13 , of type <Double> averagescore  consultabol y modificabol    

# Constructors

C1: Gets all the properties     
C2: Get the properties (String series_title, Integer runtime, Integer imbd_rating, Integer meta_score, Integer no_of_Votes, Double gross)    

# Restictions    

R1" The meta_score has to be between 0 and a 100, "     
R2 "The imbd_rating has to be between 0 and a 100, "     

# Equality criteria:    

if the director, released_year, series_title are equal. They are equal.     

Ordination criteria:      
 
Firts compares the imbd_rating, then the meta_score and then the no_of_votes.        

# Auxiliary type:     

Certificate.java - Is an Enum type of rating certificates of the movies.       
Casting.java - Is a Record with the 4 more important actors.     
















  

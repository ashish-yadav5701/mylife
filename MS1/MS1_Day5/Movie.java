package MS1_Day5;

public class Movie implements Comparable<Movie>{
    private double rating;
    private String name;
    private int year;
       @Override
       public int compareTo(Movie m) {
           return this.getName().compareTo(m.getName());
       }
       public Movie(String name , double rating, int year){
             this.name=name;
             this.year=year;
             this.rating=rating;
       }
       public double getRating(){return rating;}
       public int getYear(){return year;}
       public String getName(){return name;}
   
}


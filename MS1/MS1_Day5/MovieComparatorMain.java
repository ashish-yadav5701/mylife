package MS1_Day5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
public class MovieComparatorMain{
    public static void main(String[] args) {
        ArrayList<MovieComparator> al=new ArrayList<MovieComparator>();
        al.add(new MovieComparator("abc",3.4,2000));
        al.add(new MovieComparator("def",4.4,2010));
        al.add(new MovieComparator("ghi",4.0,2019));
        al.add(new MovieComparator("jkl",3.9,2013));
        al.add(new MovieComparator("dfi",2.9,2013));
        Collections.sort(al, new RatingCompare());
        for(MovieComparator m:al){
            System.out.println(m.getName()+"||"+m.getYear()+"||"+m.getRating());
        }

    }
}
class MovieComparator {
    private double rating;
    private String name;
    private int year;
       
       public MovieComparator(String name , double rating, int year){
             this.name=name;
             this.year=year;
             this.rating=rating;
       }
       public double getRating(){return rating;}
       public int getYear(){return year;}
       public String getName(){return name;}
   
}

class RatingCompare implements Comparator<MovieComparator>{

    @Override
    public int compare(MovieComparator m1, MovieComparator m2) {
        // TODO Auto-generated method stub
        if(m1.getRating()<m2.getRating()){
            return -1;
        }
        else if(m1.getRating()>m2.getRating()){
            return 1;
        }
        else{
            return 0;
        }
    }
    
}

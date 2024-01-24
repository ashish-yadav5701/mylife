package MS1_Day5;

import java.util.ArrayList;
import java.util.Collections;

public class ComparableMain {
    public static void main(String[] args) {
        ArrayList<Movie> al=new ArrayList<Movie>();
        al.add(new Movie("abc",3.4,2000));
        al.add(new Movie("def",4.4,2010));
        al.add(new Movie("ghi",4.0,2019));
        al.add(new Movie("jkl",3.9,2013));
        al.add(new Movie("dfi",2.9,2013));
        Collections.sort(al);
        for(Movie m:al){
            System.out.println(m.getName()+"||"+m.getYear()+"||"+m.getRating());
        }

    }
}

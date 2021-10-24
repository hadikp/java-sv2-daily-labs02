package day05;

public class MovieMain {
    public static void main(String[] args) {
        Movie movie1 = new Movie("Csillagok háborúja", 1974);
        System.out.println(movie1.rating(4));
        System.out.println(movie1.rating(5));

        Viewer viewer = new Viewer();
        viewer.watchMovie(movie1, 1);
        System.out.println(movie1.getAverageRate());


    }
}

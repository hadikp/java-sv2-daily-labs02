package day05;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Movie {
    private String title;
    private int productYear;
    private double averageRate; //1-5 egész szám

    public Movie(String title, int productYear) {
        this.title = title;
        this.productYear = productYear;
    }

   public double rating(int rating) {
    List<Integer> rates = new ArrayList(Arrays.asList(2, 3, 4, 5, 5, 4, 3));
    rates.add(rating);
    double sum = 0;
        for (int rate: rates) {
            sum += rate;
        }
        averageRate = sum  / rates.size();
        return averageRate;
    }

    public double getAverageRate() {
        return averageRate;
    }
}

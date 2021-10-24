package day04;

public class GasStation {
    private double price; // Ft/liter

    public GasStation(double price) {
        this.price = price;
    }

    public double fuelling(Car car) {
        return car.averageConsumption() * price * car.getDistanceKm() / 100;    // Ft / 100km

    }
}

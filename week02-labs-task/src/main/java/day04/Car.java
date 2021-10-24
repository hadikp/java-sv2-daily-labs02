package day04;

public class Car {
    private double tankL;
    private double distanceKm;

    public double averageConsumption() {
        return 100 / distanceKm * tankL;
    }

    public double getTankL() {
        return tankL;
    }

    public double getDistanceKm() {
        return distanceKm;
    }

    public void setTankL(double tankL) {
        this.tankL = tankL;
    }

    public void setDistanceKm(double distanceKm) {
        this.distanceKm = distanceKm;
    }
}

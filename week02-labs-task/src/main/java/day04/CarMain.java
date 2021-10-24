package day04;

import java.util.Scanner;

public class CarMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Car car = new Car();
        System.out.println("Az autó egy tankkal megtett kilométere: ");
        double distanceKm = sc.nextDouble();
        System.out.println("Az autó tank mérete: ");
        double tankL = sc.nextDouble();
        car.setDistanceKm(distanceKm);
        car.setTankL(tankL);
        System.out.println("A kocsi átlagfogyasztása: " + car.averageConsumption());
        GasStation fuelling = new GasStation(500);
        System.out.println("A benzinkúton fizetünk: " + Math.round(fuelling.fuelling(car))  + " Ft-ot");

    }
}

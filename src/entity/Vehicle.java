package entity;

import java.text.DecimalFormat;

public class Vehicle {
    private int passengers;
    private int fuelcap;
    private double lkm;

    public Vehicle(int passengers, int fuelcap, double lkm) {
        this.passengers = passengers;
        this.fuelcap = fuelcap;
        this.lkm = lkm;
    }

    public void range(int fuelcap, double lkm) {
        System.out.println(new DecimalFormat("#").format(fuelcap / lkm * 100));
    }
    public int range(double lkm, int fuelcap) {
        return (int) (fuelcap / lkm * 100);
    }

    public double howMuch(int km, double lkm) {
        return Double.parseDouble(new DecimalFormat("#.##").format(km * lkm / 100));
    }
    public int getPassengers() {
        return passengers;
    }

    public void setPassengers(int passengers) {
        this.passengers = passengers;
    }

    public int getFuelcap() {
        return fuelcap;
    }

    public void setFuelcap(int fuelcap) {
        this.fuelcap = fuelcap;
    }

    public double getLkm() {
        return lkm;
    }

    public void setLkm(double lkm) {
        this.lkm = lkm;
    }
}

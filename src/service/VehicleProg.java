package service;

import entity.Vehicle;

import java.text.DecimalFormat;
import java.util.Scanner;

public class VehicleProg {
    private Vehicle miniVan = new Vehicle(7, 75, 10);
    private Vehicle sportsCar = new Vehicle(2, 60, 23);

    public void printZad11() {
        System.out.println("Zasięg pojazdu MiniVan przy pełnym zbiorniku wynosi: " + miniVan.getFuelcap() / miniVan.getLkm() * 100 + "km");
        System.out.println("Zasięg pojazdu SportsCar przy pełnym zbiorniku wynosi: " + new DecimalFormat("#.#").format(sportsCar.getFuelcap() / sportsCar.getLkm() * 100) + "km");
        System.out.println("");
    }

    public void printZad12() {
        System.out.println("Minivan przewozi " + miniVan.getPassengers() + " osób.");
        System.out.printf("Zasięg (km): "); miniVan.range(miniVan.getFuelcap(), miniVan.getLkm());
        System.out.println("Auto sportowe przewozi " + sportsCar.getPassengers() + " osób.");
        System.out.printf("Zasięg (km): "); sportsCar.range(sportsCar.getFuelcap(), sportsCar.getLkm());
        System.out.println("");
    }

    public void printZad13() {
        System.out.println("Minivan przewozi " + miniVan.getPassengers() + " osób na odlgełość do " + miniVan.range(miniVan.getLkm(), miniVan.getFuelcap()) + " kilometrów");
        System.out.println("Auto sportowe przewozi " + sportsCar.getPassengers() + " osób na odlgełość do " + sportsCar.range(sportsCar.getLkm(), sportsCar.getFuelcap()) + " kilometrów");
        System.out.println("");
    }

    public void printZad14() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ile kilomentrów chcesz pokonać?");
        int km = scanner.nextInt();
        System.out.println("Minivan potrzebuje " + miniVan.howMuch(km, miniVan.getLkm()) + " litrów paliwa.");
        System.out.println("Auto sportowe potrzebuje " + sportsCar.howMuch(km, sportsCar.getLkm()) + " litrów paliwa.");
        System.out.println("");
    }
}

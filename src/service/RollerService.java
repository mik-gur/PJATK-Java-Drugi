package service;

import entity.Roller;

import java.text.DecimalFormat;
import java.util.Scanner;

public class RollerService {

    private Roller roller = new Roller();
    public void print() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj promień walca: ");
        roller.setRadius(scanner.nextDouble());
        System.out.println("Podaj wysokość walca: ");
        roller.setHeight(scanner.nextDouble());
        System.out.println("Pojemność walca wynosi " + new DecimalFormat("#.##").format(volume(roller.getRadius(), roller.getHeight())));
        System.out.println("");
    }

    private double volume(double radius, double height) {
        return Math.PI*radius*radius*height;
    }
}

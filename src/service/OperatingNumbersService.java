package service;

import entity.OperatingNumbers;

import java.text.DecimalFormat;

public class OperatingNumbersService {

    private OperatingNumbers operatingNumbers = new OperatingNumbers();
    public void print() {
        operatingNumbers.setX(5);
        operatingNumbers.setY(10);

        System.out.println("x = " + operatingNumbers.getX());
        System.out.println("y = " + operatingNumbers.getY());
        System.out.println("++x = " + operatingNumbers.incrementX(operatingNumbers.getX()));
        System.out.println("y++ = " + operatingNumbers.incrementY(operatingNumbers.getY()));
        System.out.println("x = " + operatingNumbers.getX());
        System.out.println("y = " + operatingNumbers.getY());
        System.out.println("~~~~~~~~~~~~~~~~~");
        operatingNumbers.setW(33.5);
        operatingNumbers.setZ(17.3);
        System.out.println("w = " + operatingNumbers.getW());
        System.out.println("z = " + operatingNumbers.getZ());
        System.out.println("w + z = " + sum(operatingNumbers.getW(), operatingNumbers.getZ()));
        System.out.println("w - z = " + subtraction(operatingNumbers.getW(), operatingNumbers.getZ()));
        System.out.println("w * z = " + new DecimalFormat("#.##").format(multiplication(operatingNumbers.getW(), operatingNumbers.getZ())));
        System.out.println("w / z = " + new DecimalFormat("#.########").format(divide(operatingNumbers.getW(), operatingNumbers.getZ())));
        System.out.println("w % z = " + divisionRest(operatingNumbers.getW(), operatingNumbers.getZ()));
        System.out.println("~~~~~~~~~~~~~~~~~");
        operatingNumbers.setM(3);
        operatingNumbers.setN(17);
        operatingNumbers.setO(10);
        System.out.println("m = " + operatingNumbers.getM());
        System.out.println("n = " + operatingNumbers.getN());
        System.out.println("o = " + operatingNumbers.getO());
        System.out.println("m < n = " + higherThan(operatingNumbers.getM(), operatingNumbers.getN()));
        System.out.println("m > o = " + smallerThan(operatingNumbers.getM(), operatingNumbers.getO()));
        System.out.println("n " + "\u2264" + " o = " + higherOrEquals(operatingNumbers.getN(), operatingNumbers.getO()));
        System.out.println("m " + "\u2265" + " n = " + smallerOrEquals(operatingNumbers.getM(), operatingNumbers.getN()));
        System.out.println("n " + "\u003D" + "\u003D" + " o = " + equal(operatingNumbers.getN(), operatingNumbers.getO()));
        System.out.println("m " + "\u2260" + " o = " + otherThan(operatingNumbers.getM(), operatingNumbers.getO()));
        System.out.println("~~~~~~~~~~~~~~~~~");
        System.out.println("");
    }
    public double sum(double w, double z) {
        return w + z;
    }

    public double subtraction(double w, double z) {
        return w - z;
    }

    public double multiplication(double w, double z) {
        return w * z;
    }

    public double divide(double w, double z) {
        return w / z;
    }

    public double divisionRest(double w, double z) {
        return w % z;
    }

    public boolean higherThan(int m, int n) {
        return m < n;
    }

    public boolean smallerThan(int m, int o) {
        return m > o;
    }

    public boolean higherOrEquals(int n, int o) {
        return n <= o;
    }

    public boolean smallerOrEquals(int m, int n) {
        return m >= n;
    }

    public boolean equal(int n, int o) {
        return n == o;
    }

    public boolean otherThan(int m, int o) {
        return m != o;
    }
}

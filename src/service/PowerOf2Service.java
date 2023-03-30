package service;

import entity.PowerOf2;

import java.text.DecimalFormat;

public class PowerOf2Service {

    private PowerOf2 powerOf2 = new PowerOf2();
    public void printPowerOf2() {
        powerOf2.setNumber(2);
        for (int i = 0; i <= 14; i++) {
            System.out.println(powerOf2.getNumber() + " do potęgi " + i + " wynosi: " + new DecimalFormat("#").format(Math.pow(powerOf2.getNumber(), i)));
        }
        System.out.println("");
    }
}

package service;

import entity.TwoStringsChecker;

public class TwoStringsCheckerService {
    private TwoStringsChecker twoStringsChecker = new TwoStringsChecker();
    public void print() {
        twoStringsChecker.setStr1("napis");
        twoStringsChecker.setStr2("napis");

        System.out.println("str1: " + twoStringsChecker.getStr1());
        System.out.println("str2: " + twoStringsChecker.getStr2());
        System.out.println("str 1 == str2: ");
        System.out.println(twoStringsChecker.getStr1() == twoStringsChecker.getStr2());
        System.out.println("str1.equals(str2): " + twoStringsChecker.getStr1().equals(twoStringsChecker.getStr2()));
        System.out.println("");
    }
}

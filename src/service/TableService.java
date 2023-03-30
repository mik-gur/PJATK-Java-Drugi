package service;

import entity.Table;

public class TableService {

    private Table table = new Table();

    public void print() {
        int[][] array = {{0, 10, 20}, {1, 11, 21}, {2, 12, 22}};
        table.setTable(array);
        printTable(table.getTable());
        changeRows(table.getTable());
        System.out.println("");
        printTable(table.getTable());
        System.out.println("");
    }
    public void changeRows(int[][] table) {
        int[] temp = table[0];
        table[0] = table[2];
        table[2] = temp;
    }

    public void printTable(int[][] table) {
        for (int[] ints : table) {
            for (int anInt : ints) {
                System.out.print(anInt + " ");
            }
            System.out.println();
        }
    }
}
